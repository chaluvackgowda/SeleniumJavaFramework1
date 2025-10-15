package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects 
{
	WebDriver driver=null;
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchTextBox=By.id("APjFqb");
	By clickGoogleSearch=By.name("btnK");
	
	public void setTextInSearchBox(String text)
	{
		driver.findElement(searchTextBox).sendKeys(text);
	}
	public void clickSearchButton()
	{
		driver.findElement(clickGoogleSearch).sendKeys(Keys.RETURN);
	}
	

}
