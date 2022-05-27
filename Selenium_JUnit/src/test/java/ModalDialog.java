import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialog extends DriverSetup {

    @Test
    public void modalDialog() {
        driver.get("https://demoqa.com/modal-dialogs");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("showSmallModal")));
        element.click();
        driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
    }
}
