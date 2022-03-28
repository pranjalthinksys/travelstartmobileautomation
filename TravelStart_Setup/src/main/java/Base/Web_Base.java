package Base;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Utilities.GenerateReport;
import config.Config;



public class Web_Base extends GenerateReport
{
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	// public  ExtentHtmlReporter htmlreporter;
	// public static  ExtentReports extent;
	// public static  ExtentTest test;

	@BeforeSuite
	/*
	 *  [TestMethod]
	 *  [Description("To create the Extent Report")]
	 */
	public void extent_report() throws Exception {
		htmlReporter = new ExtentHtmlReporter("..\\TravelStart\\TravelStart.html");
		extent =  new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("SELENIUM", "Chrome");
		htmlReporter.config().setDocumentTitle("TravelStart_Report");
		htmlReporter.config().setReportName("TravelStart_ASSIGNMENT");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		openBrowser() ;


	}

	//@BeforeMethod
	/*
	 *  [TestMethod]
	 *  [Description("To launch the site")]
	 */
	public void open_browser()
	{
		openApplication();

	}



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
		getDriver().manage().deleteAllCookies();
	}

	@AfterSuite
	/*
	 *  [TestMethod]
	 *  [Description("To close the report")]
	 */
	public void flush_report(){

		getDriver().close();
		//driver.quit();
		extent.flush();
	}


	public static WebDriver getDriver()
	{
		return driver.get();

	}


	/*
	 * [Test Method]
	 * [Description("To setup the browser driver")]
	 */

	public static WebDriver  openBrowser() throws Exception {
		switch (Config.TEST_BROWSER.trim().toUpperCase()){

		case "FIREFOX":
			//System.setProperty("webdriver.gecko.driver", "path_to_geckodriver//geckodriver");
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			//capabilities.setCapability("marionette", true);
			//driver.set(new FirefoxDriver(capabilities));
			break;

		case "IE":

			driver.set(new InternetExplorerDriver());
			break;

		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\thinksysuser\\eclipse-workspace\\TravelStart\\chromedriver.exe");

			driver.set(new ChromeDriver());
			break;

		default:
			throw new Exception("Incorrect browser set in config file.");
		}


		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return getDriver();

	}

	/**
	 * Application_Url open setup
	 */
	public static void openApplication(){
		getDriver().get(Config.APPLICATION_URL);
		getDriver().manage().window().maximize();
	}

	/**
	 * WebBrowser closing setup
	 */
	public static void closeBrowser(){
		getDriver().close();
		// driver.quit();

	}



}