package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		//https://testpages.herokuapp.com/styled/alerts/alert-test.html
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);//3s
		Alert al= driver.switchTo().alert();
		al.accept();
		/*String t="I am an alert box!";
		boolean ist=true;
				if(ist){
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}*/
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); //accept is to click ok
		//driver.switchTo().alert().dismiss(); //is to cancel
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		Alert alt= driver.switchTo().alert();
		alt.sendKeys("Pooja");
		alt.accept();
		
		
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);//3s
		String expTitle="I am an alert box!";
		String actTitle=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if(expTitle.equals(actTitle)) {
			System.out.println("TC Pass");
		}else {
			System.out.println("TC Fail");
		}
		driver.quit();

	}

}
