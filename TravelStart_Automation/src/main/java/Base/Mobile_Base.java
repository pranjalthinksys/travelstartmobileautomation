package Base;


import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Utilities.GenerateReport;
import Utilities.SendEmail;
import Utilities.SpecializedScreenRecorder;
import config.Config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.apache.commons.io.FileUtils;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;


public class Mobile_Base extends GenerateReport {
	
    public static ScreenRecorder screenRecorder;
	public static  AppiumDriver<MobileElement> driver;
	public static  String destination;
	public static SendEmail emailv;
	/*
	 *   [TestMethod]
	 *   [Description("To create the extent report")]  
	 */

	@BeforeSuite
	public  void report() throws MalformedURLException
	{

		htmlReporter = new ExtentHtmlReporter("..\\TravelStart_Automation\\TravelStart_mobile.html");
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
		// startRecording();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "R5CR60BYE2X");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "za.co.travelstart.flapp.beta");
		capabilities.setCapability("appActivity", "za.co.travelstart.flapp.MainActivity");
	//	capabilities.setCapability("app", "C:\\Users\\thinksysuser\\Downloads\\app-beta-release.apk");
		//capabilities.setCapability("automationName", "UiAutomator2");
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
		
	
	//	Thread.sleep(5000);
		//stopRecording();
	
		//	driver.resetApp();	
	
		//	Thread.sleep(3000);
	}
	
	public void startRecording() throws Exception
    {    
           File file = new File("./Videos");
                        
           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
           int width = screenSize.width;
           int height = screenSize.height;
                         
           Rectangle captureSize = new Rectangle(0,0, width, height);
                         
         GraphicsConfiguration gc = GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getDefaultScreenDevice()
            .getDefaultConfiguration();

        this.screenRecorder = new SpecializedScreenRecorder(gc, captureSize,
            new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
            new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                 CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                 DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                 QualityKey, 1.0f,
                 KeyFrameIntervalKey, 15 * 60),
            new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                 FrameRateKey, Rational.valueOf(30)),
            null, file, "MyVideo");
       this.screenRecorder.start();
   
    }

    public void stopRecording() throws Exception
   
    {
    	emailv.EmailReporter("..//TravelStart_Automation//TravelStart_mobile.html");
    	this.screenRecorder.stop();
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
		public static String getScreenshot(AppiumDriver<MobileElement> driver, String screenshotName) throws Exception
		{
			
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
//				
//			if(Config.Machine.equalsIgnoreCase("remote"))
//			{
//				htmlreporter = new ExtentHtmlReporter("Z://Peoplemedia_Automation//AutomationReport//SwipeAndroid/"+screenshotName+".png");			
//			}
//			else
//			{
//				htmlreporter = new ExtentHtmlReporter("C://reports//SwipeAndroid//"+screenshotName+".png");
//
//		    }
			
			String destination= new ExtentHtmlReporter("..//TravelStart_Automation//")+"TestcasesScreenshots" + screenshotName + dateName + ".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
			
			
			
			
			
	
	}


}
