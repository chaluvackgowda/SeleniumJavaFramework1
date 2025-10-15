import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
	
		
	}

}
