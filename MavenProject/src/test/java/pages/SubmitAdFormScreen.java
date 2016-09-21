
package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SubmitAdFormScreen extends BasePage {

    By crossBtn=By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    By cameraBtn=By.id("com.olx.southasia:id/imageView_camera");
    By galleryBtn=By.id("com.olx.southasia:id/imageView_gallery");
    By submitAdBtn=By.id("com.olx.southasia:id/action_bar_button");
    By categoryChooserDropdown=By.id("com.olx.southasia:id/chooserBtn");
    By description=By.id("com.olx.southasia:id/value");
    
    public SubmitAdFormScreen(AndroidDriver driver){
    	super(driver);
    }

 
   

   //Click on login button

  
      
   public String submitFreeAdText(){
	   String Text=driver.findElement(submitAdBtn).getText();
   return Text;
   }
   
   public void clicksubmitAdBtn(){
	   driver.findElement(submitAdBtn).click();
   }
}


