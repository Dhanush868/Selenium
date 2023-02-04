package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSoftWebElement {
	public static void main(String[] args) throws Throwable {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     WebElement KeepLoggedinChickBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
     KeepLoggedinChickBox.click();
     
     Thread.sleep(5000);
     WebElement LoginButton = driver.findElement(By.id("loginButton"));
     LoginButton.click();
     Thread.sleep(5000);
     driver.manage().window().minimize();
     driver.quit();
     
     
	}

}
