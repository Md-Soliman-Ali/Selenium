import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakingScreenShots {

    WebDriver driver;

    @Test(description = "Screenshot of a complete page")
    public void screenshotOfPage() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File target = new File("Screenshot/homePage.png");
        FileUtils.copyFile(src, target);

        driver.close();
    }

    @Test(description = "Screenshot of Section of a Page")
    public void screenshotOfSectionInPage() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        WebElement pageSection = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));

        highlightElement(pageSection, driver);

        File src = pageSection.getScreenshotAs(OutputType.FILE);
        File target = new File("Screenshot/SectionPage.png");
        FileUtils.copyFile(src, target);

        driver.close();
    }

    @Test(description = "Screenshot of a WebElement")
    public void screenshotOfWebElement() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        WebElement pageSection = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        highlightElement(pageSection, driver);

        File src = pageSection.getScreenshotAs(OutputType.FILE);
        File target = new File("Screenshot/logo.png");
        FileUtils.copyFile(src, target);

        driver.close();
    }

    void highlightElement(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='2px solid red'", element);
    }
}
