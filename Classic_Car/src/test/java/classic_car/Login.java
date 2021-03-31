package classic_car;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Login {
	
	public WebDriver driver;
	public static String email= "murshida.metu@gmail.com";
	public static  String pass= "Selenium1";
	public static WebElement element;
	public static String expectedUser ="Hi, murshida!";
	
	
	@Test
	public static void loginAccount() throws InterruptedException {
		
		// code for opening chrome browser.
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		//code for navigating to the URL & maximizing browser
		driver.get("https://classiccars.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);;
		driver.manage().window().maximize();
		
		//We value your privacy(1)		
		driver.findElement(By.xpath("//div[@id='qc-cmp2-ui']"));
		driver.findElement(By.xpath("//button[normalize-space()='AGREE']")).click();
		
		// code for click action using selenium
		driver.findElement(By.xpath("//a[@id='UserLoginJumperLink']")).click();
		
		// code for writing something in Text box using sendkey method in selenium(2)
		driver.findElement(By.xpath("//input[@id='input-email-login']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password-login']")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='login']")).submit();
		
		//code for extracting any text from UI using get text method(3)
		element = driver.findElement(By.xpath("//div[@id='UserNameAccountLink']"));
		Thread.sleep(1000);
		String actualUIUser = element.getText();
		System.out.println("Actual user in UI = " + actualUIUser);
		
		// code for validation using if else condition
		if(actualUIUser.equals(expectedUser)) 
		{
			AssertJUnit.assertTrue(true);
			System.out.println("Application user = " +actualUIUser+ "matches with the given expected user = " + expectedUser);
		}
		
		else 
		{
			System.out.println("Application user = " +actualUIUser+ "do not match with the given expected user = " + expectedUser);
			AssertJUnit.fail();
		}
		
		driver.close();
		driver.quit();		
	}


}
