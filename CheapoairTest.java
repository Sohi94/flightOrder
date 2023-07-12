package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class CheapoairTest extends Base {

	// protected WebDriver driver = "https://www.cheapoair.com/";
	String url = "https://www.cheapoair.com/";

	@Test
	public void testFlightOrder() throws InterruptedException {
		driver.get(url);
		// Thread.sleep(1000);
		// driver.switchTo().alert().dismiss();
		// Thread.sleep(1000);

		WebElement inputFrom = driver.findElement(By.id("from0"));
		inputFrom.click();
		//Thread.sleep(1000);
		inputFrom.sendKeys(Keys.CONTROL + "A");
		inputFrom.sendKeys(Keys.DELETE);
		inputFrom.sendKeys("JFK");
		//Thread.sleep(1000);
		// inputFrom.sendKeys(Keys.ARROW_DOWN);
		inputFrom.sendKeys(Keys.ENTER);

		WebElement inputTo = driver.findElement(By.id("to0"));
		//Thread.sleep(1000);
		inputTo.sendKeys(Keys.DELETE);
		inputTo.sendKeys("GVA");
		//Thread.sleep(1000);
		// inputFrom.sendKeys(Keys.ARROW_DOWN);
		inputTo.sendKeys(Keys.ENTER);

		driver.findElement(By.id("cal0")).click();
		//Thread.sleep(1000);
		WebElement departDate = driver.findElement(By.xpath("//a[@aria-label='10 July 2023']"));
		departDate.click();

		driver.findElement(By.id("cal1")).click();
		//Thread.sleep(1000);
		WebElement returnDate = driver.findElement(By.xpath("//a[@aria-label='24 July 2023']"));
		returnDate.click();

		WebElement adults = driver.findElement(By.xpath("//a[@id='travellerButton']"));
		adults.click();
		//Thread.sleep(1000);
		for (int i = 0; i < 1; i++) {
			driver.findElement(By.id("addadults")).click();
		}
		
		driver.findElement(By.id("addchild"));
		//Thread.sleep(1000);
		 for(int i=0;i<2;i++) { 
			 driver.findElement(By.id("addchild")).click();
		 }
		 
		WebElement childAge = driver.findElement(By.id("select0"));
		childAge.click();
     
	   Select childAge1 = new Select(childAge.findElement(By.name("ChildrenAge")));
	   childAge1.selectByIndex(1);
	   
	   WebElement childAge2 = driver.findElement(By.id("select1"));
		childAge2.click();
		Select child2Age = new Select(childAge2.findElement(By.name("ChildrenAge")));
		child2Age.selectByIndex(2);
		
	}

	@Test
	public void hotelOrder() throws InterruptedException {
	

		// driver.findElement(By.xpath(" //a[@class='phonelink px-1']")).click();

		// driver.findElement(By.xpath("//div[@class='modal-close-icon']")).click();
		// Thread.sleep(1000);
		// Thread.sleep(1000);
		// driver.findElement(By.name("sv svg-1 close-icon-color")).click();
	}
	
}
