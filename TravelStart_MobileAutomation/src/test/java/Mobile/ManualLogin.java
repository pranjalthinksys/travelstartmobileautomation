package Mobile;

import java.util.List;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;
import io.appium.java_client.MobileElement;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class ManualLogin extends Mobile_Base{

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;


		
	@Test(groups = {"From Login Screen"})
	public static void Login() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate Direct Login from Login Screen");
		ExtentTest  NodeType=test;

	//	ReusableMethods.verifylogoreuse();

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

		ReusableMethods.manualloginreuse(8);

		Thread.sleep(2000);
		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Index.clicksignoutbutton();
		GenerateReport.ValidationPass(NodeType, "Signout button gets clicked");

	}
	 

	// Another method create my account

	/*
	@Test(groups = {"CreateMyAccount - Login Home Screen"})
	public static void Aogin1() throws Exception
	{
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate CreateMyAccount - Login Home Screen");
		ExtentTest  NodeType=test;

		ReusableMethods.verifylogoreuse();

		GenerateReport.ValidationPass(NodeType, "LOGO");

		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");

		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");

		Index.clickcreateaccountbutton();
		GenerateReport.ValidationPass(NodeType, "Createmyaccount");

		Index.clickOnLoginButton();
		GenerateReport.Logger_click(NodeType, "Login/SignUP");

		Thread.sleep(3000);
		ReusableMethods.manualloginreuse(8);

		Thread.sleep(2000);
		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Index.clicksignoutbutton();
		GenerateReport.ValidationPass(NodeType, "Signout button gets clicked");

	}

	 */


	// Another method

	/*

	@Test(groups = {"Hamburger - Login Home Screen"})
	public static void Login2() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate Hamburger - Login Home Screen");
		ExtentTest  NodeType=test;

		ReusableMethods.verifylogoreuse();

		GenerateReport.ValidationPass(NodeType, "LOGO");

		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");
		Thread.sleep(3000);

		Index.verifySkipNote("There");
		GenerateReport.ValidationPass(NodeType, "There");
		Thread.sleep(3000);

		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		Index.clickOnLoginButton();
		GenerateReport.Logger_click(NodeType, "Login/SignUP");

		Index.clickOnLoginButton();
		GenerateReport.Logger_click(NodeType, "Login/SignUP");

		ReusableMethods.manualloginreuse(8);

		Thread.sleep(2000);
		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Index.clicksignoutbutton();
		GenerateReport.ValidationPass(NodeType, "Signout button gets clicked");

	}


	 */


	// Another method

	/*
		@Test(groups = {"Validate Profilebutton - Login Home Screen"})
		public static void Login3() throws Exception
		{

			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

			test=createTest("Profilebutton - Login Home Screen");
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

			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");

			ReusableMethods.manualloginreuse(8);

		Thread.sleep(2000);
		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Index.clicksignoutbutton();
		GenerateReport.ValidationPass(NodeType, "Signout button gets clicked");

		}


	 */


	// Another method


	/*
	@Test(groups = {"Supportbutton - Login Home Screen"})
	public static void Login4() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate Supportbutton - Login Home Screen");
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

		ReusableMethods.manualloginreuse(8);

		Thread.sleep(2000);
		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Index.clicksignoutbutton();
		GenerateReport.ValidationPass(NodeType, "Signout button gets clicked");

	}
	 */


	// Another method

/*
	@Test(groups = {"MyTrips - Login Home Screen"})
	public static void Login5() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		test=createTest("Validate MyTrips - Login Home Screen");
		ExtentTest  NodeType=test;

		ReusableMethods.verifylogoreuse();

		GenerateReport.ValidationPass(NodeType, "LOGO");

		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");

		Index.verifySkipNote("There");
		GenerateReport.ValidationPass(NodeType, "There");
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

		ReusableMethods.manualloginreuse(8);

		List <MobileElement> trips_Validation = driver.findElementsByXPath("//android.widget.ImageView[@content-desc='No Upcoming Bookings Found']");

		if(trips_Validation.size()>0)
		{
			System.out.println("No booking available");
			GenerateReport.ValidationPass(NodeType, "No Booking available");
		}

		else
		{
			System.out.println("Booking available");
			GenerateReport.ValidationPass(NodeType, "Booking available");
		}

		Login.clickbackarrow();
		GenerateReport.ValidationPass(NodeType, "Page back arrow gets clicked");

		Thread.sleep(2000);
		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Index.clicksignoutbutton();
		GenerateReport.ValidationPass(NodeType, "Signout button gets clicked");

	}

*/
}
