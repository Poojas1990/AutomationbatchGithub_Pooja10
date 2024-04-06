package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.network.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Set<org.openqa.selenium.Cookie> abc =driver.manage().getCookies();
		System.out.println(abc.size());
		
		//for (Cookie Cookie:abc) {
		//	System.out.println(Cookie);
		//	System.out.println();
		//}
		
		driver.manage().deleteAllCookies();
		
		System.out.println();
		driver.close();
	}

}
