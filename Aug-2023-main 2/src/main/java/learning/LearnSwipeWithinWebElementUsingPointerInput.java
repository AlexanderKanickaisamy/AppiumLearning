package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

public class LearnSwipeWithinWebElementUsingPointerInput {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "my device");
        dc.setCapability("noReset", true);
        dc.setCapability("appPackage", "com.android.vending");
        dc.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(5000);

        int maxY = driver.manage().window().getSize().getHeight();
        int maxX = driver.manage().window().getSize().getWidth();
        int startX = 0, startY = 0, endX = 0, endY = 0;

//        Swipe Up
        startX = (int) (maxX * 0.5);
        endX = (int) (maxX * 0.5);
        startY = (int) (maxY * 0.8);
        endY = (int) (maxY * 0.2);
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeUp = new Sequence(input, 1);
        swipeUp.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeUp.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeUp.addAction(input.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeUp.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeUp));
        driver.perform(Collections.singletonList(swipeUp));
        driver.perform(Collections.singletonList(swipeUp));

        WebElement ele = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Ads\"]/following-sibling::android.view.View)[1]"));
        Rectangle rect = ele.getRect();
        startX = rect.getX() + (int) (rect.getWidth() * 0.8);
        endX = rect.getX() + (int) (rect.getWidth() * 0.2);
        startY = rect.getY() + (int) (rect.getHeight() * 0.5);
        endY = rect.getY() + (int) (rect.getHeight() * 0.5);
        PointerInput input1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeLeft = new Sequence(input1, 1);
        swipeLeft.addAction(input1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeLeft.addAction(input1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeLeft.addAction(input1.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeLeft.addAction(input1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeLeft));

    }
}
