package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider extends Driver_Setup {

	public static String baseUrl = "https://jqueryui.com/slider/";

	@Test(priority = 10)
	public static void slider_Check() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(3000);

		// Horizontal Slider
		driver.switchTo().frame(0);

		WebElement element01 = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element01, 300, 0).build().perform();
		Thread.sleep(3000);

		actions.dragAndDropBy(element01, -200, 0).build().perform();
		Thread.sleep(3000);

		// Vertical Slider
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(3000);

		driver.switchTo().frame(0);

		WebElement element02 = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		actions.dragAndDropBy(element02, 0, 100).build().perform();
		Thread.sleep(3000);

		actions.dragAndDropBy(element02, 0, -200).build().perform();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
	}

}
