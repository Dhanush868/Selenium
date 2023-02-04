package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jobalert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.freejobalert.com/");
	WebElement odishaButton = driver.findElement(By.xpath("//span[text()='OD']"));
	odishaButton.click();
	WebElement OdTable = driver.findElement(By.xpath("//table[@class='lattbl']/tbody/tr[6]/td[7]/strong/a[@target='_blank']"));
	OdTable.click();
	
}
}
