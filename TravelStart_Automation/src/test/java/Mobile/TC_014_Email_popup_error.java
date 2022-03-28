package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class TC_014_Email_popup_error extends Mobile_Base {
	
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

			test=createTest("Login");
			ExtentTest  NodeType=test;
			GenerateReport.Logger_LauchApp(NodeType, "TravelStart");

			Index.clickOnClosePopUp();
			GenerateReport.Logger_click(NodeType, "PopUpclose");

			Thread.sleep(5000);
			ValidationResult=Index.VerifyLOGO();
			System.out.println(ValidationResult);

			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");

			ValidationResult=Login.VerifyLoginButton();
			GenerateReport.Logger_Validation(NodeType, "Login Button");

			if(ValidationResult.equalsIgnoreCase("PASS"))
			{
				GenerateReport.ValidationPass(NodeType, "Login Button");	
			}
			else
			{
				GenerateReport.ValidationFail(NodeType, "Login Button");
			}

			Login.EnterEmail(Email);
			GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);

			Thread.sleep(5000);

			Login.EnterPassword(Password);
			GenerateReport.Logger_EnterData(NodeType, "PasswordTextbox",Password);
			GenerateReport.Logger_click(NodeType, "Incorrect password entered");

			Thread.sleep(3000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Thread.sleep(6000);

			Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
			GenerateReport.ValidationPass(NodeType, "" + "Your username or password are incorrect, please try again.");

		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
