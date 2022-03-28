package Base;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utilities.GenerateReport;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Mobile_Base extends GenerateReport {

	public static  AppiumDriver<MobileElement> driver;
	public static  String destination;

	/*
	 *   [TestMethod]
	 *   [Description("To create the extent report")]  
	 */

	@BeforeSuite
	public  void report() throws MalformedURLException
	{
		
		htmlReporter = new ExtentHtmlReporter("..\\TravelStart\\TravelStart_mobile.html");
		extent =  new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("swipe", "android");
		htmlReporter.config().setDocumentTitle("TravelStart_APP_Report");
		htmlReporter.config().setReportName("TravelStart_APPIUM");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);	
	} 
	
	/*
	 *   [TestMethod]
	 *   [Description("To setup the appium server for swipe on android")]  
	 */

	@BeforeMethod
	public void appium_server_running() throws InterruptedException, IOException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "R5CR60BYE2X");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "za.co.travelstart.flapp.beta");
		capabilities.setCapability("appActivity", "za.co.travelstart.flapp.MainActivity");
	//	capabilities.setCapability("app", "C:\\Users\\thinksysuser\\Downloads\\app-beta-release.apk");
	//	capabilities.setCapability("automationName", "UiAutomator2");
	//	capabilities.setCapability(MobileCapabilityType.FULL_RESET ,"true");	
		try
		{
			driver = new AppiumDriver<MobileElement>(new URL("http://10.101.22.99:4723/wd/hub"),capabilities);
		} 
		catch (MalformedURLException e) 
		{			
		e.printStackTrace();
		}
	    }

	/*
	 *   [TestMethod]
	 *   [Description("To generate Extent Report")]  
	 */
	@AfterMethod
	public void appium_server_stop(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult. FAILURE )
		{
			
			test.fail(MarkupHelper.createLabel(result.getName()+"TestCaseFailed", ExtentColor.RED));
			test.fail(result.getThrowable());
			

		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getName()+"TestCasePasses", ExtentColor.GREEN));

		}
		else {
			test.skip(MarkupHelper.createLabel(result.getName()+"TestCaseSkipped", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
	//	driver.resetApp();	
	//	Thread.sleep(3000);

	}

	@AfterSuite
	public  void flush()
	{
		extent.flush();
	}
	
	/*
	 *  [TestMethod]
	 *  [Description("To take the screenshots")] 
	 */
//	public static String getScreenshot(AppiumDriver<MobileElement> driver, String screenshotName) throws Exception
//	{
//		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//			
//		if(Config.Machine.equalsIgnoreCase("remote"))
//		{
//			htmlreporter = new ExtentHtmlReporter("Z://Peoplemedia_Automation//AutomationReport//SwipeAndroid/"+screenshotName+".png");			
//		}
//		else
//		{
//			htmlreporter = new ExtentHtmlReporter("C://reports//SwipeAndroid//"+screenshotName+".png");
//						 
//			
//	    }
//		File finalDestination = new File(destination);
//		FileUtils.copyFile(source, finalDestination);
//		return destination;
//
//}

	
}
