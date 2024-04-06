package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingapplication {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		/*Open the Browser
		 * Launch the application
		 * Enter username
		 * Enter Password
		 * Click on Login Button
		 * Close the Browser 
		 */
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("testemail");
		WebElement name=driver.findElement(By.name("pass"));
		name.sendKeys("testpassword");
		
		driver.findElement(By.name("login")).click();
		driver.close();
		
		}

}
