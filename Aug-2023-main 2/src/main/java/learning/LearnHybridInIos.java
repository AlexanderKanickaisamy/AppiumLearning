package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridInIos extends GenericWrappers {

    @Test
    public void runCode() {
        launchIosApp("iPhone 14", "ef3d080ab7588f92911b1204e05028d81aaf9587", "", "com.example.apple-samplecode.UICatalog", "");
        swipe("up");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Web View"));
        printContext();
        sleep(5000);
        switchWebView();
        System.out.println(driver.getPageSource());
        click(getWebElement(Locators.XPATH.asString(), "//a[@data-analytics-title=\"Learn more about iPhone 15 Pro\"]"));
        click(getWebElement(Locators.XPATH.asString(), "//a[@data-analytics-title=\"watch the event\"]"));
        sleep(5000);
        closeApp();
    }
}
