package MyPractice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShort {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement fbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File sourceFile = fbLogo.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/img.jpg");
		FileUtils.copyFile(sourceFile, destFile);
		driver.quit();		
		
		
		
	}

}
