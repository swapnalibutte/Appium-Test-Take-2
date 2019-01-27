/*
 * This is Test case to add Kindle paperwhite to cart  

 */

package Tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import PageObjects.AmazonHomepage;
import PageObjects.Kindle;
import PageObjects.KindlePaperwhite;
import PageObjects.StockCheck;
import PageObjects.TypeKindleEReader;
import PageObjects.UserSelection;
import Resources.LaunchAppTest;

public class AddKindlePaperWhileToCartTest extends LaunchAppTest{

	public AndroidDriver<AndroidElement> driver;
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	@Test
	public void addItemToCart() throws MalformedURLException, InterruptedException{	

		Log.info("Test is started");
		driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS );

		//Skip login
		UserSelection hp=new UserSelection(driver);
		hp.clickOnSkipButton();
		Log.info("User type is selected");

		//Select Shop by category
		AmazonHomepage ah = new AmazonHomepage(driver);
		ah.clickOnShopbycategory();
		Log.info("Selecting shop by category");

		//Select Category Kindle E-readers and e Books
		Kindle k = new Kindle (driver);
		k.clickOnKindle();
		Log.info("Selecting Kindle e-Readers and e- Books");


		//Select Kindle E Readers
		TypeKindleEReader kin = new TypeKindleEReader(driver);
		kin.KindleEReader();
		Log.info("Selecting e reader");

		//Select Kindle PaperWhite
		KindlePaperwhite kp = new KindlePaperwhite(driver);
		kp.Paperwhite();
		Log.info("Selecting Paperwhite");

		//Assert Kindle PaperWhite

		TouchAction ts = new TouchAction(driver);
		ts.press(916, 1525 ).moveTo(685, -660).release().perform();

		try
		{
			if(driver.findElement(By.xpath("//*[@class='android.view.View' and contains(text(),'In Stock')]")).isDisplayed() );

			{
				StockCheck s = new StockCheck(driver);
				s.Availability();
				Log.info("Checking and adding to cart");
			}
		}
		catch(Exception e)
		{
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				// Store screen shots
				FileUtils.copyFile(src, new File("D:/Appium Automation1/AppiumTest2/screenshots/error.png"));
			}

			catch (IOException e1)
			{
				System.out.println(e.getMessage());

			}
		}
		Log.info("Test ended");

	}
}


