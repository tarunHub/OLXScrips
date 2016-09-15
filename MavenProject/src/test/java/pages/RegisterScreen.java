
package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class RegisterScreen extends BasePage {

   
    By formFields = By.id("com.olx.southasia:id/value");
    
    By registerNowBtn=By.id("com.olx.southasia:id/apb_register_submit");

	//By userPassword = By.xpath("//android.widget.EditText[@text='Your Email or Mobile']");

    //By userName = By.xpath("//android.widget.EditText[@text='Your Email or Mobile']");
    public RegisterScreen(AndroidDriver driver){
    	super(driver);
    }

 
   
    public void setFormFields(String fieldValue,int index) {

		driver.findElements(formFields).get(index).sendKeys(fieldValue);
		driver.hideKeyboard();

	}

	

	public void clickRegisterNow() {

		driver.findElement(registerNowBtn).click();
   //Click on login button
	}
  
   
}

