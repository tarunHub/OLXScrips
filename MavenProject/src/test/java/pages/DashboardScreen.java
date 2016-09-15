package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class DashboardScreen extends BasePage {

    By submitAdBtn=By.id("com.olx.southasia:id/textView");
    
      

    public DashboardScreen(AndroidDriver driver){
    	super(driver);
    }

 
   

   //Click on login button

  
      
   public String submitFreeAdText(){
	   String Text=driver.findElement(submitAdBtn).getText();
   return Text;
   }
}

