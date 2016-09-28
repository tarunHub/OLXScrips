package com.org.LearningMaven;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;
import pages.LoginScreen;
import pages.LogoutScreen;
import pages.RegisterScreen;
import pages.SMSScreen;
import pages.WelcomeScreen;
import pages.DashboardScreen;
import pages.FacebookScreen;
import pages.ForgotPasswordScreen;
import pages.LeftMenuScreen;

public class Login {
	//change test
	AndroidDriver driver;
	LoginScreen objLoginScreen;
	DashboardScreen objDashboardScreen;
	WelcomeScreen objWelcomeScreen;
	LeftMenuScreen objLeftMenuScreen;
	LogoutScreen objLogoutScreen;
	FacebookScreen objFacebookScreen;
	RegisterScreen objRegisterScreen;
SMSScreen objSMSScreen;
ForgotPasswordScreen objForgotPasswordScreen;

	@BeforeTest

	public void setup() throws MalformedURLException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apps");
		File app1 = new File(appDir, "olx.apk");
		File app2 = new File(appDir, "sms.apk");
		System.out.println(app1.getAbsolutePath());
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		// cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
		cap.setCapability(MobileCapabilityType.APP, app1);
		// cap.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objWelcomeScreen = new WelcomeScreen(driver);
		objDashboardScreen = new DashboardScreen(driver);
		objLeftMenuScreen = new LeftMenuScreen(driver);
		objLoginScreen = new LoginScreen(driver);
		objLogoutScreen = new LogoutScreen(driver);
		objFacebookScreen = new FacebookScreen(driver);
		objRegisterScreen = new RegisterScreen(driver);
	objSMSScreen=new SMSScreen(driver);
	objForgotPasswordScreen=new ForgotPasswordScreen(driver);
	}

	/*
	 Welcome Screen Tool tips
	 */
@Test(priority = 1)
	public void WelcomeScreenNavigation() throws InterruptedException {
		String expected = "Submit a Free Ad";
		Thread.sleep(10000);
		objWelcomeScreen.navigatingToDashBoard();
		String actual = objDashboardScreen.submitFreeAdText();
		Assert.assertEquals(expected, actual);
	}


/*
 User Sign in
 */
	// @Test(priority = 2)
	// public void ValidLogin() {
	// String expected = "LOG OUT";
	// objLeftMenuScreen.clickLeftMenuIcon();
	// objLeftMenuScreen.clickWelcomeToOlxOption();
	// objLoginScreen.setUserName("9540270015");
	// objLoginScreen.setPassword("olxtarun");
	// objLoginScreen.clickLogin();
	// String actual = objLogoutScreen.logoutText();
	// objLogoutScreen.clickLogoutButton();
	// Assert.assertEquals(expected, actual);
	// }


/*
User Sign in facebook
*/
	/*@Test(priority = 2)
	public void FacebookLogin() throws InterruptedException {
		String expected = "LOG OUT";
		objLeftMenuScreen.clickLeftMenuIcon();
		objLeftMenuScreen.clickWelcomeToOlxOption();
		objLoginScreen.clickfbLoginBtn();
		if (objLogoutScreen.decideLogoutScreen()) {
			String actual = objLogoutScreen.logoutText();
			objLogoutScreen.clickLogoutButton();
			Assert.assertEquals(expected, actual);
		} else if (objFacebookScreen.decideNativeWeb()) {
			objFacebookScreen.setUserNameNative("messielectra@gmail.com");
			objFacebookScreen.setPasswordNative("@)$$@@@@)&");
			objFacebookScreen.clickFbLoginNative();
			if (objFacebookScreen.decideAuthNative()) {
				objFacebookScreen.clickFbAuthNative();
			}
			String actual = objLogoutScreen.logoutText();
			objLogoutScreen.clickLogoutButton();
			Assert.assertEquals(expected, actual);
		} else if (objFacebookScreen.decideAuthNative() == false) {
			objFacebookScreen.setUserNameWeb("messielectra@gmail.com");
			objFacebookScreen.setPasswordWeb("@)$$@@@@)&");
			objFacebookScreen.clickFbLoginWeb();
			if (objFacebookScreen.decideAuthWeb()) {
				objFacebookScreen.clickFbAuthWeb();
			}
			String actual = objLogoutScreen.logoutText();
			objLogoutScreen.clickLogoutButton();
			Assert.assertEquals(expected, actual);
		} else if (objFacebookScreen.decideAuthNative()) {
			objFacebookScreen.clickFbAuthNative();
			String actual = objLogoutScreen.logoutText();
			objLogoutScreen.clickLogoutButton();
			Assert.assertEquals(expected, actual);
		} else {
			objFacebookScreen.clickFbAuthWeb();
			String actual = objLogoutScreen.logoutText();
			objLogoutScreen.clickLogoutButton();
			Assert.assertEquals(expected, actual);
		}

	}*/
	/*@Test(priority = 2)
	public void NewUserRegistration() throws InterruptedException {
		objLeftMenuScreen.clickLeftMenuIcon();
		objLeftMenuScreen.clickWelcomeToOlxOption();
		objLoginScreen.clickregisterLink();
		objRegisterScreen.setFormFields("abc",0);
		objRegisterScreen.setFormFields("abc",1);
		objRegisterScreen.setFormFields("abc",2);
		objRegisterScreen.clickRegisterNow();
}*/
	@Test(priority = 2)
	public void ForgotPassword() throws InterruptedException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apps");
		File app2 = new File(appDir, "sms.apk");
		System.out.println(app2.getAbsolutePath());
		driver.installApp(app2.getAbsolutePath());
		
	//	Thread.sleep(20000);
		String otp;
		objLeftMenuScreen.clickLeftMenuIcon();
		objLeftMenuScreen.clickWelcomeToOlxOption();
		objLoginScreen.clickforgotPasswordLink();
		objForgotPasswordScreen.setEmailOrMobile("9540270015");
		objForgotPasswordScreen.clickSubmitBtn();
		otp=objSMSScreen.readOtp();
		objForgotPasswordScreen.setOtp(otp);
		objForgotPasswordScreen.clickSubmitOTPBtn();
		objForgotPasswordScreen.setPassword("tarunolx");
		objForgotPasswordScreen.clickSubmitPassword();
		String expected = "LOG OUT";
		String actual = objLogoutScreen.logoutText();
		objLogoutScreen.clickLogoutButton();
		Assert.assertEquals(expected, actual);
		}	
	@AfterTest
	public void quitSetup(){
		driver.close();
	}
}