package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    WebElement usernameIdTextField = driver.findElement(By.id("email"));
	    Dimension usernameSize = usernameIdTextField.getSize();
	    int usernameHight = usernameSize.getHeight();
	    System.out.println("usernameHight="+usernameHight);
	    int usernameWidth = usernameSize.getWidth();
	    System.out.println("usernameWidth ="+usernameWidth);
	    
	    WebElement passwordtextfield = driver.findElement(By.id("passContainer"));
	    Dimension passwordTextFieldSize = passwordtextfield.getSize();
	    int passwordTextFieldHight = passwordTextFieldSize.getHeight();
	    System.out.println("passwordTextFieldHight="+passwordTextFieldHight);
	    int passwordTextFieldWidth = passwordTextFieldSize.getWidth();
	    System.out.println("passwordTextFieldWidth ="+passwordTextFieldWidth);
        
	    if (usernameHight==passwordTextFieldHight && usernameWidth==passwordTextFieldWidth) {
			
	    	System.out.println("Pass: The Size of the username and password textfield are equal and it is verified.");	
		}
	    else {
			System.out.println("Fail: The Size of the username and password textfield are not equal and it is verified.");
		}
	    
	    Point usernameLocation = usernameIdTextField.getLocation();
	    int usernameStartX = usernameLocation.getX();
	    System.out.println("usernameStartX="+usernameStartX);
	    int usernameStartY = usernameLocation.getY();
	    System.out.println("usernameStartY="+usernameStartY);
	    
	    driver.quit();
	    
	    
	    
	    
	    
		
	}

}
