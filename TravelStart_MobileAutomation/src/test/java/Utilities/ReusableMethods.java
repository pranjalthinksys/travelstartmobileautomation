package Utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import Base.Mobile_Base;
import config.Config;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import mobilePOM.TravelStart_Mobile_CovidBanner;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;
import mobilePOM.TravelStart_Mobile_MyTrips_LoginUser;

public class ReusableMethods extends Mobile_Base

{

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	public static void fbreuse() throws Exception 

	{

		Thread.sleep(4000);
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;

		Index.clickonFacebookbutton();
		GenerateReport.Logger_click(NodeType, "Facebook Button");
		GenerateReport.ValidationPass(NodeType, "Facebook button");

		WebElement justonce = driver.findElementByXPath("//android.widget.Button[@content-desc='Use selected app just once']");
		justonce.click();

		Thread.sleep(7000);

		Index.clickFBcancelbutton();
		GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
		Thread.sleep(5000);

		Index.clickonFacebookbutton();
		GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
		GenerateReport.ValidationPass(NodeType, "Facebook button");
		Thread.sleep(2000);

		WebElement justonce1 = driver.findElementByXPath("//android.widget.Button[@content-desc='Use selected app just once']");
		justonce1.click();
		Thread.sleep(5000);

		Login.FBaccess();
		GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
		Thread.sleep(5000);

		Index.clickondontallow();
		//		WebElement loctiondontallow = driver.findElementByXPath("//android.widget.Button[@index='2']");
		//		loctiondontallow.click();
		GenerateReport.ValidationPass(NodeType, "locationdon'tallow");
		Thread.sleep(7000);

		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton");

		Index.clicksignoutbutton();
		GenerateReport.ValidationPass(NodeType, "Signout");

	}


	public static void Googlereuse() throws Exception 
	{
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;

		Thread.sleep(5000);
		Index.clickonGooglebutton();
		GenerateReport.Logger_click(NodeType, "Google Login");
		GenerateReport.ValidationPass(NodeType, "Google button");

		Index.selectGoogleaccount();
		GenerateReport.Logger_click(NodeType, "Googleaccount selected");
		GenerateReport.ValidationPass(NodeType, "Google account");
		Thread.sleep(10000);

		//		WebElement loctiondontallow = driver.findElementByXPath("//android.widget.Button[@index='2']");
		//		loctiondontallow.click();
		//		GenerateReport.ValidationPass(NodeType, "Google login successfull");
		//		Thread.sleep(7000);

		Index.clickondontallow();
		//		WebElement loctiondontallow = driver.findElementByXPath("//android.widget.Button[@index='2']");
		//		loctiondontallow.click();
		GenerateReport.ValidationPass(NodeType, "locationdon'tallow");
		Thread.sleep(7000);

		Index.clickProfilebutton();
		GenerateReport.Logger_click(NodeType, "profile button clicked");
		GenerateReport.ValidationPass(NodeType, "Profilebutton clicked");

		Index.clicksignoutbutton();
		GenerateReport.Logger_click(NodeType, "Signout button clicked");
		GenerateReport.ValidationPass(NodeType, "User Signout from application");

	}


	public static void verifylogoreuse() throws Exception 
	{

		Thread.sleep(3000);	
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;
		GenerateReport.Logger_LauchApp(NodeType, "TravelStart");

		Index.clickOnClosePopUp();
		GenerateReport.Logger_click(NodeType, "PopUpclose");
		GenerateReport.ValidationPass(NodeType, "pop up button");

		Thread.sleep(5000);
		ValidationResult=Index.VerifyLOGO();
		System.out.println(ValidationResult);
		GenerateReport.ValidationPass(NodeType, "Logo verification");
	}


	public static void manualloginreuse(int rownnum) throws Exception 
	{
		Thread.sleep(3000);	
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;

		/*These lines are addeed
		 * 
		 */

		int DataRow=Excel_Utilities.getCellData("SuiteFile",rownnum, 4);
		if(DataRow==0)
		{
			System.out.println("Please Enter valid Data in the TestData_Row ; The row cannot be zero");
		}
		else
		{
			Email=Excel_Utilities.getCellValue("Login",DataRow-1, 0);

			System.out.println("Email: "+Email);

			Password=Excel_Utilities.getCellValue("Login",DataRow-1, 1);
			System.out.println("Password :" +Password);

		}

		/*
		 * 
		 */

		Login.EnterEmail(Email);
		GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);
		GenerateReport.ValidationPass(NodeType, "Email entered");

		System.out.println(Password);
		Login.EnterPassword(Password);
		GenerateReport.Logger_EnterData(NodeType, "PasswordTextbox",Password);
		GenerateReport.ValidationPass(NodeType, "Password entered");

		Login.ClickLogin();
		GenerateReport.Logger_click(NodeType, "Login Button");
		GenerateReport.ValidationPass(NodeType, "Login button clicked");

