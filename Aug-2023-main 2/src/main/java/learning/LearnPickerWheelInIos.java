package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnPickerWheelInIos extends GenericWrappers {

    @Test
    public void runCode() {
        launchIosApp("iPhone 14", "ef3d080ab7588f92911b1204e05028d81aaf9587", "", "com.example.apple-samplecode.UICatalog", "");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Picker View"));
//        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"),"20",false);
//        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"),"30",false);
//        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"),"50",false);
        chooseNextOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        chooseNextOptionInPickerWheel(Locators.ACCESSIBILITY_ID.asString(), "Red color component value");
        choosePreviousOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"));
        choosePreviousOptionInPickerWheel(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value");
        sleep(5000);
        closeApp();
    }
}
