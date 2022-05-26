import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckIfElementExists extends DriverSetup {

    @Test
    public void checkIfElementExists() {
        driver.get("https://www.icab.org.bd");

        wait = new WebDriverWait(driver, 20);
        //  Boolean status = driver.findElement(By.xpath("//a[@href='/']//img")).isDisplayed();
        Boolean status = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/']//img"))).isDisplayed();
        Assert.assertEquals(true, status);
    }
}
