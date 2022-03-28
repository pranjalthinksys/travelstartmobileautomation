package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class TC_056_Error_BlankFields_SupportFlow extends Mobile_Base{

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

			Index.clicksupportbutton();
			GenerateReport.Logger_click(NodeType, "Supportbutton clicked");
			Thread.sleep(3000);

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

			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");


			Index.verifyemailmissingerror("Please enter valid Email");
			GenerateReport.ValidationPass(NodeType, "Email missing");

			Login.EnterEmail(Email);
			GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);

			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Index.verifypasswordmissingerror("Password Missing");
			GenerateReport.ValidationPass(NodeType, "Password Missing");

			System.out.println(Password);
			Login.EnterPassword(Password);
			GenerateReport.Logger_EnterData(NodeType, "PasswordTextbox",Password);


			Thread.sleep(5000);
			Index.ClickShowPassword();
			GenerateReport.ValidationPass(NodeType, "Show Password");
		
			
			Thread.sleep(7000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Login.verifyWelcomeNote("Pranjal");
			GenerateReport.ValidationPass(NodeType, "Pranjal");

		}

		catch (Exception e) {



			e.printStackTrace();
		}
	}


	
}
