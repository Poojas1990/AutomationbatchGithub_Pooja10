package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Navigation nav = driver.navigate();
		nav.to("https://www.amazon.in/");
		nav.back();
		nav.forward();
		nav.refresh();
		
		//Alternate approach
		//driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();

	}

}
