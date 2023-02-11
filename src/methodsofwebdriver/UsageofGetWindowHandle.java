package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetWindowHandle {
	public static void main (String[] args) throws Throwable
	{
	System.setProperty("Webdriver.chrome.driver","/drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();//pass the main url of the application
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	driver.get("https://demoqa.com/browser-windows");
	jse.executeScript("window.scrollBy(0,300);");
	Thread.sleep(3000);
	WebElement newWindowButton=driver.findElement(By.id("WindowButton"));
	newWindowButton.click();
	Thread.sleep(3000);
	@SuppressWarnings("unused")
	String parentWindowId= driver.getWindowHandle();
	driver.manage().window().minimize();
	driver.close();
	
}
}
	
	

	
	
	


