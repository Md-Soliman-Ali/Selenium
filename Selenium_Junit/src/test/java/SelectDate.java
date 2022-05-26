import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SelectDate extends DriverSetup {

    @Test
    public void selectDate() {
        driver.get("https://demoqa.com/date-picker");

        driver.findElement(By.id("datePickerMonthYearInput")).clear();

        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.DELETE);

        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).sendKeys("03/02/1996");
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).sendKeys(Keys.ENTER);
    }
}
