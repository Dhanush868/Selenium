package hanadlingdivision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloHomePageDiv {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		WebElement menuContainer = driver.findElement(By.xpath("//div[@class='BigNavstyles__NavBar-sc-1mttgq7-3 caTbTe']"));
	    WebElement featuresButton = menuContainer.findElement(By.xpath("//button[text()='Features']"));
	    featuresButton.click();
	    WebElement solutions = menuContainer.findElement(By.xpath("//button[text()='Solutions']"));
	    System.out.println("Solutions TagName ="+ solutions.getTagName());
	    solutions.click();
	    WebElement plansButton = menuContainer.findElement(By.xpath("//button[text()='Plans']"));
	    if (plansButton.isDisplayed()) {
	    	System.out.println("Pass: Plans Button is Displayed");
	    	plansButton.click();
		}else {
			System.out.println("Fail: Plans Button is Not Displayed");
		}
	   WebElement pricingOption = menuContainer.findElement(By.linkText("Pricing"));
	   if (pricingOption.getTagName().equals("button")) {
		   System.out.println("Fail: This should not be <button> and it should be <a>");
	}else {
		System.out.println("Pass: It is <a> and we perform action on the element");
		pricingOption.click();
	}
	   
	   driver.navigate().back();
	   Thread.sleep(5000);
       WebElement resourcesButton = menuContainer.findElement(By.xpath("//button[text()='Resources']"));   
       wait.until(ExpectedConditions.elementToBeClickable(resourcesButton));
       resourcesButton.click();
	
	}

}
