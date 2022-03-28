package Mobile;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;
import webPOM.TravelStart_Login;

public class TC_001_002_003_004_007_008_016_017_018_019_App extends Mobile_Base {


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
			
			Index.verifySkipNote("There");
			GenerateReport.ValidationPass(NodeType, "There");
			
			Index.clickcreateaccountbutton();
			GenerateReport.ValidationPass(NodeType, "Createmyaccount");
			
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
			Thread.sleep(5000);
			
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
			
			Thread.sleep(3000);
			Index.verifySkipNote("There");
			GenerateReport.ValidationPass(NodeType, "There");
			
			
			
//			Index.clickOnLoginButton();
//			GenerateReport.Logger_click(NodeType, "Login Button");
			 
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
		GenerateReport.ValidationFail(NodeType, element);
	}
}

}
