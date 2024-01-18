package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

public class LearnPointerInput {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "my device");
        dc.setCapability("noReset", true);
        dc.setCapability("app", System.getProperty("user.dir") + "/apks/MultiTouch Tester_v1.2.apk");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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

        //        Swipe down
        startX = (int) (maxX * 0.5);
        endX = (int) (maxX * 0.5);
        startY = (int) (maxY * 0.2);
        endY = (int) (maxY * 0.8);
        PointerInput input1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeDown = new Sequence(input1, 1);
        swipeDown.addAction(input1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeDown.addAction(input1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeDown.addAction(input1.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeDown.addAction(input1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeDown));

        //        Swipe left
        startX = (int) (maxX * 0.8);
        endX = (int) (maxX * 0.2);
        startY = (int) (maxY * 0.5);
        endY = (int) (maxY * 0.5);
        PointerInput input3 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeLeft = new Sequence(input3, 1);
        swipeLeft.addAction(input3.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeLeft.addAction(input3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeLeft.addAction(input3.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeLeft.addAction(input3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeLeft));

        //        Swipe right
        startX = (int) (maxX * 0.2);
        endX = (int) (maxX * 0.8);
        startY = (int) (maxY * 0.5);
        endY = (int) (maxY * 0.5);
        PointerInput input4 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeRight = new Sequence(input4, 1);
        swipeRight.addAction(input4.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeRight.addAction(input4.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeRight.addAction(input4.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeRight.addAction(input4.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeRight));


    }
}
