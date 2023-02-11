package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MothersDayDoodle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		@SuppressWarnings("unused")
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for (;;) {
			try {
				WebElement MothersDayDoodle = driver.findElement(By.linkText("Mother's Day 2021 (October 17)"));
				MothersDayDoodle.click();
				break;
				
			} catch (NoSuchElementException e) {
				jse.executeScript("window.scrollBy(0,600)");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
