import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class HandleTabs extends DriverSetup {

    @Test
    public void handleTabs() throws InterruptedException {
        driver.get("https://demoqa.com/links");
        driver.findElement(By.id("simpleLink")).click();
        sleep(5000);

        ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());

        // Switch To Another Tab
        driver.switchTo().window(window.get(1));
        System.out.println("New Tab Title: " + driver.getTitle());

        Boolean status = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertEquals(true, status);

        driver.close();
        driver.switchTo().window(window.get(0));
    }
}
