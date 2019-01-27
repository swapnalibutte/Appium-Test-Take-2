/*
 * This class is Page Object of user type selection screen
 */


package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserSelection {
	 public AndroidDriver<AndroidElement> driver;
	   
	    public UserSelection(AndroidDriver<AndroidElement> driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/skip_sign_in_button")
	    public AndroidElement Skip;
	    
	    public void clickOnSkipButton()
	    {
	    	Skip.click();
	    	
	    }
}