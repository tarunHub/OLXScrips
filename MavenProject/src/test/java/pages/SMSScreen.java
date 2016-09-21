package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SMSScreen extends BasePage {

	By fromField = By.id("com.android.mms:id/from");
	By msgContentField = By.id("com.android.mms:id/text_view");
	By smsApp=By.id("net.everythingandroid.smspopup:id/messageTextView");
	By closeBtn=By.id("net.everythingandroid.smspopup:id/button1");
	
	public SMSScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOLXSms() {
		String smsToClick = "VK-OLXIND";
		List<WebElement> fromData = driver.findElements(fromField);
		for (WebElement e : fromData) {
			if (e.getText().contains(smsToClick)) {
				e.click();
			}
			break;
		}

	}
	public void readRecentOtp(){
			List<WebElement> allOTP=driver.findElements(msgContentField);
			int size=allOTP.size();
			String smsText=driver.findElements(msgContentField).get(size).getText();
			String otpValue=smsText.substring(smsText.length()-4, smsText.length());
					
	}
	public String readOtp(){
		waitForVisibilityOf(smsApp);
	String smsText=driver.findElement(smsApp).getText();
	String otpValue=smsText.substring(smsText.length()-4, smsText.length());
	driver.findElement(closeBtn).click();
	return otpValue;
	}
	
}
