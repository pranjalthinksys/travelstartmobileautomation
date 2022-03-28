package Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class FACEBOOK_methods extends Mobile_Base {

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	/**
	 *  [TestMethod]
	 *  [Description("To Login to the site Travelstart")] 
	 */
	@Test(groups = {"From Login Screen"})

	public static void Login()
	{

		try {

			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

		//	test=createTest("Login");
//			ExtentTest  NodeType=test;
//			GenerateReport.Logger_LauchApp(NodeType, "TravelStart");

			Index.clickOnClosePopUp();
//			GenerateReport.Logger_click(NodeType, "PopUpclose");

			Thread.sleep(5000);
			ValidationResult=Index.VerifyLOGO();
			System.out.println(ValidationResult);

			Index.clickOnLoginButton();
//			GenerateReport.Logger_click(NodeType, "Login/SignUP");

			ValidationResult=Login.VerifyLoginButton();
//			GenerateReport.Logger_Validation(NodeType, "Login Button");

//			if(ValidationResult.equalsIgnoreCase("PASS"))
//			{
////				GenerateReport.ValidationPass(NodeType, "Login Button");	
//			}
//			else
//			{
////				GenerateReport.ValidationFail(NodeType, "Login Button");
//			}

			Index.clickonFacebookbutton();
//			GenerateReport.Logger_click(NodeType, "Facebook Button");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(7000);

			Index.clickFBcancelbutton();
//			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);

			Index.clickonFacebookbutton();
//			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);

			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
//			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(7000);

			Index.clickProfilebutton();
//			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clicksignoutbutton();
//			GenerateReport.ValidationPass(NodeType, "Signout");

		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}


	// Another method

	@Test(groups = {"From Home Login Screen"})
	public static void Login1()
	{

		try {

			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);

			test=createTest("Login1");
			ExtentTest  NodeType=test;
			GenerateReport.Logger_LauchApp(NodeType, "TravelStart");

			Index.clickOnClosePopUp();
			GenerateReport.Logger_click(NodeType, "PopUpclose");

			Thread.sleep(5000);
			ValidationResult=Index.VerifyLOGO();
			System.out.println(ValidationResult);

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(8000);

			Index.clickFBcancelbutton();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);

			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);


			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clicksignoutbutton();
			GenerateReport.ValidationPass(NodeType, "Signout");

		}
		catch (Exception e)
		{

			e.printStackTrace();
		}


	}


	// Another method
	@Test(groups = {"CreateMyAccount - Login Home Screen"})
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

			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");

			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");

			Index.verifySkipNote("There");
			GenerateReport.ValidationPass(NodeType, "There");

			Index.clickcreateaccountbutton();
			GenerateReport.ValidationPass(NodeType, "Createmyaccount");

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(8000);

			Index.clickFBcancelbutton();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);

			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);

		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}

	// Anoither methiod

	@Test(groups = {"Hamburger - Login Home Screen"})
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

			Index.clickhamburgerbutton();
			GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
			Thread.sleep(3000);

			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");

			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(8000);

			Index.clickFBcancelbutton();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);

			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clicksignoutbutton();
			GenerateReport.ValidationPass(NodeType, "Signout");


		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}


	// ----------------------------------------------
	@Test(groups = {"ProfileButton - Login Home Screen"})
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

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");

			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(8000);

			Index.clickFBcancelbutton();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);

			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clicksignoutbutton();
			GenerateReport.ValidationPass(NodeType, "Signout");


		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}


	// --------------------------------------------------------
	@Test(groups = {"Support - Login Home Screen"})
	public static void Login5()
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

			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(7000);

			Index.clickFBcancelbutton();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);

			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);

			Thread.sleep(3000);
			Login.FBaccess();
			GenerateReport.ValidationPass(NodeType, "Facebook access provided");

			Thread.sleep(7000);

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clicksignoutbutton();
			GenerateReport.ValidationPass(NodeType, "Signout");

		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}

	// --------------------------------------

	@Test(groups = {"MyTrips - Login  Screen"})
	public static void Login6()
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

			Index.clickOnLoginButton();
			GenerateReport.Logger_click(NodeType, "Login/SignUP");
			Thread.sleep(3000);

			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(7000);

			Index.clickFBcancelbutton();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);

			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);

			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.ValidationPass(NodeType, "Facebook access provided");

			Thread.sleep(7000);


		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}


}



