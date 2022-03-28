//package Utilities;
//
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.testng.Assert;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//
//public class AppAssertions 
//
//{
//
//	public AppiumDriver<MobileElement> driver;
//
//	public AppAssertions(AppiumDriver<MobileElement> driver) 
//	{
//		this.driver = driver;
//	}
//
//	public void AssertText(String actual,String expected) 
//	{
//		Assert.assertEquals(actual.contains(expected),true);
//	}
//
//	public void jsClick(MobileElement element) 
//	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		js.executeScript("arguments[0].click();", element);
//	}
//	
//
//}
