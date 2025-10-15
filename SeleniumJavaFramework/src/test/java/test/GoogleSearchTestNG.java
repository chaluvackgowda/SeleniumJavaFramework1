package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GoogleSearchTestNG {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("hello");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

		
	@org.testng.annotations.Test
	public  void googleSearch()
	
	{
		
		
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("Automation step by step");
		element.sendKeys(Keys.ENTER);
		
	}
	
	@AfterTest
	public void closeTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully ");
	}
	

}
