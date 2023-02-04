package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(3000);
	    WebElement usernameTextField = driver.findElement(By.id("username"));
	    usernameTextField.sendKeys("admin");
	    Thread.sleep(3000);
	    WebElement pwsTextField = driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
	    pwsTextField.sendKeys("manager");
	    Thread.sleep(3000);
	    WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	    checkBox.click();
	    Thread.sleep(3000);
	    WebElement loginButton = driver.findElement(By.id("loginButton"));
	    Thread.sleep(3000);
	    loginButton.sendKeys(Keys.ENTER);
	}

	
}

