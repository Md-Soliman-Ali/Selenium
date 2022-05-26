import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WriteOnTextBox extends DriverSetup {

    @Test
    public void writeOnTextBox() throws InterruptedException {
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();

        // Explicit Wait
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userName']"))).sendKeys("Md. Soliman Ali");

        WebElement element = driver.findElement(By.xpath("//button[@id='submit']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);

        // Attribute (CSS Selector)
        String text = driver.findElement(By.cssSelector("#name")).getText();
        Assert.assertTrue(text.contains("Md. Soliman Ali"));
    }
}
