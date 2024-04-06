package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(email)).sendKeys("password");
		//driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email"))).sendKeys("password");

	}

}
