package screenshort;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rcbLogo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
		WebElement rcbLogoimg = driver.findElement(By.xpath("//img[@src='/themes/custom/rcbbase/images/rcb-logo-new.png']"));
		File tempFile = rcbLogoimg.getScreenshotAs(OutputType.FILE);
		String timestamp=LocalDateTime.now().toString().replace(':', '-');
		File destFile = new File("./errorshots/rcblogo"+timestamp+".png");
		File tempFileAddress = tempFile.getAbsoluteFile();
		System.out.println(tempFileAddress);
		FileUtils.copyFile(tempFile, destFile);
		Thread.sleep(20000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
