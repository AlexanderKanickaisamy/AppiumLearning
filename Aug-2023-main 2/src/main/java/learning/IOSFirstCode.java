package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class IOSFirstCode {

    public static void main(String[] args) throws MalformedURLException, InterruptedException, URISyntaxException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
        dc.setCapability("deviceName", "iPhone 14");
        dc.setCapability("app", System.getProperty("user.dir") + "/apks/UiCatalog.zip");
        dc.setCapability("automationName", "XCUITest");
        AppiumDriver driver = new AppiumDriver(new URI("http://0.0.0.0:4723/wd/hub").toURL(), dc);
        Thread.sleep(5000);
        driver.quit();
    }
}
