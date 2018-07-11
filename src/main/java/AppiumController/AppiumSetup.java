package AppiumController;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetup {


AppiumDriver appiumDriver;

@BeforeClass
    public void setUp() throws MalformedURLException {
// Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();
// Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app", "/Users/jitender/Downloads/jituAppiumSampleTest/src/Resources/MarutiCare_2.1.9.apk");
        capabilities.setCapability("appPackage", "com.sodel.maruticare");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformVersion", "8.1.0");

        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
    }

}
