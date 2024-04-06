package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturls {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	List<WebElement> urls =driver.findElements(By.tagName("a"));
	System.out.println(urls.size());
	
	for (WebElement abc:urls) {
		System.out.println("Text==> "+ abc.getText());
		System.out.println("Tooltip==> "+ abc.getAttribute("title"));
		System.out.println("URLs==> "+ abc.getAttribute("href"));
	}
	driver.close();
	}

}
