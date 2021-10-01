package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Driver_Setup {

	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(priority = 4)
	public static void select_Value_From_Dropdown() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		WebElement element = driver.findElement(By.name("cars"));

		Select select = new Select(element);
		Thread.sleep(3000);

		select.selectByIndex(1);
		Thread.sleep(3000);

		// deselectAll( ):
		// deselectByValue( )
		// deselectByVisibleText( ):
		// getAllSelectedOptions( ):

		driver.switchTo().defaultContent();
	}

	@Test(priority = 5)
	public static void select_MultipleValue_From_Dropdown() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		WebElement element = driver.findElement(By.name("cars"));
		Select select = new Select(element);

		// Select more than one item
		Actions multiple = new Actions(driver);
		multiple.keyDown(Keys.CONTROL).click(select.getOptions().get(1)).click(select.getOptions().get(3))
				.keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();
	}

}
