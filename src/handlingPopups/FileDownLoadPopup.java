package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownLoadPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	@SuppressWarnings("unused")
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.linkText("4.6.0")).click();
}
}
