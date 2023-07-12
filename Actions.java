package practice;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions extends Base {

	WebDriver driver = null;

	@Test
	public void alertExample() {
		driver.get("https://www.letskodeit.com/practice");
		
		//Assert.assertEquals("Practice Page", "practice page", "Some message will be printed");
		//Assert.assertEquals("Practice Page", "Practice Page");
	}

}
