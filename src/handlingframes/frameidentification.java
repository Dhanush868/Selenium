package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameidentification {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable/");;
		//No such element Exception Bcz the target element present inside the frame (<iframe>).
		//transfer the control from default content to frame area by using its index.
		driver.switchTo().frame(0);
		WebElement draggableObject = driver.findElement(By.id("draggable"));
		actions.dragAndDropBy(draggableObject, 200, 0).perform();
		Thread.sleep(5000);
		// Element present in the default content area
		//Switch back the control form the current frame to the default Content area
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("API Documentation")).click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
