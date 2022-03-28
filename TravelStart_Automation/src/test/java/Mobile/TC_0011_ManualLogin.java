package Mobile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TC_0011_ManualLogin extends Mobile_Base {

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;


	/**
	 *  [TestMethod]
	 *  [Description("To Login to the site Travelstart")] 
	 */

	@Test

	public static void Login() throws InterruptedException, IOException 
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

			System.out.println(Password);
			Login.EnterPassword(Password);
			GenerateReport.Logger_EnterData(NodeType, "PasswordTextbox",Password);

			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Login.verifyWelcomeNote("Hello Pranjal, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello Pranjal, Book cheap flights with your one-stop travel shop!");

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

			Index.clicksignoutbutton();
			GenerateReport.ValidationPass(NodeType, "Signout button gets clicked");

		}

		catch (Exception e) {

			e.printStackTrace();
		}



	}



}
