package test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchPageTest {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	 	WebElement element=  GoogleSearchPage.textbox_search(driver);
	 	element.sendKeys("Automation step by step");
	 	element.sendKeys(Keys.ENTER);
		
		

	}

}
