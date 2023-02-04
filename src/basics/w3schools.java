package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {
public static void main(String []args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/");
	Thread.sleep(3000);
	 WebElement Login = driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']\\"));
	 Login.click();
	
	
	
}
 


}
