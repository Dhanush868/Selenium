package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldEmptiness {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		if (usernameTextField.getAttribute("value").isEmpty()) {
			System.out.println("Pass: The usernameTextField is empty and it is verified");
		}
		else {
			System.out.println("Fail: The usernameTextField is not empty and it is verified");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
