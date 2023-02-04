package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeLogin {
	public static void main(String[] args) {
		//01: Open Browser
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//02: Maximize the Browser Window
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//03: Enter the main URL of the application
		String exectedLonginPageTitle="actiTIME - Login";
		System.out.println("exectedLonginPageTitle ="+exectedLonginPageTitle);
		String actualLoginPageTile=driver.getTitle();
		System.out.println("actualLoginPageTile ="+actualLoginPageTile);
		String exectedLoginPageUrl="https://demo.actitime.com/login.do";
		System.out.println("exectedLoginPageUrl ="+exectedLoginPageUrl);
		String actualLoginPageUrlString=driver.getCurrentUrl();
		System.out.println("actualLoginPageUrlString ="+actualLoginPageUrlString);
		
		if (actualLoginPageTile.equals(exectedLonginPageTitle) && actualLoginPageUrlString.equals(exectedLoginPageUrl)) {
			System.out.println("Pass: Login page is displayed and it is verified upon its Title and Url");
	}
		else {
			System.out.println("Fail: Login page is not displayed and it is verified upon its Title and Url");
		}
		//04: Enter the user name
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		//05: Enter the Password
		WebElement PasswordTextField = driver.findElement(By.name("pwd"));
		PasswordTextField.clear();
		PasswordTextField.sendKeys("manager");
		//06: Select the CheckBox
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		keepLoggedInCheckBox.click();
		if (keepLoggedInCheckBox.isSelected());{
			System.out.println("Pass: keepLoggedInCheckBox is selected and it is verified.");
	   }
	
	   //07: Click on Login Button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		if (loginButton.equals("button")) {
			System.out.println("Pass: Login Button made with <button>");
			loginButton.click();
			String exectedHomePageTitle ="actiTIME -  Enter Time-Track";
			System.out.println("exectedHomePageTitle ="+exectedHomePageTitle);
			String actualHomePageTitle =driver.getTitle();
			System.out.println("actualHomePage ="+actualHomePageTitle);
			
			String exectedHomePageUrl="https://demo.actitime.com/user/submit_tt.do";
			System.out.println("exectedHomePageUrl ="+exectedHomePageUrl);
			String actualHomePageUrl=driver.getCurrentUrl();
			System.out.println("actualHomePageUrl ="+actualHomePageUrl);
			if (actualHomePageTitle.equals(exectedHomePageTitle) && actualHomePageUrl.equals(exectedHomePageUrl)) {
				System.out.println("Pass: The Home page is displayed and it is verified upon the its Title and URL");
			}else {
				System.out.println("Fail: The Home page is not displayed and it is verified upon the its Title and URL");
		    }
		     }
			else {
				System.out.println("Fail: The login button is made with<"+loginButton.getTagName()+">, and it will not be clicked");
			}
		    //08: minimize the browser window 
		   driver.manage().window().maximize();
		   //09: Terminate the session
		   driver.quit();
	
		}
  }
