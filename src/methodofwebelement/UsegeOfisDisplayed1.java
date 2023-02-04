package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfisDisplayed1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		Thread.sleep(2000);
		WebElement PleaseAcceptTermsOfService = driver.findElement(By.id("confbtn"));
		if (PleaseAcceptTermsOfService.isDisplayed()) {
			System.out.println("Boolen True -ve Testing");
			System.out.println("Fail: The Please accept Terms of Service Check Box is displayed befour clicking on accept terms of service button");
		}else {
			System.out.println("Boolean Fales +ve Testing");
			System.out.println("Pass: The Please accept Terms of Service Check Box is not displayed befour clicking on accept terms of service button");

		}
		driver.manage().window().minimize();
		driver.quit();
		
		
	
	}
}
