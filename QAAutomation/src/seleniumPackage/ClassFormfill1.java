package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFormfill1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        browserObject.findElement(By.name("name")).sendKeys("Derick");
	        browserObject.findElement(By.name("email")).sendKeys("ndamderick85@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("www.@dk.com");
	        browserObject.findElement(By.name("comment")).sendKeys("passing elemenet through boxes");
	        browserObject.findElement(By.name("submit")).click();
	}
	
}
	


