package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick_RightClick extends Driver_Setup {

	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(priority = 8)
	public static void doubleClick_RightClick() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");

		Actions actions = new Actions(driver);

		WebElement doubleClick_Text = driver
				.findElement(By.xpath("//p[contains(text(),'The multiple attribute specifies that multiple opt')]"));
		actions.doubleClick(doubleClick_Text).build().perform();
		Thread.sleep(3000);

		WebElement rightClick = driver.findElement(By.xpath("//body/form[1]/input[1]"));
		actions.contextClick(rightClick).build().perform();

		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		// click()
		// dragAndDrop( )
		// clickAndHold( )
		// keyDown( )
		// keyUp( )
		// release( )

		// build( )
		// perform();
	}

}
