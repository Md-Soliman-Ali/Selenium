import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents extends DriverSetup {

    @Test
    public void keyboardEvents() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement searchElement = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);
        actions.moveToElement(searchElement)
                .keyDown(Keys.SHIFT)
                .sendKeys("md soliman ali")
                .keyUp(Keys.SHIFT)
                .doubleClick()
                .perform();
        Thread.sleep(5000);
    }
}
