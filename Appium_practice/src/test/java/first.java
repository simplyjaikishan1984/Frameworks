import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class first {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_X01BDA");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.asus.calculator");
        desiredCapabilities.setCapability("appActivity", "com.asus.calculator.Calculator");

        // desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\ApiDemos-debug.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();
        MobileElement ele1= (MobileElement) driver.findElementById("digit7");
        MobileElement ele2= (MobileElement) driver.findElementById("plus");
        MobileElement ele3= (MobileElement) driver.findElementById("digit8");
        MobileElement ele5= (MobileElement) driver.findElementById("plus");
        MobileElement ele6= (MobileElement) driver.findElementById("digit8");


        MobileElement ele4= (MobileElement) driver.findElementById("equal");
        MobileElement result= (MobileElement) driver.findElementById("resultEditTextID");

        ele1.click();
        ele2.click();
        ele3.click();
        ele5.click();
        ele6.click();
        ele4.click();
        System.out.println(result.getText());


    }


    }

