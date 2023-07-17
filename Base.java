package practice;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	protected WebDriver driver = null;
	protected WebDriverWait wait;
	private long implicitWait = 20;
	private long explicitWait = 30;

	@BeforeMethod
	public void setUp() {
		
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver.chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
				
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		
		//explicit wait
		wait = new WebDriverWait(driver,Duration.ofSeconds(explicitWait));
	}
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		
	}
}


