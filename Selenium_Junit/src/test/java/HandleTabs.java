import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class HandleTabs extends DriverSetup {

    @Test
    public void handleTabs() throws InterruptedException {
        driver.get("https://demoqa.com/links");
        driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
        sleep(5000);

        ArrayList<String> arrayList = new ArrayList<String>(driver.getWindowHandles());

        // Switch To Open Tab
        driver.switchTo().window(arrayList.get(1));
        System.out.println("New Tab Title: " + driver.getTitle());

        // All Link Title
       /* for (String childTab : driver.getWindowHandles()) {
            driver.switchTo().window(childTab);
        }
        System.out.println(driver.getTitle()); */

        Boolean status = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertEquals(true, status);
        driver.close();
        driver.switchTo().window(arrayList.get(0));
    }

}
