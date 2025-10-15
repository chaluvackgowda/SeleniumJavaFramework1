import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();

	}

}
