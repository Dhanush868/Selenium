package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsagOfGetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		System.out.println(usernameTextField.getAttribute("type"));
		System.out.println(usernameTextField.getAttribute("name"));
		System.out.println(usernameTextField.getAttribute("value"));
		System.out.println(usernameTextField.getAttribute("placeholder"));
		
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
