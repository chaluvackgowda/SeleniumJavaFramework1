package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemoWithTestNG {
		
	     ExtentSparkReporter extent;
	     ExtentReports e;
	     WebDriver driver;
		@BeforeSuite
		public void setUp()
		{
			extent=new ExtentSparkReporter("abc.html");
			e=new ExtentReports();
			e.attachReporter(extent);
		}
		
		@Test
		public void test1()
		{
			
			ExtentTest test=e.createTest("Google Search Functionality");
			
			test.log(Status.INFO, "Starting the test ");
			driver.get("https://www.google.com/");
			
			test.info("This Step Shows the usage of info(Details)");
			
		
		}
		
		@AfterSuite
		public void tearDown()
		{
			e.flush();
		}
		

	

}
