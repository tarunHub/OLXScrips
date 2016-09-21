package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class LoginScreen extends BasePage {

	By emailOrMobile = By.xpath("//android.widget.Button[@content-desc='username']");

	By userPassword = By.xpath("//android.widget.Button[@content-desc='Password']");

	By loginBtn = By.id("com.olx.southasia:id/btnLogInNew");

	By forgotPasswordLink = By.id("com.olx.southasia:id/txtForgetPassword");

	By fbLoginBtn = By.id("com.olx.southasia:id/btnFb");

	By registerLink = By.id("com.olx.southasia:id/txtRegister");

	public LoginScreen(AndroidDriver driver) {

		super(driver);

	}

	public void setUserName(String strUserName) {

		driver.findElement(emailOrMobile).sendKeys(strUserName);
		

	}

	public void setPassword(String strPassword) {

		driver.findElement(userPassword).sendKeys(strPassword);

	}

	public void clickLogin() {

		driver.findElement(loginBtn).click();

	}
	
	public void clickforgotPasswordLink() {

		driver.findElement(forgotPasswordLink).click();

	}
	
	public void clickfbLoginBtn() {

		driver.findElement(fbLoginBtn).click();

	}
	
	public void clickregisterLink() {

		driver.findElement(registerLink).click();

	}

}
