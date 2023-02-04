package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.timeout.TimeoutException;

public class PageLoadForEcommerce {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		try {
			driver.get("https://www.myntra.com/");
			System.out.println("The webpage has loaded sucessfully within the given time");
		
		}catch (TimeoutException e) {
		System.out.println("The webpage has not loaded sucessfully within the given time");

	}
	driver.manage().window().minimize();
	driver.quit();
}
}
