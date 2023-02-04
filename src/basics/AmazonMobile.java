package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobile {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement searchTextfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchTextfield.sendKeys("realme9i");
	WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchButton.click();
	WebElement Mobile = driver.findElement(By.xpath("//span[contains(text(),'Realme 9i (Prism Blue, 4GB RAM, 128GB Storage)')]/../../../../../.. /../..//span[@class='a-price-whole']"));
	Mobile.click();
		
		
	
}
}
