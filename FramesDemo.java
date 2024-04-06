package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		//Open URL:https://the-internet.herokuapp.com/tinymce
		//write your name
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-WebElementerokuapp.com/tinymce");
	java.util.List<WebElement> frames= driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());
		
	//switching by id or name
	//driver.switchTo().frame("mce_0_ifr");
		
		//switching by webelement
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frame);
				
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Pooja");
		
		//switch to the parent frame
		driver.switchTo().parentFrame();
		
		//switch to the main window
		driver.switchTo().defaultContent();
		

	}

}
