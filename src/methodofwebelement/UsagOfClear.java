package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsagOfClear {
    public static void main(String[] args) throws Throwable {
		//set the driver executable path.
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	//Instantiate the browser specific class
    	WebDriver driver =new ChromeDriver();
    	// Maximize the browser window
    	driver.manage().window().maximize();
    	driver.get("https://demo.vtiger.com/vtigercrm/");
    	WebElement usernameTextField = driver.findElement(By.id("username"));
    	Thread.sleep(4000);
    	usernameTextField.clear();
    	usernameTextField.sendKeys("admin");
        Thread.sleep(3000);
    	WebElement pwsTestField = driver.findElement(By.id("password"));
    	pwsTestField.clear();
        Thread.sleep(3000);
    	pwsTestField.sendKeys("Test@123");
        Thread.sleep(3000);
    	WebElement signIn = driver.findElement(By.xpath("//button[@class='button buttonBlue']"));
        signIn.click();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        driver.quit();
    	
	}
}
