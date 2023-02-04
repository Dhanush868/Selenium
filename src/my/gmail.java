package my;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://accounts.google.com/signup");
		WebElement FN = driver.findElement(By.id("firstName"));
		FN.sendKeys("djkf22");
		WebElement LN = driver.findElement(By.id("lastName"));
		LN.sendKeys("JHD");
		WebElement ET = driver.findElement(By.id("username"));
		WebElement EButton = driver.findElement(By.cssSelector("button[jsname=\"xqKM5b\"]"));
		String Etext = EButton.getText();
		String Ettext = ET.getText();

		System.out.println(Etext);
		ET.sendKeys("ding");

		WebElement PT = driver.findElement(By.name("Passwd"));
		PT.sendKeys(Etext);

		WebElement CPT = driver.findElement(By.name("ConfirmPasswd"));
		CPT.sendKeys(Etext);
		
		WebElement ECheckBox = driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
		ECheckBox.click();
		
		WebElement NextButton = driver.findElement(By.id("accountDetailsNext"));
		NextButton.click();

	}

}
