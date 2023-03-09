package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
    static public   RemoteWebDriver driver;
    @BeforeClass
    public static void b(){
        driver=DriverConfig.create(EMULATORS.PIXEL_2610);
    }
    @AfterClass
    public static void a() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
