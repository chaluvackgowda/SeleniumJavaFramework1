package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo {
	
	static WebDriver driver=null; 

	public static void main(String[] args) 
	{
		
		
		ExtentSparkReporter htmlReporter =new ExtentSparkReporter("extentReports.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Google Search Functionality ");
		test.log(Status.INFO, "Starting the test cases");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Entered Text in search box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		test.pass("pressed keyboard enter key");
		driver.close();
		driver.quit();	
		
		test.pass("closed the browser");
		
		test.info("Test Completed");
		extent.flush();

}
}
