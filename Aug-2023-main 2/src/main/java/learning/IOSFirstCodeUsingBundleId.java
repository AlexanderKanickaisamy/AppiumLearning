package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class IOSFirstCodeUsingBundleId {

    public static void main(String[] args) throws MalformedURLException, InterruptedException, URISyntaxException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
        dc.setCapability("deviceName", "iPhone 14");
        dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
        //dc.setCapability("app", System.getProperty("user.dir") + "/apks/UiCatalog.zip");
        dc.setCapability("automationName", "XCUITest");
        AppiumDriver driver = new AppiumDriver(new URI("http://0.0.0.0:4723/wd/hub").toURL(), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
        driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
