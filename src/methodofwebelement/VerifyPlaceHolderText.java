package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPlaceHolderText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		String exectedPlaceHolderText="Username";
		System.out.println("exectedPlaceHolderText ="+exectedPlaceHolderText);
		String actualPlaceHolderText = usernameTextField.getAttribute("placeholder");
		System.out.println("actualPlaceHolderText ="+actualPlaceHolderText);
		if (exectedPlaceHolderText.equals(actualPlaceHolderText)) {
			System.out.println("Pass: The PlaceHoldrText of the username text field is correct and it is verified");
			
			
		}
		else {
			System.out.println("Fail: The PlaceHolderText of the username text field is incorrect and it is verified");
		}
        driver.manage().window().maximize();
        driver.quit();
	
	
	
	}

}
