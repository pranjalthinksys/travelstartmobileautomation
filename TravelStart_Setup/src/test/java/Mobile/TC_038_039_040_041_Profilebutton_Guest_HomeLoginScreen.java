package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class TC_038_039_040_041_Profilebutton_Guest_HomeLoginScreen extends Mobile_Base{


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
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

			test=createTest("Validate App Landing Page");
			ExtentTest  NodeType=test;
			GenerateReport.Logger_LauchApp(NodeType, "TravelStart");
			Index.clickOnClosePopUp();
			GenerateReport.Logger_click(NodeType, "PopUpclose");

			Thread.sleep(5000);

			ValidationResult=Index.VerifyLOGO();
			System.out.println(ValidationResult);

			GenerateReport.ValidationPass(NodeType, "LOGO");

			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");

			Index.verifySkipNote("There");
			GenerateReport.ValidationPass(NodeType, "There");
			Thread.sleep(3000);

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");


			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");


			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");

			ValidationResult=Index.VerifyGoogleButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Google Button");

			ValidationResult=Index.VerifyTermsLink();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "terms and conditions Button");

			Index.ClickTermsLink();
			GenerateReport.Logger_click(NodeType, "Terms and Conditions");

			ValidationResult=Index.verifyHeader("Terms",15000);
			validate(NodeType, "Terms and conditions");

			Index.ClickBackButton();

			ValidationResult=Index.VerifyPrivacyPolicy();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Privacy Policy");

			Index.ClickPrivacyPolicy();
			GenerateReport.Logger_click(NodeType, "Privacy Policy");

			ValidationResult=Index.verifyHeader("Privacy",7000);
			validate(NodeType, "Privacy Policy");

			Index.ClickBackButton();

			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");

			Thread.sleep(3000);
			Index.verifySkipNote("there");
			GenerateReport.ValidationPass(NodeType, "There");
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void validate(ExtentTest NodeType,String element) 
	{
		if(ValidationResult.equalsIgnoreCase("PASS"))
		{
			GenerateReport.ValidationPass(NodeType, element);	
		}
		else
		{
			GenerateReport.ValidationPass(NodeType, element);
		}
	}
}



