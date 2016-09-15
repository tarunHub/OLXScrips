package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class ForgotPasswordScreen extends BasePage{
 
	By submitBtnEmailMobile = By.id("com.olx.southasia:id/apb_submit");
	
	By userEmailOrMobile  =By.id("com.olx.southasia:id/value");
	
    By submitOtpBtn = By.id("com.olx.southasia:id/btn_proceed");
	
	By Otp  =By.id("com.olx.southasia:id/value");
	
	By passwordfield=By.id("com.olx.southasia:id/value");
	
	By submitPwdBtn=By.id("com.olx.southasia:id/apb_submit");
	
	public ForgotPasswordScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public void clickSubmitBtn(){

         driver.findElement(submitBtnEmailMobile).click();

 }
	 public void setEmailOrMobile(String emailMobile) {
			//waitForVisibilityOf(emailOrMobileWeb);
			driver.findElement(userEmailOrMobile).sendKeys(emailMobile);

		}
	 public void setOtp(String OTP) {
			//waitForVisibilityOf(emailOrMobileWeb);
			driver.findElement(Otp).sendKeys(OTP);
	}
	 public void clickSubmitOTPBtn(){

         driver.findElement(submitOtpBtn).click();

 }
	 public void setPassword(String password) {
			waitForVisibilityOf(passwordfield);
			driver.findElement(passwordfield).sendKeys(password);

		}
	 public void clickSubmitPassword(){

         driver.findElement(submitPwdBtn).click();

 }
}
