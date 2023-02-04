package hanadlingdivision;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartHomePageDiv {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
		WebElement loginClouseButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		loginClouseButton.click();
		WebElement MenuContainer = driver.findElement(By.xpath("//div[@class='InyRMC _3Il5oO']"));
		WebElement Grocery = MenuContainer.findElement(By.xpath("//div[text()='Grocery']/.."));
		String GroceryTitle = Grocery.getText();
		File tempFile = Grocery.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/FlipkartLogo"+GroceryTitle+".png");
		File tempFileAddress = tempFile.getAbsoluteFile();
		System.out.println(tempFileAddress);
		FileUtils.copyFile(tempFile, destFile);
		System.out.println(destFile);
        driver.quit();		
		
	}

}
