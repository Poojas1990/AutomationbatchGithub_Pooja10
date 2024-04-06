package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetestautomation {

	public static void main(String[] args) {
		// https://practicetestautomation.com/practice-test-login/
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement id=driver.findElement(By.id("username"));
		id.sendKeys("student");
		WebElement name=driver.findElement(By.name("password"));
		name.sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		driver.close();

	}

}
