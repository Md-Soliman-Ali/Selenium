import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WriteOnTextBox extends DriverSetup {

    @Test
    public void writeOnTextBox() {
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();

        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("userName"))).sendKeys("Md Soliman Ali");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        String name = driver.findElement(By.cssSelector("#name")).getText();
        Assert.assertTrue(name.contains("Md Soliman Ali"));
    }
}
