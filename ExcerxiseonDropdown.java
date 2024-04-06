package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcerxiseonDropdown {

	private static By driver;

	public static void main(String[] args) {
		//Open https://www.orangehrm.com/en/contact-sales/
				//Select a county argentina
				//how many countries are there
				//print all the country names
		
	//to get all options without using Select class		
	System.out.println(driver.findElements((SearchContext) By.tagName("option")).size());	

	
	((WebDriver) driver).get("https://www.orangehrm.com/en/contact-sales/");
	
	}

}
