import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenShot extends DriverSetup {

    @Test
    public void takeScreenShot() throws IOException {
        driver.get("http://www.icab.org.bd/");

        File screenshot_File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String time = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
        String file_Path = "./src/test/resources/screenshots/" + time + ".jpg";
        File destination_File = new File(file_Path);
        FileUtils.copyFile(screenshot_File, destination_File);
    }
}
