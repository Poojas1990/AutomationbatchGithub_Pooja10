package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

	public static void main(String[] args) {
		//Open https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		//Enter username
		//Enter password
		//click on login
		
		//Synchronization
		//waits
		
		//Implicit wait - it will wait for elements to be present
		//Explicit wait - it is not applicable for all the element. For specific element we can go for this WebElementwiat class
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //use it only once
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);//1000=1second//not recommended because we lose lot of time
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.id("abc"));

		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement submitbtn=driver.findElement(By.id("ad"));
		wait.until(ExpectedConditions.elementToBeClickable(submitbtn)).click();
	}

}
