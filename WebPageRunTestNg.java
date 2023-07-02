package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebPageRunTestNg {
	//@Test
	public void Target() throws Throwable{
		System.out.println("Target");

		WebDriver driver = new ChromeDriver(); 
		String url = "https://www.target.com/"; 
		driver.get(url);
//	    driver.navigate().refresh();
//		Thread.sleep(5000);
//		driver.close();
		
	   //zipCode-2
	    driver.findElement(By.xpath("//span[text()='08872'] ")).click();
	    //Thread.sleep(3000);
	    WebElement zipCode = driver.findElement(By.xpath("//input[@name= 'zip-code'] "));
	    zipCode.click();
	    Thread.sleep(1000);
	    zipCode.sendKeys(Keys.CONTROL+"A");
	    zipCode.sendKeys(Keys.DELETE);
	    zipCode.sendKeys("08837");

	    
	    //driver.findElement(By.xpath("//span[text()="Sign in"] ")).click();
	   
	    Thread.sleep(1000);
	   //findStore-4
	    driver.findElement(By.xpath("//button[@aria-label='close']")).click();
	    driver.findElement(By.xpath("//span[@data-icon-name=\"GeneralTrackLocation\"] //following:: button ")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='1055']")).click();
	    driver.findElement(By.xpath("//button[text()='Shop this store']")).click();
	    Thread.sleep(1000);
	    
//Categories:Outdoor-fire pits-6
		 driver.findElement(By.xpath("//span[@data-icon-name=\"NavigationHamburgerFill\"]//parent::a")).click();
		 Thread.sleep(1000);
	     driver.findElement(By.xpath("//h2[text()='Categories']//parent::span//parent::div//parent::button")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Outdoor Living & Garden")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Fire Pits & Outdoor Heaters")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='Fire Pits']")).click();
		 Thread.sleep(1000);
	     driver.findElement(By.xpath("//span[text()='Gas fire pits']//parent::div")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//span[text()='Wood burning fire pits']")).click();
	   
	     
	     
	} 	
	
	@Test
	public void Zara() throws Throwable{
		System.out.println("Zara");

		String url2 = "https://www.zara.com/";

		System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url2);

		driver.navigate().refresh();
//close button-
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@class='zds-button store-selector__button zds-button--primary']")).click();
		 Thread.sleep(1000);
		//log in-
		driver.findElement(By.partialLinkText("LOG IN")).click();
		driver.navigate().refresh();

		WebElement email = driver.findElement(By.name("logonId"));
		email.sendKeys("sohi@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345678");
		driver.findElement(By.className("form-input-password__eye-icon")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		//search
		driver.navigate().refresh();

		 driver.findElement(By.xpath("//a[@class='layout-header-search-link__link']")).click();
		 Thread.sleep(1000);
		 WebElement search=driver.findElement(By.className("search-products-form__input"));
		 search.sendKeys("bags");
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//button[@class='filters__button']//child::span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='zds-accordion-item__trigger'][1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='Casual']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='COLOR']")).click();
		 driver.findElement(By.xpath("//span[text()='Black']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='Beige']")).click();
		 Thread.sleep(1000);

		 driver.findElement(By.className("filters-panel__buttons-results")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("MOCK CROC MINI TOTE BAG")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@aria-label='Edit MOCK CROC MINI TOTE BAG']")).click();
		 Thread.sleep(1000);

		 WebElement slogan = driver.findElement(By.xpath("//div[@class=\"form-input form-input--has-help product-detail-customization-message-area-form__text product-detail-customization-message-area-form__text--uppercase\"]//child::div//child::div//child::input"));
		 slogan.sendKeys("SM");
		 Thread.sleep(1000);	
		 driver.findElement(By.xpath("//div[@class='product-detail-customization-message-area-form__colors-wrapper']//child::label[4]")).click();
	     //driver.findElement(By.cssSelector("button[class='zds-button product-detail-customization-message__button-submit zds-button--secondary zds-button--small']"));
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("button[class='zds-button product-detail-customization-message__button-submit zds-button--secondary zds-button--small']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("GO TO HOMEPAGE")).click();
		

		 //open menu
		 driver.navigate().refresh();
		 driver.findElement(By.cssSelector("button[aria-label='Open Menu']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("li[class$='layout-categories-category--is-highlighted layout-categories-category--level-1']")).click();
		 driver.findElement(By.cssSelector("a[aria-label='HOME, Show other categories']")).click();
		 Thread.sleep(1000);

		 driver.findElement(By.linkText("LIVING ROOM | DECO")).click();
		 driver.findElement(By.xpath("//li[@data-seocategoryid='2121']//child::a//child::span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("img[alt='Image 0 of SMOKY GLASS LAMP BASE from Zara']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("button[aria-label='Add to cart SMOKY GLASS LAMP BASE']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("GO TO HOMEPAGE")).click();
		 driver.close();
		// Thread.sleep(6000);
		//driver.navigate().back();
	
	}

}
