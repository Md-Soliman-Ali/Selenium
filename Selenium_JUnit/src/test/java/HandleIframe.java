import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class HandleIframe extends DriverSetup {

    @Test
    public void handleIframe() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame2");

        String message = driver.findElement(By.id("sampleHeading")).getText();
        Assert.assertTrue(message.contains("This is a sample page"));
        driver.switchTo().defaultContent();
    }
}
