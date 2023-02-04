package my;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://id.atlassian.com/login?");
			//driver.findElement(By.linkText("Log in")).click();
			driver.switchTo().activeElement().sendKeys("dhanunjayayaraballi@gmail.com");
			WebElement loginOption = driver.findElement(By.id("login-submit"));
			loginOption.click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password")));
			//WebElement passwordTextField = driver.findElement(By.id("password"));
			driver.switchTo().activeElement().sendKeys("Dhanunsh@712");
			//passwordTextField.sendKeys("Dhanush#712@");
			Thread.sleep(5000);
			
			WebElement finalLoginButton = driver.findElement(By.id("login-submit"));
			finalLoginButton.click();
			WebElement createNewBoardOption = driver.findElement(By.className("board-tile mod-add"));
			createNewBoardOption.click();
			driver.switchTo().activeElement().sendKeys("NewTrello");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.findElement(By.className("list-name-input"));
			driver.switchTo().activeElement().sendKeys("Manual");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.switchTo().activeElement().sendKeys("SQL");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.switchTo().activeElement().sendKeys("Automation");
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.navigate().back();
			
			
			
			
		}
	}



