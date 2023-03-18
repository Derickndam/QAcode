package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassformFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserObject;
		  //1. setup the property of chromedriver to pass value to form input box through chrome web browser.
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		    browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		    
		    // sending text to the input box in the web form--------------
		    // 4. Locate Name section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("name")).sendKeys("DemoName");
		 
		    // 5. Locate email section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
		    
		   // 6. Locate website section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("website")).sendKeys("www.demosite.com");
		    
		    // 7. Locate comment section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("comment")).sendKeys("demo comment");
		    
		   // 8. Locate the submit button and perform click
		    browserObject.findElement(By.name("submit")).click();
		   // 9. Close the browser
		    browserObject.close();
	}

}
