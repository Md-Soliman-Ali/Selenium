package TestNG.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation_01 
{
	@BeforeClass
	public static void beforeClass() 
	{
		System.out.println("This is before Class.....3.3");
	}
	
	@BeforeMethod
	public static void beforeMethod() 
	{
		System.out.println("This is before Method.....4.4");
	}
	
	@Test
	public static void testA() 
	{
		System.out.println("This is test.....A.1");
	}
	
	@Test
	public static void testB() 
	{
		System.out.println("This is test.....B.1");
	}
	
	@Test
	public static void testC() 
	{
		System.out.println("This is test.....C.1");
	}
	
	@Test
	public static void testD() 
	{
		System.out.println("This is test.....D.1");
	}
	
	@AfterMethod
	public static void afterMethod() 
	{
		System.out.println("This is after Method.....5.5");
	}
	
	@AfterClass
	public static void afterClass() 
	{
		System.out.println("This is after Class.....6.6");
	}
}
