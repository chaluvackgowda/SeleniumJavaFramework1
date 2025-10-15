package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver=null;

	@BeforeTest
	@Parameters("browserName")
	public void setup(String browserName) 
	{
		System.out.println("Browser name is  " + browserName);
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
			
			
		}
		
		/*
		 * else if (browserName.equalsIgnoreCase("edge")) { driver=new EdgeDriver();
		 * 
		 * 
		 * }
		 */
		
	}
	
	@org.testng.annotations.Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}
