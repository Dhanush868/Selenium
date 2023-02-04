package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class promptPopup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		WebElement promtButton = driver.findElement(By.id("promtButton"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,300)");
		promtButton.click();
	    Thread.sleep(5000);
		Alert promtButtonAlert = driver.switchTo().alert();
		promtButtonAlert.sendKeys("Dhanunsh..");
		System.out.println(promtButtonAlert.getText());
		promtButtonAlert.accept();
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
