/*
 * This class is to set properties and launch application  
 */


package Resources;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LaunchAppTest {

  @Test
 public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
    
  //Set the Desired Capabilities
  		DesiredCapabilities caps = new DesiredCapabilities();
  		caps.setCapability("deviceName", "MotoG4Plus");
  		caps.setCapability("udid", "ZY223HJLRQ"); // Device ID of my phone
  		caps.setCapability("platformName", "Android");
  		caps.setCapability("platformVersion", "7.0");
  		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
  		caps.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
  		caps.setCapability("noReset", "false");
  	
  		//Instantiate Appium Driver
  		
  				AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		return (AndroidDriver<AndroidElement>) driver;
		//Log.info("Start");

		
  }
  

}

