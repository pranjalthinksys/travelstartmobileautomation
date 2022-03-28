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
import mobilePOM.TravelStart_Mobile_MyCards;
import mobilePOM.TravelStart_Mobile_MyTravellers;

public class MyCards extends Mobile_Base{



	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	@Test
	public static void MyCardssection() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_MyTravellers travel=new TravelStart_Mobile_MyTravellers(driver);
		TravelStart_Mobile_MyCards cards=new TravelStart_Mobile_MyCards(driver);

		test=createTest("My Cards");
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
		Thread.sleep(2000);
		
		ReusableMethods.manualloginreuse(3);

		Index.clickProfilebutton();
		GenerateReport.ValidationPass(NodeType, "Profilebutton gets clicked");

		Thread.sleep(5000);
		ValidationResult=cards.VerifyMYCARDSbutton();
		System.out.println(ValidationResult);
		GenerateReport.ValidationPass(NodeType, "MyCards verification passed");

		cards.clickonMyCards();
		GenerateReport.ValidationPass(NodeType, "MyCards is enable and clicked");



		List <MobileElement> saved_card_widget = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		if(saved_card_widget.size()>0 )
		{
			Assert.assertEquals(true, saved_card_widget.get(0).isDisplayed());
			test.log(Status.INFO, "Saved card exists");
			System.out.println("Card is already saved, deleting it and adding another card now");

			Thread.sleep(2000);
			cards.clickbinicon();
			GenerateReport.ValidationPass(NodeType, "Bin icon gets clicked");

			ValidationResult = travel.verifyDeletepop();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "Delete pop up appears");

//			Thread.sleep(3000);
//			travel.clicknotnow();
//			GenerateReport.ValidationPass(NodeType, "Not now clicked");
//
//			cards.clickbinicon();
//			GenerateReport.ValidationPass(NodeType, "Bin icon gets clicked");

			travel.clickdelete();
			GenerateReport.ValidationPass(NodeType, "Delete button clicked");

		}

		Thread.sleep(5000);
		cards.EnterCardnumber();
		GenerateReport.ValidationPass(NodeType, "Card details entered");

		cards.EnternameonCard();
		GenerateReport.ValidationPass(NodeType, "Card holder name entered");

		cards.clickonmonthYear();
		GenerateReport.Logger_click(NodeType, "Expiry Details");

		cards.clickDonebutton();
		GenerateReport.ValidationPass(NodeType, "Card expiry details entered");

		cards.EnterCVV();
		GenerateReport.ValidationPass(NodeType, "Card cvv ");

		ValidationResult=cards.VerifySavebutton();
		GenerateReport.Logger_Validation(NodeType, "Save button");

		if(ValidationResult.equalsIgnoreCase("PASS"))
		{
			GenerateReport.ValidationPass(NodeType, "Save button");	
		}
		else
		{
			GenerateReport.ValidationFail(NodeType, "Save Button");
		}

		cards.clickSavebutton();
		GenerateReport.Logger_click(NodeType, "Save Button");
		driver.hideKeyboard();
		Thread.sleep(2000);



		List <MobileElement> invalid_card_number = driver.findElementsByXPath("//android.view.View[@content-desc='Number is invalid']");
		List <MobileElement> invalid_cardexpiry = driver.findElementsByXPath("//android.view.View[@content-desc='Card has expired']");

		if(invalid_card_number.size()>0 || invalid_cardexpiry.size()>0 )
		{

			test.log(Status.INFO, "invalid card details are entered");
			Assert.assertTrue(false,"invalid card details are entered");
			Thread.sleep(5000);
		}
		else
		{

		}



		//		cards.clickbinicon();
		//		GenerateReport.ValidationPass(NodeType, "Bin icon gets clicked");
		//
		//		ValidationResult = travel.verifyDeletepop();
		//		System.out.println(ValidationResult);
		//		GenerateReport.ValidationPass(NodeType, "Delete pop up appears");
		//
		//
		//		travel.clicknotnow();
		//		GenerateReport.ValidationPass(NodeType, "Not now clicked");

		//		travel.clickbinicon();
		//		GenerateReport.ValidationPass(NodeType, "Bin icon gets clicked");
		//
		//		travel.clickdelete();
		//		GenerateReport.ValidationPass(NodeType, "Delete button clicked");



	}

}

