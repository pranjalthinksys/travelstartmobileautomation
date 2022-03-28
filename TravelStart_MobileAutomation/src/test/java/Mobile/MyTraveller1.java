package Mobile;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;

import io.appium.java_client.MobileElement;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;
import mobilePOM.TravelStart_Mobile_MyTravellers;

public class MyTraveller1 extends Mobile_Base {


	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

//	@Test
//	public static void AppIndexPage() throws Exception
//	{
//
//		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
//		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//		TravelStart_Mobile_MyTravellers travel=new TravelStart_Mobile_MyTravellers(driver);
//
//		test=createTest("MyTraveller - All Fields filled");
//		ExtentTest  NodeType=test;
//
//		Thread.sleep(5000);
//		ReusableMethods.verifylogoreuse();
//
//		Index.clickOnLoginButton();
//		GenerateReport.Logger_click(NodeType, "Login/SignUP");
//
//		ValidationResult=Login.VerifyLoginButton();
//		GenerateReport.Logger_Validation(NodeType, "Login Button");
//
//		if(ValidationResult.equalsIgnoreCase("PASS"))
//		{
//			GenerateReport.ValidationPass(NodeType, "Login Button");	
//		}
//		else
//		{
//			GenerateReport.ValidationFail(NodeType, "Login Button");
//		}
//
//		Login.EnterEmail(Email);
//		GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);
//		GenerateReport.ValidationPass(NodeType, "Email entered");
//
//		System.out.println(Password);
//		Login.EnterPassword(Password);
//		GenerateReport.Logger_EnterData(NodeType, "PasswordTextbox",Password);
//		GenerateReport.ValidationPass(NodeType, "Password entered");
//
//		Login.ClickLogin();
//		GenerateReport.Logger_click(NodeType, "Login Button");
//		GenerateReport.ValidationPass(NodeType, "Login button clicked");
//
//		Login.verifyWelcomeNote("Hello Pranjal, Book cheap flights with your one-stop travel shop!");
//		GenerateReport.ValidationPass(NodeType, "Hello Pranjal, Book cheap flights with your one-stop travel shop!");
//
//		Index.clickProfilebutton();
//		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");
//
//		Thread.sleep(5000);
//		ValidationResult=travel.Verifytravelbutton();
//		System.out.println(ValidationResult);
//		GenerateReport.ValidationPass(NodeType, "MyTravellers verification passed");
//
//		travel.clickonMyTravellers();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers is enable and clicked");
//		
//		
//		List <MobileElement> Saved_passeneger_heading = driver.findElementsByXPath("//android.view.View[@content-desc='Saved Passengers']");;
//		if(Saved_passeneger_heading.size()>0 )
//		{
//			Assert.assertEquals(true, Saved_passeneger_heading.get(0).isDisplayed());
//			test.log(Status.INFO, "Saved card exists");
//			System.out.println("My Traveller details are already saved, deleting it to add new one");
//		
//			Thread.sleep(2000);
//			travel.clickbinicon();
//			GenerateReport.ValidationPass(NodeType, "Bin icon gets clicked");
//			
//			travel.clickdelete();
//			GenerateReport.ValidationPass(NodeType, "Delete button clicked");
//		}
//		
//		else
//		{
//			System.out.println("Adding my traveller details now");
//		
//		}
//		Thread.sleep(3000);
//
//		travel.clickonMyTravellersFEMALE();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers Female gender selected");
//
//		travel.clickonMyTravellersMALE();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers male gender selected");
//
//		travel.EnterMyTravellersFirstname();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers First name entered");
//		driver.hideKeyboard();
//
//		travel.clickonTravelMiddlename();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers Middle name entered");
//
//		driver.hideKeyboard();
//		Thread.sleep(2000);
//
//		travel.EnterMyTravellersLastnamefield();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers Last name entered");
//
//		driver.hideKeyboard();
//		Thread.sleep(5000);
//
//		travel.clickonMyTravelNationality();
//		GenerateReport.ValidationPass(NodeType, "South Africa is selected");
//
//		travel.clickontravelDOB();
//		GenerateReport.ValidationPass(NodeType, "Date of Birth Entered");
//
//		Thread.sleep(3000);
//		travel.Enterpassportnumber();
//		GenerateReport.ValidationPass(NodeType, "Passport number entered");
//
//		travel.Enterpassportissuecountry();
//		GenerateReport.ValidationPass(NodeType, "Passport issuing country is entered");
//
//		travel.Enterexpirationdate();
//		GenerateReport.ValidationPass(NodeType, "passport expiry date entered");
//
//		travel.clickfrequentflyer();
//		GenerateReport.ValidationPass(NodeType, "Frequentflyer clicked");
//
//		travel.enterflyernumber();
//		GenerateReport.ValidationPass(NodeType, "Flyer number entered");
//
//		travel.clicksavebutton();
//		GenerateReport.ValidationPass(NodeType, "Flyer save button clicked");
//
//		travel.clickCONTINUEbutton();
//		GenerateReport.ValidationPass(NodeType, "CONTINUE button clicked");
//
//		Thread.sleep(5000);
//		ValidationResult=travel.VerifySavedpassengerheading();
//		System.out.println(ValidationResult);
//		GenerateReport.Logger_Validation(NodeType, "Saved Passenger page");
//		
//	}

	
	// Another method
	@Test
	public static void AppIndexPage1() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_MyTravellers travel=new TravelStart_Mobile_MyTravellers(driver);

