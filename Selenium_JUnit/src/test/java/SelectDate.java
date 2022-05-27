import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SelectDate extends DriverSetup {

    @Test
    public void selectDate() {
        driver.get("https://demoqa.com/date-picker");
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).clear();
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).sendKeys("02/03/1996");
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).sendKeys(Keys.ENTER);
    }
}
