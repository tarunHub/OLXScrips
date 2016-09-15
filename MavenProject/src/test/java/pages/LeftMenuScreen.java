package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class LeftMenuScreen extends BasePage{
 
	By leftMenuButton=By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");
	
	By welcomeToOlxOption=By.id("com.olx.southasia:id/tv_userName_navigation_header");
	
	public LeftMenuScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public void clickLeftMenuIcon(){

         driver.findElement(leftMenuButton).click();

 }
	 public void clickWelcomeToOlxOption(){
		 driver.findElement(welcomeToOlxOption).click();
	 }
}
