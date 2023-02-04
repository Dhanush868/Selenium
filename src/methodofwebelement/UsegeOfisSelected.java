package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfisSelected {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
        keepLoggedInCheckBox.click();
        if (keepLoggedInCheckBox.isSelected()) {
        	System.out.println("keepLoggedInCheckBox is deselected, since it is not selected");
		}else {
			System.out.println("Boolean Fales-CheckBox not selected");
			keepLoggedInCheckBox.click();
		    System.out.println("keepLoggedInCheckBox is selected, since it is not selected");	
		}
        driver.manage().window().minimize();
        driver.quit();
        
  }
}
