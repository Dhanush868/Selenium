package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVerifyTextFieldDefaultData {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		 WebElement usernameTextField = driver.findElement(By.id("username"));
		if (usernameTextField.getAttribute("value").isEmpty()){
			System.out.println("Boolean True -ve Testing Scnario");
			System.out.println("Fail: username text field is empty and it is verified ");	
		}else {
			System.out.println("Boolen Fales -ve Testing Scnario");
			System.out.println("Pass: username text field is not empty and it is verified");
			
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
