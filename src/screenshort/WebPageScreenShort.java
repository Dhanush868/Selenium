package screenshort;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenShort {
	public static void main(String[] args) throws IOException, Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(':','-');
		File destFile = new File("./errorshots/facebookloginpage"+timeStamp+".png");
		String tempFileAddress = tempFile.getAbsolutePath();
		System.out.println(tempFileAddress);
	    FileUtils.copyFile(tempFile, destFile);
		Thread.sleep(20000);
		driver.manage().window().minimize();
		driver.quit();

	
	}

}
