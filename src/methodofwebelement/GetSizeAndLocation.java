package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndLocation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		// get the size of the emailTextField-Dimension - Sel class-getSize();
		Dimension emailSize = emailTextField.getSize();
		System.out.println("emailSize ="+emailSize);
		//get the height of the  emailTextField-getHeight()-Dimension-getSize();
		int emailHeight = emailSize.getHeight();
		System.out.println("emailHeight ="+emailHeight);
		// get Width of the emailTextField
		int emailWidth = emailSize.getWidth();
		//Print interms of pixels 
		//System.out.println("emailWidth ="+emailWidth);
		//get Location of the emailTextField-getLocation()-Point-Sel class
		
		Point emailLocation = emailTextField.getLocation();	
		//get the x co-ordinate(String point of email along x- axis)Of the emailTextField
		int emailStartX = emailLocation.getX();
		//print
		System.out.println("emailStartX ="+ emailStartX);
		
	//get the Y co-ordinate (String point of email along Y- axis)Of the emailTextField
		
		int emailStratY = emailLocation.getY();
	    //print
		System.out.println("emailStratY =" + emailStratY);
		
		//find the size of the password textField
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		Dimension passwordSize = passwordTextField.getSize();
		System.out.println("passwordSize ="+passwordSize);
		int passwordHeight = passwordSize.getHeight();
		//System.out.println("passwordHeight ="+passwordHeight);
		int passwordWidth = passwordSize.getWidth();
		//System.out.println("passwordWidth ="+passwordWidth);
		
		/*if (emailSize.equals(passwordSize)) {
			System.out.println("Pass: The Size Of the email and password TextField is found equal and verified");	
		}
		else {
			System.out.println("Fail: The Size Of the email and password TextField is found unequal and verified");	

		}*/
		
		if (emailHeight==passwordHeight && emailWidth==passwordWidth) {
			System.out.println("Pass: The Size Of the email and password TextField is found equal and verified");
		}
		else {
			System.out.println("Fail: The Size Of the email and password TextField is found unequal and verified");	
		}
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
	}

}
