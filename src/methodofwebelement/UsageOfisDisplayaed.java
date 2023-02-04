package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisDisplayaed {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(keepLoggedInCheckBox.isDisplayed()){
		System.out.println("Boolen True");
		System.out.println("Pass: keepLoggedInCheckBox is visible and it is verified.");
		}else {
			System.out.println("Boolean Fales");
			System.out.println("Fail: keepLoggedInCheckBox is invisible and it is verified");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
