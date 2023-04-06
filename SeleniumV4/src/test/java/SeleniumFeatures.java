import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class SeleniumFeatures {

    @Test
    public void openNewTab() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(5000L);
        driver.quit();
    }

    @Test
    public void Location() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        WebElement logo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
        System.out.println("Height: " + logo.getRect().getDimension().getHeight());
        System.out.println("Width: " + logo.getRect().getDimension().getHeight());
        System.out.println("X Location: " + logo.getRect().getX());
        System.out.println("Y Location: " + logo.getRect().getY());
        driver.quit();
    }
}
