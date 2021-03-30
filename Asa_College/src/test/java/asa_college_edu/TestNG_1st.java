package asa_college_edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_1st extends Open_Browser 
{
	public static String env = "Test";
	public static String testSuiteName = "Test Suit 1";
	
	@BeforeSuite
	public static void beforeSuit() 
	{
		
		if (env.equalsIgnoreCase("Test")) 
		{
			
			System.out.println("Test executes in correct environment where environment= " + env);
			System.out.println("Test Suite name = " + testSuiteName);
			
		}
		
		else 
		{
			System.out.println("Test executes in wrong environment where environment= " + env);
			
		}
	}
	
	@BeforeClass
	public static void beforeClass() throws Exception 
	{
		
		Thread.sleep(5000);
		
		getDriver().findElement(By.xpath("//ul[@id='menu-top-menu']//a[normalize-space()='How to']")).click();
		String title =getDriver().getTitle();
		System.out.println("Application title is = " +title);
		
		if (title.equals("How to Resources | ASA COLLEGE")) 
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
		
		System.out.println("Test Starts from here");
	}
	
	
	@Test
	public static void testA() throws Exception 
	{
		WebElement el = getDriver().findElement(By.xpath("//span[contains(.,'How to Resources')]"));
		String appText = el.getText();
		System.out.println("The application text = " + appText);
		
		if(appText.equals("How to Resources")) 
		{
			Assert.assertTrue(true);
			System.out.println("Correct element found by the test and this is test No. 1");
		}
		
		else 
		{
			System.out.println("Correct element didn't found by the test");
			Assert.fail();			
		}
	}
	
	@Test
	public static void testB() throws Exception 
	{
		WebElement el = getDriver().findElement(By.xpath("//a[normalize-space()='HOW TO ACCESS YOUR STUDENT ID NUMBER']"));
		String appText = el.getText();
		System.out.println("The application text = " + appText);
		
		if(appText.equals("HOW TO ACCESS YOUR STUDENT ID NUMBER")) 
		{
			Assert.assertTrue(true);
			System.out.println("Correct element found by the test and this is test No. 2");
		}
		
		else 
		{		
			System.out.println("Correct element didn't found by the test");
			Assert.fail();			
		}
	}
	
	@AfterMethod
	public static void afterMethod() 
	{
		
		System.out.println("Test ends here");
	}
	
	@AfterClass
	public static void afterClass() throws Exception 
	{
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("//ul[@id='menu-top-menu']//a[contains(text(),'COVID-19 Resources')]")).click();
		System.out.println("After Class Executes successfully");
	}
	
	@AfterTest
	public static void afterTest() throws Exception 
	{
		if (getDriver() != null) 
		{
			getDriver().quit();
		}
		System.out.println("All test Performs Successfully and browser closed");
	}
	
	@AfterSuite
	public static void afterSuit() 
	{
		
		System.out.println( testSuiteName + " execution Complete");
	}	

}