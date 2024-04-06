package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String amazon_title= driver.getTitle();
		System.out.println("Amazon Page Title is "+amazon_title);
		driver.get("https://www.facebook.com/");
		String facebook_title=driver.getTitle();
		System.out.println("Facebook Page Title is "+facebook_title);
		driver.close();
		
	}
}
