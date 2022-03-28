package Mobile;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class TC_0010_GoogleLoginScreen extends Mobile_Base {

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	/**
	 *  [TestMethod]
	 *  [Description("To Login to the site Travelstart")] 
	 */

	@Test

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


//
//			Index.clickcreateaccountbutton();
//			GenerateReport.ValidationPass(NodeType, "Createmyaccount");
//
//			Index.clickOnLoginButton();
//			GenerateReport.Logger_click(NodeType, "Login/SignUP");

			Index.clickonGooglebutton();
			GenerateReport.Logger_click(NodeType, "Google Login");

			Index.selectGoogleaccount();
			GenerateReport.Logger_click(NodeType, "Googleaccount selected");
			Thread.sleep(3000);
			
			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);
			
			Thread.sleep(5000);

			Index.clickProfilebutton();
			GenerateReport.ValidationPass(NodeType, "Profilebutton");

			Index.clicksignoutbutton();
			GenerateReport.ValidationPass(NodeType, "Signout");

			//			Login.EnterEmail(Email);
			//			GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);
			//			
			//			System.out.println(Password);
			//			Login.EnterPassword(Password);
			//			GenerateReport.Logger_EnterData(NodeType, "PasswordTextbox",Password);
			//			
			//			Login.ClickLogin();
			//			GenerateReport.Logger_click(NodeType, "Login Button");

			//			Login.verifyWelcomeNote("Suresh");
			//			GenerateReport.ValidationPass(NodeType, "Suresh");
		}

		catch (Exception e)
		{

			e.printStackTrace();
		}
	}


}
