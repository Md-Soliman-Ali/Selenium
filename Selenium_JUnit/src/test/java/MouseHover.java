import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends DriverSetup {

    @Test
    public void mouseHover() throws InterruptedException {
        driver.get("http://www.icab.org.bd/");
        WebElement mainMenu = driver.findElement(By.xpath("//a[normalize-space()='About ICAB']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        Thread.sleep(5000);

        WebElement subMenu = driver.findElement(By.xpath("//a[normalize-space()='Vision, Mission and Values']"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }
}
