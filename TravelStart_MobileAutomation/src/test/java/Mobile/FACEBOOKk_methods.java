package Mobile;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;



public class FACEBOOKk_methods extends Mobile_Base {

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	/**
	 *  [TestMethod]
	 *  [Description("To Login to the site Travelstart")] 
	 * @throws Exception 
	 */
		@Test
	
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

		
		ReusableMethods.fbreuse();
	}}
		//
//
//		//			public static void validate(ExtentTest NodeType,String element) 
//		//			{
//		//				if(ValidationResult.equalsIgnoreCase("PASS"))
//		//				{
//		//					GenerateReport.ValidationPass(NodeType, element);	
//		//				}
//		//				else
//		//				{
//		//					GenerateReport.ValidationFail(NodeType, element);
//		//				}
//	}
//
//
//
//	@Test(groups = {"From Home Login Screen"})
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
//		ReusableMethods.fbreuse();
//	}
//
//
//	//	// Another method
//	@Test(groups = {"CreateMyAccount - Login Home Screen"})
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
//		ValidationResult=Index.VerifyFaceBookButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "FaceBook Button");
//
//		Index.clickOnskip();
//		GenerateReport.Logger_click(NodeType, "Skip Button");
//
//		Index.verifySkipNote("There");
//		GenerateReport.ValidationPass(NodeType, "There");
//
//		//Index.clickcreateaccountbutton();
//		GenerateReport.ValidationPass(NodeType, "Createmyaccount");
//
//		ReusableMethods.fbreuse();
//
//	}
//
//	// Anoither methiod
//
//	@Test(groups = {"Hamburger - Login Home Screen"})
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
//		Index.clickhamburgerbutton();
//		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
//		Thread.sleep(3000);
//
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//
//		ValidationResult=Index.VerifyFaceBookButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "FaceBook Button");
//
//		ReusableMethods.fbreuse();
//
//	}
//
//	// ----------------------------------------------
//	@Test(groups = {"ProfileButton - Login Home Screen"})
//	public static void Login4() throws Exception
//	{
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
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//
//		ValidationResult=Index.VerifyFaceBookButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "FaceBook Button");
//
//		ReusableMethods.fbreuse();
//
//	}
//
//	// --------------------------------------------------------
//	@Test(groups = {"Support - Login Home Screen"})
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
//		Index.clicksupportbutton();
//		GenerateReport.Logger_click(NodeType, "Supportbutton clicked");
//		Thread.sleep(3000);
//
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//
//		ValidationResult=Index.VerifyFaceBookButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "FaceBook Button");
//
//		ReusableMethods.fbreuse();
//	}
//
//	// --------------------------------------
//
//	@Test(groups = {"MyTrips - Login  Screen"})
//	public static void Login6() throws Exception
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
//		ValidationResult=Index.VerifyFaceBookButton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "FaceBook Button");
//
//		ReusableMethods.fbreuse();
//
//	}
//}
//
