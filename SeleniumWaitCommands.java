package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWaitCommands extends Base {

	//@Test
	public void enabled_ExplicitWait() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");

		// explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#enabled-button")));
		WebElement enableButton = driver.findElement(By.cssSelector("#enabled-button"));
		enableButton.click();

		// if (isEnabledOn==true)
		if (enableButton.isDisplayed() && enableButton.isEnabled()) {
			WebElement enabledCheckInput = driver.findElement(By.cssSelector("#enabled-example-input"));
			enabledCheckInput.click();
			enabledCheckInput.sendKeys("It is Enabled");
		}

		// driver.findElement(By.id("elementID")).isEnabled();
	}

	@Test
	public void disabled_ExplicitWait() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");


		WebElement disabledButton = driver.findElement(By.cssSelector("#disabled-button"));
		wait.until(ExpectedConditions.elementToBeClickable(disabledButton));
				 
		if	(disabledButton.isDisplayed()) {
			WebElement checkInput = driver.findElement(By.cssSelector("#enabled-example-input"));
			checkInput.click();
			checkInput.sendKeys("It is Disabled");
		}
		
		
		
		
		

	}
}
