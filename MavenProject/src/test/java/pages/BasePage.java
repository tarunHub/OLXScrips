package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import scenarios.AndroidSetup;

import com.org.LearningMaven.AndroidSetup;

import io.appium.java_client.android.AndroidDriver;

public class BasePage extends AndroidSetup {

    public AndroidDriver driver;
      //  String app_package_name = "app.goplus.in.myapplication.qa:id/";

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
          }
    protected void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}

