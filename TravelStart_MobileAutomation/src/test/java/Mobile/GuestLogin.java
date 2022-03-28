package Mobile;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class GuestLogin extends Mobile_Base {

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	/*
	@Test(groups = {"Sanity"})
	public static void ValidateGuestLoginfromHomeScreen() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate Guest Login from Home Screen");
		ExtentTest  NodeType=test;

		ReusableMethods.verifylogoreuse();

		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);

		Index.ClickBackButton();
		GenerateReport.Logger_click(NodeType, "Back Button");

		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");

		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");

	}
	
	*/

	// Another method 
	
	/*
		@Test(groups = {"Regression"})
		public static void ValidateGuestLoginfromLoginScreen() throws Exception
		{
	
			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
	
			test=createTest("Validate Guest Login from Login Screen");
			ExtentTest  NodeType=test;
	
			ReusableMethods.verifylogoreuse();
	
			GenerateReport.ValidationPass(NodeType, "LOGO");
	
			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");
	
			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");
	
			ValidationResult=Index.VerifyGoogleButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Google Button");
	
	
			ValidationResult=Index.VerifyForgotpasswordlink();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Forgot password link present");
	
	
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
	
			Thread.sleep(3000);
	
	
			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");	
	
		}
		*/

	// Another method

	/*
	@Test(groups = {"Sanity"})
	public static void ValidateGuestLoginCreateMYAccountFlow() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate Guest Login - CreateMyAccount Flow");
		ExtentTest  NodeType=test;

		ReusableMethods.verifylogoreuse();

		GenerateReport.ValidationPass(NodeType, "LOGO");

		Thread.sleep(2000);


		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");

		Index.verifySkipNote("There");
		GenerateReport.ValidationPass(NodeType, "There");

		Index.clickcreateaccountbutton();
		GenerateReport.ValidationPass(NodeType, "Createmyaccount button clicked");

		Thread.sleep(3000);
		ReusableMethods.verifysocialreuse();
		
		Index.ClickBackButton();
		GenerateReport.Logger_click(NodeType, "Back button");
		
		Thread.sleep(5000);

		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");

		Thread.sleep(2000);

		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");


	}

*/


	// Another method
	
	/*
		@Test(groups = {"Validate Guest Login - Hamburger Flow"})
		public static void Login1() throws Exception
		{
	
			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
	
			test=createTest("Validate Guest Login - Hamburger Flow");
			ExtentTest  NodeType=test;
	
			ReusableMethods.verifylogoreuse();
	
			GenerateReport.ValidationPass(NodeType, "LOGO");
	
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
	
			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
			Thread.sleep(3000);
	
			Index.clickhamburgerbutton();
			GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
			Thread.sleep(3000);
	
			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");
	
	Thread.sleep(5000);
			ReusableMethods.verifysocialreuse();
			Index.ClickBackButton();
	
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
	
			Thread.sleep(3000);
			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
	
		}
	*/
	
		// Another method
	
	/*
		@Test(groups = {"Validate Guest Login - Profilebutton Flow"})
		public static void Login2() throws Exception
		{
			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
	
			test=createTest("Validate Guest Login - Profilebutton Flow");
			ExtentTest  NodeType=test;
	
			ReusableMethods.verifylogoreuse();
	
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
	
			Thread.sleep(5000);
			ReusableMethods.verifysocialreuse();
	
			Index.ClickBackButton();
	
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
	
			Thread.sleep(3000);
			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
	
		}
		*/
	
	
		// Another method
	
	/*
	@Test(groups = {"Validate Guest Login - SupportButton Flow"})
		public static void Login3() throws Exception
		{
	
			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
	
			test=createTest("Validate Guest Login - SupportButton Flow");
			ExtentTest  NodeType=test;
	
			ReusableMethods.verifylogoreuse();
	
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
	
			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");
	
			ValidationResult=Index.VerifyGoogleButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Google Button");
	
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
	
			Thread.sleep(3000);
			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
	
		}
		*/
	
		// Another method
	
		@Test(groups = {"Validate Guest Login - MyTrips button Flow"})
		public static void Login() throws Exception
		{
	
			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
	
			test=createTest("Validate Guest Login - MyTrips button Flow");
			ExtentTest  NodeType=test;
	
			ReusableMethods.verifylogoreuse();
	
			GenerateReport.ValidationPass(NodeType, "LOGO");
	
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
	
			Index.verifySkipNote("There");
			GenerateReport.ValidationPass(NodeType, "There");
			Thread.sleep(3000);
	
	
			Thread.sleep(3000);
	
			Index.clickMyTripsbutton();
			GenerateReport.Logger_click(NodeType, "MyTrips button clicked");
			Thread.sleep(3000);
	
			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");
	
			ValidationResult=Index.VerifyGoogleButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Google Button");
			Thread.sleep(3000);
	
			Index.clickOnLoginButton1();
			GenerateReport.Logger_click(NodeType, "Login or SignUP");
			Thread.sleep(3000);
	
			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");
	
			ValidationResult=Index.VerifyGoogleButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Google Button");
			Thread.sleep(3000);
	
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
	
			Thread.sleep(3000);
			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
	
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
