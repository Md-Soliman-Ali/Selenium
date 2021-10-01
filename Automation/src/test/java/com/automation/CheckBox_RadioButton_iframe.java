package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBox_RadioButton_iframe extends Driver_Setup {

	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	@Test(priority = 3)
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Switch to Frame
		driver.switchTo().frame(0);

		// Operate Elements
		// driver.findElement(By.xpath("(//span[contains(@class,'checkboxradio')])[5]")).click();
		driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[3]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[3]/span[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]")).click();
		Thread.sleep(5000);

		// Back to page
		driver.switchTo().defaultContent();
	}
}
