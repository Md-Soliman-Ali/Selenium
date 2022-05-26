import org.junit.Assert;
import org.junit.Test;

public class GetTitle extends DriverSetup {

    @Test
    public void getTitle() {
        driver.get("https://www.icab.org.bd");

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("ICAB - The Institute of Chartered Accountants of Bangladesh"));
    }
}
