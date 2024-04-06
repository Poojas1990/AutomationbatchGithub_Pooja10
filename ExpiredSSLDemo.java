package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExpiredSSLDemo {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://expired.badssl.com/");

	}

}
