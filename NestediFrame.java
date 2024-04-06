package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrame {

	public static void main(String[] args) {
		
		//Ass1: Open https://demo.automationtesting.in/Frames.html
		//Work on Single Frame
		//Work on nested Frame
		
		//Ass2: open https://demo.automationtesting.in/Frames.html
		//handle all the 3 alerts
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.tagName("#Single")).click();
		
		
		

	}

}
