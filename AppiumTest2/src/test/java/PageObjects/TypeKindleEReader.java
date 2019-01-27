/*
 * This class is Page Object of Kindle types screen
 */


package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TypeKindleEReader {

			 public AndroidDriver<AndroidElement> driver;
			    public TypeKindleEReader(AndroidDriver<AndroidElement> driver) {
			    
			        this.driver = driver;
			        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			    }
			    
		    	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View[3]")
		    	public AndroidElement Type;

			    public void KindleEReader()
			    {
			    	Type.click();
}
}
