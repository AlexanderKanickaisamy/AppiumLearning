package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class AndroidFirstCode {

    public static void main(String[] args) throws MalformedURLException, InterruptedException, URISyntaxException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "my device");
        dc.setCapability("app", System.getProperty("user.dir") + "/apks/leaforg.apk");
        AppiumDriver driver = new AppiumDriver(new URI("http://0.0.0.0:4723/wd/hub").toURL(), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.className("android.widget.EditText"))
                .sendKeys("rajkumar@testleaf.com");
        driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]"))
                .sendKeys("Leaf@123");
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
