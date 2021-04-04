package shwapno;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Shwapno {

	public static WebDriver driver;
	public static String city = "Dhaka";
	public static String area = "Dhanmondi";
	public static WebElement element;
	
	@Test
	public static void chooseLocation() throws InterruptedException 
	
	{	
		// code for opening chrome browser.
				System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
				WebDriver driver = new ChromeDriver();		
				
	   // code for navigating to the URL & maximizing browser
				driver.get("https://www.shwapno.com/");				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);;
				driver.manage().window().maximize();
				Thread.sleep(2000);
		
	   // selecting from dropdown using select class
				Select se01 = new Select (driver.findElement(By.xpath("//select[@id='state']")));
			    se01.selectByVisibleText(city);
			    
			    Select se02 = new Select (driver.findElement(By.xpath("//select[@id='city']")));
			    se02.selectByVisibleText(area);
			    
	   // selecting submit button
			    driver.findElement(By.xpath("//input[@id='btnFindStore']")).click();
			    Thread.sleep(1000);		    
			    
	   // super_shop login Module
			    driver.findElement(By.xpath("//a[contains(@class,'header-login-link LoginPopUpLink')]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName']")).sendKeys("ebrahimhossaincse43@gmail.com");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password']")).sendKeys("ebrahim881");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton']")).click();
				Thread.sleep(1000);
				 
	   // super_shop find product
				driver.findElement(By.xpath("//span[normalize-space()='Half Price Offers']")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//img[@src='//storage.sg.content-cdn.io/cdn-cgi/image/width=400,height=400,quality=75,format=auto,fit=cover,g=top/in-resources/8845e144-8902-4204-b80f-9dc7dc2f4bcb/Images/ProductImages/Source/3015937.jpg']")).click();
				Thread.sleep(1000);
				
	   // super_shop add product
				driver.findElement(By.xpath("//input[@class='snackbar-msg mj_btnbg BuyNow']")).click();
				Thread.sleep(1000);
				
	  // super_shop view cart
				driver.findElement(By.xpath("//a[contains(normalize-space(),'View Cart')]")).click();
				Thread.sleep(1000);
				
				driver.close();
				driver.quit();	
	}
	
}
