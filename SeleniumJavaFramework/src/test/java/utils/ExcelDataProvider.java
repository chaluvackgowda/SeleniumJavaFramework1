package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUpTest()
	{
		driver=new ChromeDriver();
		
		
	}
	
	@Test(dataProvider = "test1data")
	public void test1(String username,String password) throws InterruptedException
	{
		System.out.println(username +"  " + password);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		
		
	}


	
	@DataProvider(name="test1data")
	public static Object[][] getData() throws IOException
	{
		Object[][] data= testData("C:\\Users\\LENOVO\\Documents\\SeleniumJavaFramework\\excel\\data.xlsx", "chaluva");
		return data;
	}

		
		public static  Object[][] testData(String excelPath, String sheetName) throws IOException
		{
			ExcelUtils excel=new ExcelUtils(excelPath, sheetName);
			int rowCount=	excel.getRowCount();
			int columnCount=excel.getColumnCount();
			
			Object data[][]=new Object[rowCount-1][columnCount];
			
			System.out.println("rowCount " + rowCount +" columnCount " + columnCount);
			for (int i = 1; i < rowCount; i++) 
			{
				
				for (int j = 0; j < columnCount; j++) {
				String celldata=	excel.getCellData(i, j);
			//	System.out.print(celldata +"  ");
				data[i-1][j]=celldata;
				
				}
			//	System.out.println("");
			} 
			return data;
		}
		
	}


