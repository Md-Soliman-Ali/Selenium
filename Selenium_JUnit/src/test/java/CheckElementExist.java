import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class CheckElementExist extends DriverSetup {

    @Test
    public void checkElementExist() throws InstantiationException {
        driver.get("https://demoqa.com");
        Boolean status = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertEquals(true, status);
    }
}
