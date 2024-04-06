package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testlocator");
		//driver.findElement(By.css("#email")).sendKeys("testfb");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("test");
		//driver.findElement(By.cssSelector("#u_0_5_0y")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_5_0y\"]")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.close();
		
	}

}
