/*
 * This class is Page Object of Amazon Homepage  
 */


package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmazonHomepage {
	
		 public AndroidDriver<AndroidElement> driver;
		    public AmazonHomepage() {
		    }
		    public AmazonHomepage(AndroidDriver<AndroidElement> driver) {
		        this.driver = driver;
		        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		    }
		  
	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label" )
		 public AndroidElement ShopByCategory;

		    public void clickOnShopbycategory()
		    {
		    	ShopByCategory.click();

		    }

}