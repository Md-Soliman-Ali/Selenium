import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadImage extends DriverSetup {

    @Test
    public void uploadImage() {
        driver.get("https://demoqa.com/upload-download");
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        uploadElement.sendKeys("D:\\SQA.png");

        String message = driver.findElement(By.xpath("//p[@id='uploadedFilePath']")).getText();
        Assert.assertTrue(message.contains("SQA.png"));
    }
}
