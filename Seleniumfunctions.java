package seleniumbasics;

import java.lang.foreign.Linker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumfunctions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		//Options man=driver.manage();
		//Window win=man.window();
		//win.maximize();

	}

}
