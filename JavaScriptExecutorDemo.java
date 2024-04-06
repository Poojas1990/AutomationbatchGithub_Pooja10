package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//Scrolling by some pixels
		//js.executeScript("window.scroll(0,200)");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//raise an alert
		//js.executeScript("alert('I am in alert')");
		
		//manipulate with css
		//js.executeScript("document.body.style.backgroundcolor='red'");
		//WebElement temp= driver.findElement(By.id("email"));
		//js.executeScript("arguments[0].style.backgroundcolor='red'",temp);
		//js.executeScript("arguments[0].style.border='4px green'",temp);
		
		//clicking
		
		WebElement link=driver.findElement(By.linkText("Forgotten Password?"));
		js.executeScript("arguments[0].click()", link);
	}

}
