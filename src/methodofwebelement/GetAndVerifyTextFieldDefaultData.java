package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndVerifyTextFieldDefaultData {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		if (usernameTextField.getAttribute("value").isEmpty()) {
			System.out.println("Boolean True -ve Testing Scenario");
			System.out.println("Fail: The username text field is empty and it is verified");
			
		}
		else {
			System.out.println("Boolean False -ve Testing Scenario");
			System.out.println(usernameTextField.getAttribute("value"));
			System.out.println("Pass: The username text field is not empty and it is verified");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
