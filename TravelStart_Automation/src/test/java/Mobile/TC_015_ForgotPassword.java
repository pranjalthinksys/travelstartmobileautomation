package Mobile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import io.appium.java_client.MobileElement;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class TC_015_ForgotPassword extends Mobile_Base {

	public static String ValidationResult;
	public static String Email=Config.App_Email;
	//	public static String Password=Config.App_Password;

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

			Login.EnterEmail(Email);
			GenerateReport.Logger_EnterData(NodeType, "EmailTextbox",Email);

			Thread.sleep(5000);

			Login.ClickForgotpassword();
			GenerateReport.Logger_click(NodeType, "Forgot password ");
			Thread.sleep(7000);

			Login.verifyForgotpasswordalert("Alert A password reset email has been sent, please check your mailbox.Ok");
			GenerateReport.ValidationPass(NodeType, "Forgot password message - Alert A password reset email has been sent, please check your mailbox.Ok");

			Thread.sleep(5000);

			driver.findElements(By.xpath("//android.view.View[@index='0']")).get(0).click();
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();

		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
