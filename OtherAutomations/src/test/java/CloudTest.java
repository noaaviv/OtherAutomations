import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudTest {
    private static RemoteWebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", "oauth-noaa476-fbcd5");
        capabilities.setCapability("accessKey", "ef1df7e0-eec4-4204-8988-a5681f08b943");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "81.0");
        capabilities.setCapability("build", "Onboarding Sample App - Java-TestNG");
        capabilities.setCapability("name", "3-cross-browser");
        driver = new RemoteWebDriver(new URL("https://oauth-noaa476-fbcd5:ef1df7e0-eec4-4204-8988-a5681f08b943@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}