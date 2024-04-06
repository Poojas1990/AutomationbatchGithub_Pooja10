package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
	//	captureScreenshot("page_open");
		//captureScreenshot("login_username");
	//	captureScreenshot("login_password");
		
		captureScreenshot("./Screenshots/" + "page_open" + ".png");// file name should be like this when we call methos like last one
		
	}

	//public static void captureScreenshot(String fileName) throws IOException {
		//String path=".Screenshots/" +fileName+ ".png";
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//TakeScreenshot ts= (TakeScreenshot)driver;
		//File temp=ts.getScreenshotAs(OutputType.FILE);
		//Files.copy(temp,new File(path));
	//}
	
	public static void captureScreenshot(String fileName) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(temp,new File(fileName));
	}
	
	
}
