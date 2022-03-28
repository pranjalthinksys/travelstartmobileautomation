package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;

public class TC_021_Createmyaccount_Google_HomeLoginScreen extends Mobile_Base{

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	/**
	 *  [TestMethod]
	 *  [Description("To Login to the site Travelstart")] 
	 */

	@Test
	public static void Login()
	{

		try {

			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);

			test=createTest("Validate App Landing Page");
			ExtentTest  NodeType=test;
			GenerateReport.Logger_LauchApp(NodeType, "TravelStart");
			Index.clickOnClosePopUp();
			GenerateReport.Logger_click(NodeType, "PopUpclose");

			Thread.sleep(5000);

			ValidationResult=Index.VerifyLOGO();
			System.out.println(ValidationResult);

			GenerateReport.ValidationPass(NodeType, "LOGO");

			ValidationResult=Index.VerifyGoogleButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Google Button");

			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");

			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");

			Index.clickcreateaccountbutton();
			GenerateReport.ValidationPass(NodeType, "Createmyaccount");

			Index.clickonGooglebutton();
			GenerateReport.Logger_click(NodeType, "Google Login");

			Index.selectGoogleaccount();
			GenerateReport.Logger_click(NodeType, "Googleaccount selected");
			Thread.sleep(5000);

			//			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			//			loctiondontallow.click();
			//			Thread.sleep(5000);

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clicksignoutbutton();
			GenerateReport.ValidationPass(NodeType, "Signout");

		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}
}
