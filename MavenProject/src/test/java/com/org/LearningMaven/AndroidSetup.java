package com.org.LearningMaven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {
    //public AndroidDriver driver;
    public AppiumDriver driver;

    public void SettingUpAppium() throws MalformedURLException {
         
           	 File appDir = new File("/home/tarun/Downloads");
             File app = new File(appDir,"OLX_v4.0.7.apk");
             DesiredCapabilities cap=new DesiredCapabilities();
             cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
             cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
          // cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
             cap.setCapability(MobileCapabilityType.APP, app);
          // cap.setCapability("noReset", true);
             driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }
	
}
