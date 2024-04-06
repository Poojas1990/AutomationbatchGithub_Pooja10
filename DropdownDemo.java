package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dd=driver.findElement(By.id("dropdown"));
		Select obj=new Select(dd);
	   List<WebElement> options = obj.getOptions();
		System.out.println(options.size());
		//obj.selectByIndex(2);
		//obj.selectByValue("1");
		obj.selectByVisibleText("option 2");
		
		//Open https://www.orangehrm.com/en/contact-sales/
		//Select a county argentina
		//how many countrie are there
		//print all the country names
		
		//to get all options without using Select class		
		System.out.println(driver.findElements(By.tagName("option")).size());	

		
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		//will give all the options on the page
	List<WebElement> opts= driver.findElements(By.tagName("option"));
		
	//this will give all the options inside the country dropdown
	List<WebElement> countryopts= driver.findElements(By.xpath("//Select[@name='Country]/option"));
	System.out.println(countryopts.size());
	//Select[@name='Country]/option
		for (WebElement abc:opts) {
			System.out.println(abc.getText());
		}

	}

}
