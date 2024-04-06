package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	
	public static void scrolling() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		
		//Scrolling
		//1. First Parameter >>Horizontal (-ve scrolls left, +ve scrolls right)
		//2. Second Parameter>>Vertical (-ve scrolls up, +ve scrolls down)
		//act.scrollByAmount(0, 200).perform();
		
		WebElement target=driver.findElement(By.linkText("Messenger"));
		act.scrollToElement(target).perform();	
	}
	
	public static void keyboardEvents() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		WebElement target=driver.findElement(By.id("email"));
		act.click(target).keyDown(Keys.SHIFT).sendKeys("pooja").keyUp(Keys.SHIFT).perform();
	}
	
	//copy the value from username and paste in password field
	
	public static void copypaste() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		WebElement email=driver.findElement(By.id("email"));
		WebElement pwd=driver.findElement(By.id("pass"));
		act.sendKeys(email, "pooja").doubleClick().keyDown(Keys.CONTROL).sendKeys("c").click(pwd).keyDown(Keys.CONTROL).sendKeys("v").perform();
		
		
	}
	public static void dragDrop() {
		//use drag drop method in actions class
		//Whenever we get NoSuchElementException
		//1.Locators and attributes which we are using is wrong
		//2. The elements are present inside a frame
		//3. The elements are present on a different window
		//4. The elements are not present at this moment and are delayed
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).perform();
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		//act.contextClick(target).perform();
		
		//right click on a specific webelement
		WebElement target=driver.findElement(By.id("email"));
		act.contextClick(target).perform();
		
		//double click
	}

}
