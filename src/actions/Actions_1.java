package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		@SuppressWarnings("unused")
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		List<WebElement> menuSection = driver.findElements(By.xpath("//div[@class='desktop-navLink']/a"));
		
		for (WebElement menuOption : menuSection) {
			action.moveToElement(menuOption).pause(Duration.ofSeconds(2)).perform();
			
		}
	
	
	
	
	
	
	}  

}
