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

        Actions action = new Actions(driver);
        List<WebElement> list = driver.findElements(By.cssSelector("button"));
        action.doubleClick(list.get(1)).perform();

        String message_01 = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
        Assert.assertTrue(message_01.contains("You have done a double click"));

        // Right Click (Context Click)
        action.contextClick(list.get(2)).perform();
        String message_02 = driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
        Assert.assertTrue(message_02.contains("You have done a right click"));

        // list.get(3).click();
        action.click(list.get(3)).perform();
        String message_03 = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText();
        Assert.assertTrue(message_03.contains("You have done a dynamic click"));
    }
}
