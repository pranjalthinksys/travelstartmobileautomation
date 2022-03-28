package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class Password_error_popup extends Mobile_Base {

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	@Test(groups = {"From Login Screen"})
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

			Login.EnterIncorrectPassword();
			GenerateReport.ValidationPass(NodeType, "Incorrect password entered");

			Thread.sleep(3000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Thread.sleep(6000);

			Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
			GenerateReport.ValidationPass(NodeType, "Your username or password are incorrect, please try again.");

		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	// Another method

	@Test(groups = {"CreateMyAccount- From Login Screen"})
	public static void AppIndexPage()
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

			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");

			Index.clickcreateaccountbutton();
			GenerateReport.ValidationPass(NodeType, "Createmyaccount");

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

			Login.EnterIncorrectPassword();
			GenerateReport.Logger_click(NodeType, "Incorrect password entered");

			Thread.sleep(3000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Thread.sleep(6000);

			Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
			GenerateReport.ValidationPass(NodeType, "Your username or password are incorrect, please try again.");

		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}
	// Another method
	@Test(groups = {"Hamburger- From Login Screen"})
	public static void Login1()
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

			Index.clickhamburgerbutton();
			GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
			Thread.sleep(3000);

			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");

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

			Login.EnterIncorrectPassword();
			GenerateReport.Logger_click(NodeType, "Incorrect password entered");

			Thread.sleep(3000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Thread.sleep(6000);

			Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
			GenerateReport.ValidationPass(NodeType, "Your username or password are incorrect, please try again.");

		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test(groups = {"Profilebutton- From Login Screen"})
	public static void Login2()
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

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");


			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");

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

			Login.EnterIncorrectPassword();
			GenerateReport.Logger_click(NodeType, "Incorrect password entered");

			Thread.sleep(3000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Thread.sleep(6000);

			Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
			GenerateReport.ValidationPass(NodeType, "Your username or password are incorrect, please try again.");

		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}
	// Another method
	@Test(groups = {"Supportbutton- From Login Screen"})
	public static void Login3()
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

			Login.EnterEmail(Email);
			GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);

			Thread.sleep(5000);

			Login.EnterIncorrectPassword();
			GenerateReport.Logger_click(NodeType, "Incorrect password entered");

			Thread.sleep(3000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Thread.sleep(6000);

			Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
			GenerateReport.ValidationPass(NodeType, "Your username or password are incorrect, please try again.");

		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}
	// Another method

	@Test(groups = {"MyTrips- From Login Screen"})
	public static void Login4()
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


			Thread.sleep(3000);

			Index.clickMyTripsbutton();
			GenerateReport.Logger_click(NodeType, "MyTrips button clicked");
			Thread.sleep(3000);

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

			Login.EnterIncorrectPassword();
			GenerateReport.Logger_click(NodeType, "Incorrect password entered");

			Thread.sleep(3000);
			Login.ClickLogin();
			GenerateReport.Logger_click(NodeType, "Login Button");

			Thread.sleep(6000);

			Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
			GenerateReport.ValidationPass(NodeType, "Your username or password are incorrect, please try again.");

		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}


}
