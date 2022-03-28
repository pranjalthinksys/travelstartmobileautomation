package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class Google_methods extends Mobile_Base {


	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	@Test(groups = {"From Login Screen"})
	public static void Login() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate App Landing Page");
		ExtentTest  NodeType=test;

		ReusableMethods.verifylogoreuse();

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
		
Thread.sleep(2000);
		ReusableMethods.Googlereuse();


	}

//	// Another method CreateMyAccount
//	@Test(groups = {"CreateMyAccount - Login Home Screen"})
//	public static void Login1() throws Exception
//	{
//
//		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
//		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//
//		test=createTest("Validate App Landing Page");
//		ExtentTest  NodeType=test;
//
//		ReusableMethods.verifylogoreuse();
//
//		GenerateReport.ValidationPass(NodeType, "LOGO");
//
//		ValidationResult=Index.VerifyGoogleButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "Google Button");
//
//		Index.clickOnskip();
//		GenerateReport.Logger_click(NodeType, "Skip Button");
//
//		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
//		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
//
//		Index.clickcreateaccountbutton();
//		GenerateReport.ValidationPass(NodeType, "Createmyaccount");
//
//		ReusableMethods.Googlereuse();
//
//	}
//
//
//	// Another method Hamburger flow
//
//	@Test(groups = {"Hamburger - Login Home Screen"})
//	public static void Login2() throws Exception
//	{
//
//		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
//		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//
//		test=createTest("Validate App Landing Page");
//		ExtentTest  NodeType=test;
//
//		ReusableMethods.verifylogoreuse();
//
//		GenerateReport.ValidationPass(NodeType, "LOGO");
//
//		Index.clickOnskip();
//		GenerateReport.Logger_click(NodeType, "Skip Button");
//
//		Index.verifySkipNote("There");
//		GenerateReport.ValidationPass(NodeType, "There");
//		Thread.sleep(3000);
//
//		Index.clickhamburgerbutton();
//		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
//		Thread.sleep(3000);
//
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//
//		ValidationResult=Index.VerifyGoogleButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "Google Button");
//
//		ReusableMethods.Googlereuse();
//
//	}
//
//	// Another method profilebutton flow
//	@Test(groups = {"Profilebutton - Login Home Screen"})
//	public static void Login3() throws Exception
//	{
//
//		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
//		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//
//		test=createTest("Validate App Landing Page");
//		ExtentTest  NodeType=test;
//
//		ReusableMethods.verifylogoreuse();
//
//		GenerateReport.ValidationPass(NodeType, "LOGO");
//
//		Index.clickOnskip();
//		GenerateReport.Logger_click(NodeType, "Skip Button");
//
//		Index.verifySkipNote("There");
//		GenerateReport.ValidationPass(NodeType, "There");
//		Thread.sleep(3000);
//
//		Index.clickProfilebutton();
//		GenerateReport.ValidationPass(NodeType, "Profilebutton");
//
//
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//
//		ValidationResult=Index.VerifyGoogleButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "Google Button");
//
//		ReusableMethods.Googlereuse();
//
//
//
//	}
//
//	// Another method support button flow
//	@Test(groups = {"Support - Login Home Screen"})
//	public static void Login4() throws Exception
//	{
//
//		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
//		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//
//		test=createTest("Validate App Landing Page");
//		ExtentTest  NodeType=test;
//
//		ReusableMethods.verifylogoreuse();
//
//		GenerateReport.ValidationPass(NodeType, "LOGO");
//
//		Index.clickOnskip();
//		GenerateReport.Logger_click(NodeType, "Skip Button");
//
//		Index.verifySkipNote("There");
//		GenerateReport.ValidationPass(NodeType, "There");
//		Thread.sleep(3000);
//
//		Index.clicksupportbutton();
//		GenerateReport.Logger_click(NodeType, "Supportbutton clicked");
//		Thread.sleep(3000);
//
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//
//		ValidationResult=Index.VerifyGoogleButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "Google Button");
//
//		ReusableMethods.Googlereuse();
//
//		//			Login.EnterEmail(Email);
//		//			GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);
//		//			
//		//			System.out.println(Password);
//		//			Login.EnterPassword(Password);
//		//			GenerateReport.Logger_EnterData(NodeType, "PasswordTextbox",Password);
//		//			
//		//			Login.ClickLogin();
//		//			GenerateReport.Logger_click(NodeType, "Login Button");
//
//		//			Login.verifyWelcomeNote("Suresh");
//		//			GenerateReport.ValidationPass(NodeType, "Suresh");
//
//	}
//
//	// Another method Mytrips flow
//	@Test(groups = {"MyTrips - Login Home Screen"})
//	public static void Login5() throws Exception
//	{
//
//		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
//		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//
//		test=createTest("Validate App Landing Page");
//		ExtentTest  NodeType=test;
//
//		ReusableMethods.verifylogoreuse();
//
//		GenerateReport.ValidationPass(NodeType, "LOGO");
//
//		Index.clickOnskip();
//		GenerateReport.Logger_click(NodeType, "Skip Button");
//
//		Index.verifySkipNote("There");
//		GenerateReport.ValidationPass(NodeType, "There");
//		Thread.sleep(3000);
//
//		Index.clickMyTripsbutton();
//		GenerateReport.Logger_click(NodeType, "MyTrips button clicked");
//		Thread.sleep(3000);
//
//		ValidationResult=Index.VerifyFaceBookButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "FaceBook Button");
//
//		ValidationResult=Index.VerifyGoogleButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "Google Button");
//		Thread.sleep(3000);
//
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//		Thread.sleep(3000);
//
//		ValidationResult=Index.VerifyGoogleButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "Google Button");
//
//
//		ReusableMethods.Googlereuse();
//
//	}
}
