import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown extends DriverSetup {

    @Test
    public void selectDropDown() {
        driver.get("https://demoqa.com/select-menu");

        // Single Select
        Select color = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
        color.selectByIndex(1);

        // Multiple Select
        Select cars = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        if (cars.isMultiple()) {
            cars.selectByValue("volvo");
            cars.selectByValue("audi");
        }
    }
}
