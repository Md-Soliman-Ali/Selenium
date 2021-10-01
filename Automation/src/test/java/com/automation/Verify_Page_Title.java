package com.automation;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Page_Title extends Driver_Setup {

	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test(priority = 1)
	public static void verify_Title() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String pageTitleActual = driver.getTitle();
		System.out.println("The Page Title is: " + pageTitleActual);
		Thread.sleep(3000);

		String pageTitleExpected = "My Store";
		Assert.assertEquals(pageTitleActual, pageTitleExpected);
	}

	@Test(priority = 2)
	public static void isWebsite_Secured() throws InterruptedException {
		String myUrl = driver.getCurrentUrl();

		if (myUrl.contains("https")) {
			System.out.println("Site is Secured");
		} else {
			System.out.println("Site is not Secured");
		}
	}
}
