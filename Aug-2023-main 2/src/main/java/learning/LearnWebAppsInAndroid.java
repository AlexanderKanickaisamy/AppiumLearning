package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppsInAndroid extends GenericWrappers {
    @Test
    public void runCode() {
        launchChromeBrowser("my device", "https://www.google.com");
        enterValue(getWebElement(Locators.NAME.asString(), "q"), "lokesh");
        pressEnter();
    }
}