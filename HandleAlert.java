package practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HandleAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://www.target.com/"; 
		driver.get(url);
		//types of Alert: SIMPLE, PROMPT, CONFIRMATION
		//METHODS to handle alert:
		//1- void dismiss()-- to click CANCEL button:
		driver.switchTo().alert().dismiss();
		//2-void accept()--to click OK button:
		driver.switchTo().alert().accept();
		//3- String getText()-- to capture the alert message:
		driver.switchTo().alert().getText();
		//4- void sendKeys()--to send some data to a box:
		driver.switchTo().alert().sendKeys("Text");

		
		//Assert/VARIFY-- to check whether the required alert is displayed on the page
		//Assert.assertEquals(true, true);
		//HANDLE FRAMES
		// driver.switchTo().frame(index);
		// driver.switchTo().frame(Name or Id);
		// driver.switchTo().frame(WebElement);
		Assert.assertEquals(0, 0);
		
		
		
	}

}
