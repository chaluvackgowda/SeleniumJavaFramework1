package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageObjectsTest {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		GoogleSearchPageObjects pageObjects=new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com/");
		pageObjects.setTextInSearchBox("hello");
		pageObjects.clickSearchButton();
		System.out.println("Done");

		
	}

}
