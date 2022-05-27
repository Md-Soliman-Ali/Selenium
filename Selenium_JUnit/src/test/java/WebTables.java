import org.junit.Test;
import org.openqa.selenium.By;

public class WebTables extends DriverSetup {

    @Test
    public void webTables() {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.xpath("//span[@id='edit-record-3']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
}
