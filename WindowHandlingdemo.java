package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//at this point there is only one window
		String pwhandle=driver.getWindowHandle();
		System.out.println("Parent Window Handle==>> "+pwhandle);
		driver.get("https://the-internet.herokuapp.com/windows");
		String pwtitle=driver.getTitle();
		System.out.println("Parent Window Title==>> "+pwtitle);
		driver.findElement(By.linkText("Click Here")).click();
		
		//at this point there are 2 windows
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		it.next();
		String cwhandle=it.next();
		System.out.println("Child Window Handle==>> "+cwhandle);
		
		driver.switchTo().window(cwhandle);
		String cwtitle=driver.getTitle();
		System.out.println("Child Window Title==>> "+cwtitle);
		
		//driver.switchTo().window(pwhandle);
		//System.out.println("Parent Window Title==>> "+driver.getTitle());
		
		//driver.close();//will close the window pointed by driver
		driver.quit();//will close all the windows
	}

}
