package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnScrollUsingWrappers extends GenericWrappers {

    @Test
    public void runCode() {
        launchAndroidApp("sdgf", "", "", "UiAutomator2", "/apks/MultiTouch Tester_v1.2.apk");
        swipe("up");
        swipe("down");
        swipe("left");
        swipe("right");
        pinchInApp();
        zoomInApp();
        doubleTap(200, 200);
        longPress(500, 500);
        closeApp();
    }
}