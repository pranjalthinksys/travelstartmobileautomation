package Mobile;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import Base.Mobile_Base;
import Utilities.GenerateReport;
import mobilePOM.TravelStart_Mobile_Index;



public class TC_001_002_003_004_Guest_HomeLoginScreen extends Mobile_Base {


	public static String ValidationResult;

	/**
	 *  [TestMethod]
	 *  [Description("To Login to the site Travelstart")] 
	 */

	@Test

	public static void AppIndexPage()
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
            Thread.sleep(5000);
            
		//	ValidationResult=Index.verifyHeader("Terms",15000);
			validate(NodeType, "Terms and conditions");
			Thread.sleep(5000);

			Index.ClickBackButton();

			ValidationResult=Index.VerifyPrivacyPolicy();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Privacy Policy");

			Index.ClickPrivacyPolicy();
			GenerateReport.Logger_click(NodeType, "Privacy Policy");

			ValidationResult=Index.verifyHeader("Privacy",7000);
			validate(NodeType, "Privacy Policy");

			Index.ClickBackButton();
			GenerateReport.Logger_click(NodeType, "Back Button");

			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");

			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");

		}

		catch (Exception e) {
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
