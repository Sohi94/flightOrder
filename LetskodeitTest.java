package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LetskodeitTest extends Base {

	String url = "https://www.letskodeit.com/";
	String url2 = "https://www.letskodeit.com/practice";

	// @Test
	public void startLearningButton() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Start Learning']")).click();

	}

	 @Test
	public void signInButton() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.linkText("SIGN IN")).click();
		WebElement email = driver.findElement(By.cssSelector("input#email.form-control.input-md"));
		email.sendKeys("Sohi");
		WebElement password = driver.findElement(By.cssSelector("input#login-password"));
		password.sendKeys("1424_Sohi");
	}

	 @Test
	public void practicePage() throws InterruptedException {
		driver.get(url2);

		boolean checkBMW = true;
		boolean checkBenz = false;
		boolean checkHonda = true;

		if (checkBMW == true) {
			WebElement bmwCheckBox = driver.findElement(By.cssSelector("input#bmwcheck"));
			bmwCheckBox.click();
		}
		if (checkBenz == true) {
			WebElement benzCheckBox = driver.findElement(By.cssSelector("input#benzcheck"));
			benzCheckBox.click();
		}
		if (checkHonda == true) {
			WebElement hondaCheckBox = driver.findElement(By.cssSelector("input#hondacheck"));
			hondaCheckBox.click();

		}

		WebElement selectCarClass = driver.findElement(By.cssSelector("select#carselect"));
		selectCarClass.click();

		String selectClass = "Honda";

		switch (selectClass) {
		case "BMW":
			WebElement selectBMW = driver.findElement(By.cssSelector("option[value='bmw']"));
			selectBMW.click();
			break;
		case "Benz":
			WebElement selectBenz = driver.findElement(By.cssSelector("option[value='benz']"));
			selectBenz.click();
			break;
		case "Honda":
			WebElement selectHonda = driver.findElement(By.cssSelector("option[value='honda']"));
			selectHonda.click();
			break;

		}

	}

	 @Test
	public void practice_RadioButton() throws InterruptedException {
		driver.get(url2);
		String clickOnCar1 = "BMW";
		String clickOnCar2 = "Benz";
		String clickOnCar3 = "Honda";

		String radioButton = "Honda";

		switch (radioButton) {
		case "BMW":
			WebElement bmwRadioButton = driver.findElement(By.cssSelector("input#bmwradio"));
			bmwRadioButton.click();
			break;
		case "Benz":
			WebElement benzRadioButton = driver.findElement(By.cssSelector("input#benzradio"));
			benzRadioButton.click();
			break;
		case "Honda":
			WebElement hondaRadioButton = driver.findElement(By.cssSelector("input#hondaradio"));
			hondaRadioButton.click();
			break;
		default:
			System.out.println("you cannot click on more than one button");

		}
	}

	 @Test
	public void practice_MultipleSelect() throws InterruptedException {
		driver.get(url2);

		WebElement multiSelect1 = driver.findElement(By.id("multiple-select-example"));
		Select selectOp1 = new Select(multiSelect1);
		selectOp1.selectByValue("apple");

		WebElement multiSelect2 = driver.findElement(By.id("multiple-select-example"));
		Select selectOp2 = new Select(multiSelect2);
		selectOp2.selectByValue("orange");

		WebElement multiSelect3 = driver.findElement(By.id("multiple-select-example"));
		Select selectOp3 = new Select(multiSelect3);
		selectOp3.selectByValue("peach");

	}

	 @Test
	public void practice_AutoSuggest() throws InterruptedException {
		driver.get(url2);

		WebElement textBox = driver.findElement(By.cssSelector("#autosuggest.inputs"));
		textBox.sendKeys("write your comments here");
		Thread.sleep(2000);
		textBox.sendKeys(Keys.CONTROL + "A");
		textBox.sendKeys(Keys.DELETE);
		textBox.sendKeys("comment box");

	}

	 //@Test
	public void practice_EnabledVsDisabled() throws InterruptedException {
		driver.get(url2);

		boolean isButtonEnabled = true;
		boolean isButtonDisabled = false;

		if (isButtonEnabled == true) {
			System.out.print("It is Enabled");

			WebElement enabledButton = driver.findElement(By.cssSelector("#enabled-button"));
			enabledButton.click();

			WebElement enabledButtonInput = driver.findElement(By.cssSelector("#enabled-example-input"));
			enabledButtonInput.click();
			enabledButtonInput.sendKeys("It is Enabled");

		} else if (isButtonDisabled == true) {
			System.out.print("It is Disabled");
			WebElement disabledButton = driver.findElement(By.cssSelector("#disabled-button"));
			disabledButton.click();
		} else {
			System.out.print("both are false");

		}

	}

	 @Test
	public void practice_ElementDisplayed() throws InterruptedException {
		driver.get(url2);

		boolean isHideButtonOn = false;
		boolean isShowButtonOn = true;

		if (isHideButtonOn == true) {
			System.out.print("you clicked on Hide Button");

			WebElement clickHideButton = driver.findElement(By.cssSelector("#hide-show-example-div"));
			clickHideButton.click();

		} else if (isShowButtonOn == true) {
			System.out.print("you clicked on Show button");

			WebElement clickShowButton = driver.findElement(By.cssSelector("#show-textbox"));
			clickShowButton.click();
			WebElement showButtonInput = driver.findElement(By.cssSelector("#displayed-text"));
			showButtonInput.click();
			showButtonInput.sendKeys("The Show button is On");
		} else {
			System.out.print("both are false");
		}

	}

	//@Test
	public void practice_SwitchToAlert() throws InterruptedException {
		driver.get(url2);
		// By.cssSelector("#alert-example-div"));

		boolean clickOnAlert = false;
		boolean clickOnConfirm = true;

		WebElement nameBox = driver.findElement(By.cssSelector("#name.inputs"));
		nameBox.click();
		nameBox.sendKeys("Sohi");

		if (clickOnAlert == true) {
			WebElement alertButton = driver.findElement(By.id("alertbtn"));
			alertButton.click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		}
		if (clickOnConfirm == true) {
			WebElement confirmButton = driver.findElement(By.id("confirmbtn"));
			confirmButton.click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);

		}

	}



	// @Test
	public void browsingAllCourses() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Start Learning']")).click();

	}

	// @Test
	public void homePage() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.linkText("HOME")).click();

	}

}
