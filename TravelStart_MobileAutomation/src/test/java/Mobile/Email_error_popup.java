package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class Email_error_popup extends Mobile_Base{

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;


	@Test(groups = {" From Login Screen"})
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

		ReusableMethods.emailerror_reuse();
	}

	// nother method
	@Test(groups = {"CreateMyAccount- From Login Screen"})
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

		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");

		Index.clickcreateaccountbutton();
		GenerateReport.ValidationPass(NodeType, "Createmyaccount");

		ReusableMethods.emailerror_reuse();
	}
	// Another method
	@Test(groups = {"Hamburger- From Login Screen"})
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

		ReusableMethods.emailerror_reuse();
	}

	// Anothre method
	@Test(groups = {"Profilebutton- From Login Screen"})
	public static void Login2() throws Exception
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

		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton");


		Index.clickOnLoginButton();
		GenerateReport.Logger_click(NodeType, "Login/SignUP");

		ReusableMethods.emailerror_reuse();


	}

	// Another method

	@Test(groups = {"Supportbutton- From Login Screen"})
	public static void Login3() throws Exception
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

		Index.clicksupportbutton();
		GenerateReport.Logger_click(NodeType, "Supportbutton clicked");
		Thread.sleep(3000);

		ReusableMethods.emailerror_reuse();
	}


}
