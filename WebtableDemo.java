package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		//how many tables are there on the page
		System.out.println("Table count" + driver.findElements(By.tagName("table")).size());
		
		//how many rows are there on the page
		System.out.println("Table count" + driver.findElements(By.tagName("tr")).size());
		
		//how many columns are there on the page
				System.out.println("Table count" + driver.findElements(By.xpath("//tr[1]/td")).size());
				
				driver.close();
				
				//assignment is to select checkbox of Argentina using xpath which always selects Argentina, even if the position is dynamic
				

	}

}
