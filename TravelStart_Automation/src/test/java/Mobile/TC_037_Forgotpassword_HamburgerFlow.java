package Mobile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import io.appium.java_client.MobileElement;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;

public class TC_037_Forgotpassword_HamburgerFlow extends Mobile_Base{

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
			
			Login.ClickForgotpassword();
			Thread.sleep(3000);
			
			Login.verifyForgotpasswordalert("Alert A password reset email has been sent, please check your mailbox.Ok");
			GenerateReport.ValidationPass(NodeType, "Forgot password message");
			
			MobileElement E = driver.findElement(By.xpath("//android.view.View[@index='0']"));
			E.click();
		
			
		}

			catch (Exception e) {

				e.printStackTrace();
			}
		}

	
}
