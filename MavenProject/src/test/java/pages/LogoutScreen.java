package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.android.AndroidDriver;

public class LogoutScreen extends BasePage{
 
	By logoutButton=By.id("com.olx.southasia:id/action_bar_button");
	
	public LogoutScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public void clickLogoutButton() throws InterruptedException{
		 waitForVisibilityOf(logoutButton);
		 Thread.sleep(10000);
         driver.findElement(logoutButton).click();

 }
	 public String logoutText(){
		String Text= driver.findElement(logoutButton).getText();
		return Text;
	 }
	 
	 public boolean decideLogoutScreen() throws InterruptedException {
		 Thread.sleep(10000);
		  try {
		    driver.findElement(logoutButton);
		    return true;  // Success!
		  } catch (NoSuchElementException ignored) {
		    return false;
		  }
		}
	
}
