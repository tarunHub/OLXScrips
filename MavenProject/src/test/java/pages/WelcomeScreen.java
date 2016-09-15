package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class WelcomeScreen extends BasePage {

	By permissionAllow = By.id("com.android.packageinstaller:id/permission_allow_button");
	By permissionDeny = By.id("com.android.packageinstaller:id/permission_deny_button");
	By neverAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");

	By nextBtn = By.id("com.olx.southasia:id/btnNext");
	By skipBtn = By.id("com.olx.southasia:id/tvSkip");
	By doneBtn = By.id("com.olx.southasia:id/tvSkip");

	public WelcomeScreen(AndroidDriver driver) {
		super(driver);
	}

	// Click on login button

	public void allowPermission() {
		driver.findElement(permissionAllow).click();

	}

	public void denyPermission() {
		driver.findElement(permissionDeny).click();

	}

	public void neverAskAgainCheck() {

		driver.findElement(neverAskAgain).click();

	}

	public void clickNextBtn() {
		driver.findElement(nextBtn).click();
	}

	public void navigatingToDashBoard() {
		waitForVisibilityOf(nextBtn);
		for (int i = 0; i < 5; i++) {
			if (driver.findElement(nextBtn).getText().equals("Next")) {
				clickNextBtn();
				waitForVisibilityOf(permissionAllow);
				if (driver.findElement(permissionAllow).isEnabled()) {
					if (i == 3) {
						denyPermission();
					} else {
						allowPermission();
					}

				}
			} else if (driver.findElement(nextBtn).getText().equals("Done")) {
				clickNextBtn();

			}
		}
	}
}
