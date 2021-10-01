package com.automation;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Refresh extends Driver_Setup {

	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(priority = 6)
	public static void refresh_Page() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// navigate( ).to( )
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);

		// navigate( ).back( )
		driver.navigate().back();
		Thread.sleep(3000);

		// navigate( ).forward( )
		driver.navigate().forward();
		Thread.sleep(3000);

		// navigate( ).refresh( )
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

}