		//		List <MobileElement> Incorrectpassworderror1=driver.findElementsByXPath("//android.view.View[@index='4']");
		//		if(Incorrectpassworderror1.size()>0 )
		//		{
		//			Assert.assertTrue(false, "Incorrect Login credentials entered");
		//			test.log(Status.INFO, "Incorrect Login credentials entered");
		//			GenerateReport.ValidationFail(NodeType, "Incorrect Login credentials entered");
		//			System.out.println("Incorrect Login credentials entered");
		//		}


		Thread.sleep(3000);
		Login.verifyWelcomeNote("Hello Pranjal, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello Pranjal, Book cheap flights with your one-stop travel shop!");


	}


	public static void verifysocialreuse() throws Exception 
	{
		Thread.sleep(3000);	
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;


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
		Thread.sleep(5000);

		ValidationResult=Index.verifyHeader("Terms",10000);
		validate(NodeType, "Terms and conditions");

		Thread.sleep(5000);
		Index.ClickBackButton();

		ValidationResult=Index.VerifyPrivacyPolicy();
		System.out.println(ValidationResult);
		GenerateReport.ValidationPass(NodeType, "Privacy Policy");

		Index.ClickPrivacyPolicy();
		GenerateReport.Logger_click(NodeType, "Privacy Policy");

		ValidationResult=Index.verifyHeader("Privacy Policy",7000);
		validate(NodeType, "Privacy Policy");
	}


	public static void forgotpassreuse() throws Exception 
	{
		Thread.sleep(3000);	
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;

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
		GenerateReport.ValidationPass(NodeType, "Email entered");

		Thread.sleep(5000);

		Login.ClickForgotpassword();
		GenerateReport.Logger_click(NodeType, "Forgot Password link");
		GenerateReport.ValidationPass(NodeType, "Forgot password clicked");
		Thread.sleep(3000);

		Login.verifyForgotpasswordalert("Alert A password reset email has been sent, please check your mailbox.Ok");
		GenerateReport.ValidationPass(NodeType, "Forgot password message");

		MobileElement E = driver.findElementByXPath("//android.view.View[@index='0']");
		E.click();

	}




	public static void emailerror_reuse() throws Exception 
	{
		Thread.sleep(3000);	
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;

		Index.clickOnLoginButton();
		GenerateReport.Logger_click(NodeType, "Login/SignUP");
		GenerateReport.ValidationPass(NodeType, "Login/signup clicked");

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
		GenerateReport.ValidationPass(NodeType, "Email entered");

		Thread.sleep(5000);

		Login.EnterIncorrectPassword();
		GenerateReport.Logger_click(NodeType, "Incorrect password entered");
		GenerateReport.ValidationPass(NodeType, "incorrect password");

		Thread.sleep(3000);
		Login.ClickLogin();
		GenerateReport.Logger_click(NodeType, "Login Button");
		GenerateReport.ValidationPass(NodeType, "Login button clicked");

		Thread.sleep(6000);

		Login.verifyIncorrectpassworderror("Your username or password are incorrect, please try again.");
		GenerateReport.ValidationPass(NodeType, "Your username or password are incorrect, please try again.");

	}


	public static void error_blank_fieldsreuse() throws Exception 
	{
		Thread.sleep(3000);	
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;

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

		Login.verifyWelcomeNote("Hello Pranjal, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello Pranjal, Book cheap flights with your one-stop travel shop!");

	}
	
	public static void covidbanner() throws Exception 
	{
		Thread.sleep(3000);	
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		//	test=createTest("Login");
		ExtentTest  NodeType=test;

		Index.ClickBackButton();
		GenerateReport.Logger_click(NodeType, "Back Button");

		Thread.sleep(3000);
		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");

		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");


		Dimension dimension = driver.manage().window().getSize();

		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.8);

		int end_x = (int) (dimension.width * 0.2);
		int end_y = (int) (dimension.height * 0.2);


		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();


		Thread.sleep(3000);

		List<MobileElement> covidbanner= driver.findElementsByXPath("//android.widget.ImageView[@index='5']");

		if(covidbanner.size()>0)
		{
			System.out.println("Covid banner exists");
			GenerateReport.ValidationPass(NodeType, "Covid banner exists");

			covid.ClickcovidbannerLearnmore();
			GenerateReport.ValidationPass(NodeType, "Covid banner Learn more button clicked");
			Thread.sleep(8000);
			covid.clickdismiss();
			Thread.sleep(2000);
			TripsUser.clickbackbutton();
			Thread.sleep(2000);
			//			covid.ClickcovidbannerLearnmore();
			//			Thread.sleep(5000);
			//			covid.clickdismiss();

			//			covid.clickhamburgerbutton();

	}

		else
		{
			System.out.println("Banner does not exist");
			Assert.assertTrue(false, "Covid banner is missin");
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