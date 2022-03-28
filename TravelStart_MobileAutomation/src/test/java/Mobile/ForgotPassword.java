package Mobile;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;

import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class ForgotPassword extends Mobile_Base{


	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;


	@Test(groups = {"Login Home Screen"})
	public static void Login() throws Exception
	{



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

			ReusableMethods.forgotpassreuse();
	}


	// Another method

	@Test(groups = {"CreateMyAccount - Login Home Screen"})
	public static void AppIndexPage() throws Exception
	{

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

			Index.clickcreateaccountbutton();
			GenerateReport.ValidationPass(NodeType, "Createmyaccount");

			ReusableMethods.forgotpassreuse();


	}
	// Another method
	@Test(groups = {"Hamburger - Login Home Screen"})
	public static void Login1() throws Exception
	{


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

			Index.clickhamburgerbutton();
			GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
			Thread.sleep(3000);

			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");

			ReusableMethods.forgotpassreuse();



	}

	// Another method


}
