package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement cb1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		WebElement cb2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		System.out.println("CheckBox1"); //T,T,F
		System.out.println(cb1.isDisplayed());
		System.out.println(cb1.isEnabled());
		System.out.println(cb1.isSelected());
		
		System.out.println("CheckBox2");//T,T,T
		System.out.println(cb2.isDisplayed());
		System.out.println(cb2.isEnabled());
		System.out.println(cb2.isSelected());
		
	//	cb1.click();
		//T,T,T
	//	System.out.println("CheckBox1 after selected");
	//	System.out.println(cb1.isDisplayed());
	//	System.out.println(cb1.isEnabled());
	//	System.out.println(cb1.isSelected());
		
		//write a code which will make sure that CheckBox 2 is always selected
		
		if (cb1.isSelected()) {
			System.out.println("Checkbox is selected");
		}else {
			cb1.click();
			System.out.println("Checkbox is not selected,hence selecting it");
		}
		
		driver.close();
		
		
	}
	
}
