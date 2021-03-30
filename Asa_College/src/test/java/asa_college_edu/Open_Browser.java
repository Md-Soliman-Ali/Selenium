package asa_college_edu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class Open_Browser 

{
	public static WebDriver driver ;
	public static String myBrowser = "Chrome";
	public static String myUrl = "https://www.asa.edu/";
	
	public static WebDriver getDriver() throws Exception 
	{
		if (driver == null) 
		{
			if (myBrowser.equalsIgnoreCase("Firefox")) 
			{
				System.setProperty("webdriver.firefox.marionette", ".//geckodriver");
				driver = new FirefoxDriver();
			} 
			
			else if (myBrowser.equalsIgnoreCase("Chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
				driver = new ChromeDriver();
			} 
			
			else if (myBrowser.equalsIgnoreCase("IE")) 
			{
				System.setProperty("webdriver.ie.driver", ".//IEDriverServer");
				driver = new InternetExplorerDriver();
			} 
			
			else 
			{
				throw new Exception("Browser is not correct");
			}
			
		}
		return driver;
	}
	
	public static void invokeMyBrowser() throws Exception 
	{
		getDriver().get(myUrl);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);;
		getDriver().manage().window().maximize();
	}
	
	@BeforeTest
	public static void beforeTest() throws Exception {
		
		invokeMyBrowser();
		
	}
	
}
