package TestNG.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation_02 
{
	@BeforeSuite
	public static void beforeSuit() 
	{
	
		/* this method will execute one time before all test method or executing suite included multiple class.
	    -- so for multiple class we need to declare this method only once
	    -- we may include environment related set up in this method. */
		
		System.out.println("This is before Suite.....1");
	}
	
	@BeforeTest
	public static void beforeTest() 
	{
		/* this method will execute one time before all test method and all classes after executing Suite
	     * we may include any dependent action which we need to execute only one time before executing all test method and classes.
	     * for example opening the browser. */
		
		System.out.println("This is before Test.....2");
	}
	
	@BeforeClass
	public static void beforeClass() 
	{
		/* this method will execute one time for current class only.
		 * if we need to open different URL for each class at that point we may use this method */
		
		System.out.println("This is before Class.....3");
	}
	
	@BeforeMethod
	public static void beforeMethod() 
	{
		/* this method will execute before each test method for the current class. for example if we have 10 test method for current class it will execute 10 times.
		 * for example if we have 10 test method for current class it will execute 10 times.
		 * if we need to log in before each test we may include that in this method. */
		
		System.out.println("This is before Method.....4");
	}
	
	@Test
	public static void testA() 
	{
		System.out.println("This is test.....A");
	}
	
	@Test
	public static void testB() 
	{
		System.out.println("This is test.....B");
	}
	
	@Test
	public static void testC() 
	{
		System.out.println("This is test.....C");
	}
	
	@Test
	public static void testD() 
	{
		System.out.println("This is test.....D");
	}
	
	@AfterMethod
	public static void afterMethod() 
	{
		/* this will execute after completing each test method
		 * may be if we need to log out after each test we may include this code here. */
		
		System.out.println("This is after Method.....5");
	}
	
	@AfterClass
	public static void afterClass() 
	{
		/* this will execute one time after executing all test method for current class
		 * we may close the browser for current class in this method */
		
		System.out.println("This is after Class.....6");
	}
	
	@AfterTest
	public static void afterTest() 
	{
		/*will execute one time after executing all classes for current suite.
		 * we may quite all browser here */
		
		System.out.println("This is after Test.....7");
	}
	
	@AfterSuite
	public static void afterSuit() {
		/* this method will execute one time only after executing everything 
		 * may be all environment related connection we may disconnect here. */
		System.out.println("This is after Suite.....8");
	}

}