		test=createTest("MyTraveller - Editing the fields");
		ExtentTest  NodeType=test;

		Thread.sleep(5000);
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

		Login.verifyWelcomeNote("Hello Pranjal, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello Pranjal, Book cheap flights with your one-stop travel shop!");

		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Thread.sleep(5000);
		ValidationResult=travel.Verifytravelbutton();
		System.out.println(ValidationResult);
		GenerateReport.ValidationPass(NodeType, "MyTravellers verification passed");

		travel.clickonMyTravellers();
		GenerateReport.ValidationPass(NodeType, "MyTravellers is enable and clicked");
		
		
		List <MobileElement> Saved_passeneger_heading = driver.findElementsByXPath("//android.view.View[@content-desc='Saved Passengers']");;
		if(Saved_passeneger_heading.size()>0 )
		{
			Assert.assertEquals(true, Saved_passeneger_heading.get(0).isDisplayed());
			test.log(Status.INFO, "Saved card exists");
			System.out.println("My Traveller details are already saved, editing it now");
		
			Thread.sleep(5000);
			travel.clickedittraveller();
			GenerateReport.ValidationPass(NodeType, "edit button clicked");
			Thread.sleep(3000);
		}
		
		else
		{
			System.out.println("Adding my traveller details now");
		
		Thread.sleep(3000);

		travel.clickonMyTravellersFEMALE();
		GenerateReport.ValidationPass(NodeType, "MyTravellers Female gender selected");

		travel.clickonMyTravellersMALE();
		GenerateReport.ValidationPass(NodeType, "MyTravellers male gender selected");

		travel.EnterMyTravellersFirstname();
		GenerateReport.ValidationPass(NodeType, "MyTravellers First name entered");
		driver.hideKeyboard();

		travel.clickonTravelMiddlename();
		GenerateReport.ValidationPass(NodeType, "MyTravellers Middle name entered");

		driver.hideKeyboard();
		Thread.sleep(2000);

		travel.EnterMyTravellersLastnamefield();
		GenerateReport.ValidationPass(NodeType, "MyTravellers Last name entered");

		driver.hideKeyboard();
		Thread.sleep(5000);

		travel.clickonMyTravelNationality();
		GenerateReport.ValidationPass(NodeType, "South Africa is selected");

		travel.clickontravelDOB();
		GenerateReport.ValidationPass(NodeType, "Date of Birth Entered");

		Thread.sleep(3000);
		travel.Enterpassportnumber();
		GenerateReport.ValidationPass(NodeType, "Passport number entered");

		travel.Enterpassportissuecountry();
		GenerateReport.ValidationPass(NodeType, "Passport issuing country is entered");

		travel.Enterexpirationdate();
		GenerateReport.ValidationPass(NodeType, "passport expiry date entered");

		travel.clickfrequentflyer();
		GenerateReport.ValidationPass(NodeType, "Frequentflyer clicked");

		travel.enterflyernumber();
		GenerateReport.ValidationPass(NodeType, "Flyer number entered");

		travel.clicksavebutton();
		GenerateReport.ValidationPass(NodeType, "Flyer save button clicked");

		travel.clickCONTINUEbutton();
		GenerateReport.ValidationPass(NodeType, "CONTINUE button clicked");

		Thread.sleep(5000);
		ValidationResult=travel.VerifySavedpassengerheading();
		System.out.println(ValidationResult);
		GenerateReport.Logger_Validation(NodeType, "Saved Passenger page");
		
		}
		

		
		travel.clickonMyTravellersFEMALE();
		GenerateReport.ValidationPass(NodeType, "MyTravellers Female gender selected");

		travel.clickonMyTravellersMALE();
		GenerateReport.ValidationPass(NodeType, "MyTravellers male gender selected");
		
		travel.EnterMyTravellersFirstname1();
		GenerateReport.ValidationPass(NodeType, "MyTravellers First name updated");
		driver.hideKeyboard();
		
//		travel.clickonTravelMiddlename1();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers Middle name updated");
//
//		driver.hideKeyboard();
//		Thread.sleep(2000);
//
//		travel.EnterMyTravellersLastnamefield1();
//		GenerateReport.ValidationPass(NodeType, "MyTravellers Last name updated0");
//
//		driver.hideKeyboard();
//		Thread.sleep(5000);
//		travel.clickonMyTravelNationality();
//		GenerateReport.ValidationPass(NodeType, "South Africa is selected");
//
//		travel.clickontravelDOB();
//		GenerateReport.ValidationPass(NodeType, "Date of Birth Entered");
//
//		Thread.sleep(3000);
//		travel.Enterpassportnumber1();
//		GenerateReport.ValidationPass(NodeType, "Passport number entered");
//		
//		travel.Enterpassportissuecountry();
//		GenerateReport.ValidationPass(NodeType, "Passport issuing country is entered");
//
//		travel.Enterexpirationdate();
//		GenerateReport.ValidationPass(NodeType, "passport expiry date entered");
//
//		travel.clickfrequentflyer();
//		GenerateReport.ValidationPass(NodeType, "Frequentflyer clicked");
//
//		travel.enterflyernumber1();
//		GenerateReport.ValidationPass(NodeType, "Flyer number entered");
		}
	}

