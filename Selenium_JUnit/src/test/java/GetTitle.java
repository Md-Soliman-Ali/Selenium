import org.junit.Assert;
import org.junit.Test;

public class GetTitle extends DriverSetup {

    @Test
    public void getTitle() {
        driver.get("https://demoqa.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("ToolsQA"));
    }
}
