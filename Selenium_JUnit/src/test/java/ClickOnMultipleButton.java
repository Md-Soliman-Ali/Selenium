import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ClickOnMultipleButton extends DriverSetup {

    @Test
    public void clickOnMultipleButton() {
        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);

        List<WebElement> list = driver.findElements(By.cssSelector("button"));

        actions.doubleClick(list.get(1)).perform();     // Double Click
        String message01 = driver.findElement(By.cssSelector("#doubleClickMessage")).getText();
        Assert.assertTrue(message01.contains("You have done a double click"));

        actions.contextClick(list.get(2)).perform();    // Right Click
        String message02 = driver.findElement(By.cssSelector("#rightClickMessage")).getText();
        Assert.assertTrue(message02.contains("You have done a right click"));

        // actions.click(list.get(3)).perform();
        list.get(3).click();
        String message03 = driver.findElement(By.cssSelector("#dynamicClickMessage")).getText();
        Assert.assertTrue(message03.contains("You have done a dynamic click"));
    }
}
