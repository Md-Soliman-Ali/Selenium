import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class HandleAlerts extends DriverSetup {

    @Test
    public void handleAlerts() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        driver.switchTo().alert().accept();     // dismiss()

        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        driver.switchTo().alert().sendKeys("Md. Soliman Ali");
        sleep(2000);
        driver.switchTo().alert().accept();

        String message = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
        Assert.assertTrue(message.contains("Md. Soliman Ali"));
    }
}
