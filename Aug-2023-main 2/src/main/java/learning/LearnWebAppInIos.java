package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppInIos extends GenericWrappers {

    @Test
    public void runCode() {
        launchSafariBrowser("iPhone", "https://www.google.com", "ef3d080ab7588f92911b1204e05028d81aaf9587");
        enterValue(getWebElement(Locators.ID.asString(), "XSqSsc"), "Lokesh", false);
        click(getWebElement(Locators.NAME.asString(), "q"));
        clickGivenKeyboardButtonInIosByAccessibilityId("Search");
//        switchNativeView();
//        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Search"));
//        switchWebView();
        sleep(5000);
        closeApp();
    }
}
