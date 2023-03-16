import config.BaseClass;
import io.appium.java_client.MobileElement;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.SettingObject;
import pages.SettingsField;


public class TestNative extends BaseClass {
    static SettingObject settingObject;

    @BeforeClass
    public static void bTestNative() {
        preSettings();
    }
    @Test
    public void test1(){
        System.out.println("hello");
        settingObject.buttonDoneClick();
        settingObject.clickMenu();
        settingObject.setNotification(true);
}

    private static void preSettings() {
        settingObject.print_name(SettingsField.TEMPERATURE);
        settingObject.print_name(SettingsField.WIND_SPEED);
        settingObject.selectTemp(true);
       settingObject.selectSpeed("km");
         settingObject.buttonDoneClick();
         settingObject.selectTimeFormat(true);
    }
}
