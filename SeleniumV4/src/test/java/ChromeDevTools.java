import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.openqa.selenium.devtools.v85.security.Security;
import org.testng.annotations.Test;

import java.util.Optional;

public class ChromeDevTools {

    WebDriver driver;

    @Test(priority = 1, description = "Enable Network Offline")
    public void enableNetworkOffline() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        DevTools devTools = ((ChromiumDriver) driver).getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.send(Network.emulateNetworkConditions(true, 100, 1000, 2000, Optional.of(ConnectionType.WIFI)));

        try {
            driver.get("https://demo.nopcommerce.com/");
        } catch (Exception e) {
        }

        driver.quit();
    }

    @Test(priority = 2, description = "Load Insecure Web Site")
    public void LoadInsecureWebSite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        DevTools devTools = ((ChromiumDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Security.setIgnoreCertificateErrors(true));

        driver.get("https://expired.badssl.com");
        driver.quit();
    }
}
