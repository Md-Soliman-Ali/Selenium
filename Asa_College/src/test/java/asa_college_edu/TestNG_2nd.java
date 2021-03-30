package asa_college_edu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_2nd extends Open_Browser 
{
	
	@BeforeClass
	public static void beforeClass() throws Exception 
	{		
		Thread.sleep(2000);
		String title =driver.getTitle();
		System.out.println("Application title is = " +title);
		
		if (title.equals("Covid-19 Resources - ASA")) 
		{
			System.out.println("Screen is ready to test");
		}
		
		else 
		{
			System.out.println("This is not a correct screen to perform the testing");
			System.out.println(" the wrong screen tile is = " + title);
		}
	}
	
	@BeforeMethod
	public static void beforeMethod() 
	{
		
		System.out.println("Test Starts from here for second class");
	}
	
	
	@Test
	public static void testC() throws Exception 
	{
		
		WebElement el = driver.findElement(By.xpath("//span[.='COVID-19 Resources']"));
		String appText = el.getText();
		
		if (appText.equals("COVID-19 Resources")) 
		{
			Assert.assertTrue(true);
			System.out.println("Expected and actual result matched and The app text = " + appText );
			System.out.println("Correct element found by the test and this is test No. 3");
			
		}
		
		else 
		{
			System.out.println("Expected and actual result didn't matched and The app text = " + appText );
			Assert.fail();
			
		}
	}
	
	
	@Test
	public static void testD() throws Exception 
	{
		List listOfLink = driver.findElements(By.tagName("a"));
		int totalLink = listOfLink.size();
		System.out.println("Total number of link in the webPage " + totalLink);
		
		if(totalLink==404) 
		{
			Assert.assertTrue(true);
			System.out.println("Expected and actual result matched and The web page total link  = " + totalLink );
			System.out.println("Correct element found by the test and this is test No. 4");			
		}
		
		else 
		{
			System.out.println("Expected and actual result didn't matched and The web page total link  = " + totalLink );
			Assert.fail();
						
		}		
	}
	
	@AfterMethod
	public static void afterMethod() 
	{
		
		System.out.println("Test ends here for second class");
	}
	
	@AfterClass
	public static void afterClass() throws Exception 
	{

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		String title =driver.getTitle();
		System.out.println("Application title is = " +title);
		
		if (title.equals("ASA College | Brooklyn & Manhattan | Institutionally Accredited College")) 
		{
			System.out.println("This is home page and all testing compleate successfully");
		}
		
		else 
		{
			System.out.println("This is not home page");
			System.out.println(" the wrong screen tile is = " + title);
		}
		
		System.out.println("After Class Executes successfully");
	}

}
