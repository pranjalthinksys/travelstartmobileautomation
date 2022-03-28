package Base;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Utilities.Screenshots;
import Utilities.GenerateReport;
import Utilities.SendEmail;
import Utilities.SpecializedScreenRecorder;
import config.Config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;


public class Mobile_Base extends GenerateReport
{

	public static ScreenRecorder screenRecorder;
	public static  AppiumDriver<MobileElement> driver;
	public static SendEmail emailv;
	public static String ReportStatus=Config.readData("Emailer", "CurrentStatus");
	/*
	 *   [TestMethod]
	 *   [Description("To create the extent report")]  
	 */

	@BeforeSuite(alwaysRun = true)
	public  void report() throws MalformedURLException
	{
		System.out.println("BeforeSuite");
		htmlReporter = new ExtentHtmlReporter("C://TravelStart_Attachments//TravelStart_mobile.html");
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

	@BeforeMethod(alwaysRun = true)
	public void appium_server_running() throws InterruptedException, IOException, Exception
	{
		//	startRecording();

		//		driver.startRecordingScreen();
		//		driver.startRecordingScreen(new BaseStartScreenRecordingOptions(....));



		System.out.println("Before Method");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "SM G991U1");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "za.co.travelstart.flapp");
		capabilities.setCapability("appActivity", "za.co.travelstart.flapp.MainActivity");
		//	 capabilities.setCapability("app", "C:\\Users\\thinksysuser\\Downloads\\app-beta-release.apk");
		capabilities.setCapability("automationName", "UiAutomator2");
	//	capabilities.setCapability(MobileCapabilityType.FULL_RESET ,"true");	

		try
		{
			driver = new AppiumDriver<MobileElement>(new URL("http://10.101.23.104:4723/wd/hub"),capabilities);


		} 

		catch (MalformedURLException e) 
		{			
			e.printStackTrace();
		}
	}

	/*/
	 *   [TestMethod]
	 *   [Description("To generate Extent Report")]  
	 */
	@AfterMethod(alwaysRun = true)
	public void appium_server_stop(ITestResult result) throws Exception
	{

		System.out.println("AfterMethod");
		Thread.sleep(2000);
		///stopRecording();

		if(result.getStatus()==ITestResult. FAILURE )
		{


			test.fail(MarkupHelper.createLabel(result.getName()+"TestCaseFailed", ExtentColor.RED));
			test.fail(result.getThrowable());
			Thread.sleep(4000);


			String temp=Screenshots.getScreenshot();
			test.fail("Snapshot below: " + test.addScreenCaptureFromPath(temp));



			Config.writeData("Emailer", "CurrentStatus","Fail");

		}

		else if (result.getStatus()==ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getName()+"TestCasePasses", ExtentColor.GREEN));

		}
		else {
			test.skip(MarkupHelper.createLabel(result.getName()+"TestCaseSkipped", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}

		//	driver.resetApp();	

		Thread.sleep(6000);
	}

	public void startRecording() throws Exception
	{    


		File file = new File("./Videos");

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		int width = 286;
		int height= 680;

		//   int width = screenSize.;
		//           int height = screenSize.height;

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

		this.screenRecorder.stop();


	}



	@AfterClass(alwaysRun = true)

	public void reportEmail() throws UnsupportedEncodingException 
	{

		System.out.println("After Class");
		ReportStatus=Config.readData("Emailer", "CurrentStatus");
		if(ReportStatus.equalsIgnoreCase("Fail"))
		{
			extent.flush();	
			SendEmail.EmailReporter("C://TravelStart_Attachments//TravelStart_mobile.html");
			Config.writeData("Emailer", "CurrentStatus","Pass");
		}
		else
		{
			Config.writeData("Emailer", "CurrentStatus","Pass");
		}

	}




	@AfterSuite(alwaysRun = true)
	public  void flush() throws Exception
	{

		System.out.println("After suite");
		extent.flush();


	}


}
