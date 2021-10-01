package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends Driver_Setup {

	public static String baseUrl = "https://jqueryui.com/droppable";

	@Test(priority = 9)
	public static void dragAndDrop() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.switchTo().frame(0);

		WebElement element01 = driver.findElement(By.id("draggable"));
		WebElement element02 = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(element01, element02).build().perform();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
	}
}
