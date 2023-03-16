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
    public static void bTestNative() throws InterruptedException {
        settingObject = new SettingObject(driver);
        System.out.println(driver.currentActivity());
        preSettings();
    }
    @Test
    public void test1() throws InterruptedException {
        for(int i=0;i<7;i++){
            Thread.sleep(1000);
            System.out.println(driver.currentActivity());
        }
    }

    private static void preSettings() throws InterruptedException {
        settingObject.clickMenu();
        settingObject.print_name(SettingsField.TEMPERATURE);
        settingObject.print_name(SettingsField.WIND_SPEED);
        settingObject.selectTemp(true);
       settingObject.selectSpeed("km");
         settingObject.buttonDoneClick();
         settingObject.selectTimeFormat(true);
    }
}
