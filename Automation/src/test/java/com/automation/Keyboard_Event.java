package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Keyboard_Event extends Driver_Setup {

	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test(priority = 11)
	public static void Keyboard_EventCheck() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		Thread.sleep(3000);

		element.sendKeys(Keys.chord(Keys.SHIFT, "tedtalk"));
		Thread.sleep(3000);

		// driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.DELETE));

		element.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(3000);
	}
}
