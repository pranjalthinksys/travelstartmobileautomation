package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class HelperFunctions 

{
	public static Properties config = null;
	AppiumDriver<MobileElement> driver;

	public HelperFunctions(AppiumDriver<MobileElement> driver) 
	{
		this.driver = driver;
	}

	/*
	 * Loads stream for parameters file
	 * @param fileName
	 * @throws IOException
	 */

	public static void LoadConfigProperty(String fileName) throws IOException
	{
		config = new Properties();
		FileInputStream ip = new FileInputStream("R://RESMAN//ResMan_AutomationSetup//qaConfig.txt");
		config.load(ip);
	}

	/*
	 * Implicit wait
	 * @param time
	 */
	public void implicitWait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	/*
	 * Function to wait only till the point an element is invisible with a time limit
	 * @param element for which to wait 
	 */
	
	public void explicitWait(MobileElement element) 
	{
		WebDriverWait wait  = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/*
	 * Function to perform JavaScript click on an element
	 * @param element
	 */

	public void jsClick(MobileElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
	}
	
	/*
	 * Function to perform JavaScript click on an element
	 * @param element
	 */

	public void Swipe(int FromX1,int FromY1,int ToX2,int ToY2) 
	{
		long milliseconds = 1000;
		TouchAction touchAction=new TouchAction(driver);
		touchAction.tap(PointOption.point(FromX1,FromY1)).waitAction().moveTo(PointOption.point(ToX2, ToY2)).release().perform();
       
	}

	
}
