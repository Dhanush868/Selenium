package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsagOfSendKeys {
	public static void main(String[] args) throws Throwable {
		//set the driver executable path
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    //Instantiate browser specific class
	    WebDriver driver=new ChromeDriver();
	    //Maximize the browser window
	    driver.manage().window().maximize();
	    driver.get("https://demo.vtiger.com/vtigercrm/");
	    
	    WebElement usernameText = driver.findElement(By.id("username"));
	    usernameText.clear();
	    Thread.sleep(2000);
	    WebElement pwdTextField = driver.findElement(By.id("password"));
	    pwdTextField.clear();
	    driver.quit();
	    
	    
	 
	}
	

}
