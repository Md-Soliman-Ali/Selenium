import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})

public class AllureReporting extends BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void setup() {

        BaseClass baseClass = new BaseClass();
        baseClass.initialize_driver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1, description = "Verify Logo Present on Home Page")
    @Description("Verify Logo Present on Home Page ... ")
    @Epic("EP001")
    @Feature("Feature1: Logo")
    @Story("Story: Logo Present")
    @Step("Verify Logo Present")
    @Severity(SeverityLevel.MINOR)
    public void logoPresent() {
        boolean displayStatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        Assert.assertEquals(displayStatus, true);
    }

    @Description("Verify Login ... ")
    @Epic("EP002")
    @Feature("Feature2: Login")
    @Story("Story: UnValid Login")
    @Step("Verify Login")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 2)
    public void LoginTest() {
        driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("training@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Dashboard");
    }

    @Description("Verify User Registration ... ")
    @Epic("EP003")
    @Feature("Feature3: Registration")
    @Story("Story: User Registration")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 3)
    public void RegistrationTest() {
        throw new SkipException("Skipping This Test");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
