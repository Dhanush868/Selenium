package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyChromeBrowser {
public static void main(String [] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com/");
	Thread.sleep(5000);
	driver.quit();
	
}


}
