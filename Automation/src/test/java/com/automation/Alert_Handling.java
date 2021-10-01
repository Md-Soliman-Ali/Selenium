package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert_Handling extends Driver_Setup {

	public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

	@Test(priority = 12)
	public static void alertHandlingCheck() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement element = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(element);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);

		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
	}
}
