package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scroll extends Driver_Setup {

	public static String baseUrl = "https://www.seleniumhq.org";

	@Test(priority = 7)
	public static void scroll_Check() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);

		// Scroll to Top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);

		// Scroll to specific Element
		WebElement element = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[2]/a[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(5000);
	}

}
