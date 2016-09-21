package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import io.appium.java_client.android.AndroidDriver;

public class FacebookScreen extends BasePage {

	By emailOrMobileWeb = By.xpath("//android.widget.EditText[@text='Email address or phone number']");

	By userPasswordWeb = By.id("u_0_2");

	By fbloginBtnWeb = By.id("u_0_6");

	By emailOrMobileNative = By.id("com.facebook.katana:id/login_username");

	By userPasswordNative = By.id("com.facebook.katana:id/login_password");
                                 		
	By fbloginBtnNative = By.id("com.facebook.katana:id/login_login");

	By fbLogoNative = By.id("com.facebook.katana:id/login_fb_logo");

//	By fbAuthBtnNative = By.id("u_0_9");
	By fbAuthBtnNative = By.xpath("//android.widget.Button[@content-desc='Continue']");
	By fbAuthBtnWeb = By.id("u_0_a");

	public FacebookScreen(AndroidDriver driver) {

		super(driver);

	}

	public boolean decideAuthNative() throws InterruptedException {
		Thread.sleep(15000);
		//waitForVisibilityOf(fbAuthBtnNative);
		try {
			driver.findElement(fbAuthBtnNative);
			return true; // Success!
		} catch (NoSuchElementException ignored) {
			return false;
		}
	}

	public boolean decideAuthWeb() {
		try {
			driver.findElement(fbAuthBtnWeb);
			return true; // Success!
		} catch (NoSuchElementException ignored) {
			return false;
		}
	}

	public boolean decideNativeWeb() {
		try {
			driver.findElement(fbLogoNative);
			return true; // Success!
		} catch (NoSuchElementException ignored) {
			return false;
		}
	}

	public void setUserNameWeb(String strUserName) {
		//waitForVisibilityOf(emailOrMobileWeb);
		driver.findElement(emailOrMobileWeb).clear();
		driver.findElement(emailOrMobileWeb).sendKeys(strUserName);

	}

	public void setPasswordWeb(String strPassword) {
		//waitForVisibilityOf(userPasswordWeb);
		//driver.findElement(userPasswordWeb).clear();
		driver.findElement(userPasswordWeb).sendKeys(strPassword);

	}

	public void clickFbLoginWeb() {
		//waitForVisibilityOf(fbloginBtnWeb);
		driver.findElement(fbloginBtnWeb).click();

	}

	public void clickFbAuthWeb() {
		//waitForVisibilityOf(fbAuthBtnWeb);
		driver.findElement(fbAuthBtnWeb).click();

	}

	public void setUserNameNative(String strUserName) {
		//waitForVisibilityOf(emailOrMobileNative);

		driver.findElement(emailOrMobileNative).clear();
		driver.findElement(emailOrMobileNative).sendKeys(strUserName);
		//.sendKeyEvent(16);

	}

	public void setPasswordNative(String strPassword) {
		//waitForVisibilityOf(userPasswordNative);

		driver.findElement(userPasswordNative).click();
		driver.findElement(userPasswordNative).sendKeys(strPassword);

	}

	public void clickFbLoginNative() {
		//waitForVisibilityOf(fbloginBtnNative);
		driver.findElement(fbloginBtnNative).click();

	}

	public void clickFbAuthNative() {
		waitForVisibilityOf(fbAuthBtnNative);
		driver.findElement(fbAuthBtnNative).click();

	}

}
