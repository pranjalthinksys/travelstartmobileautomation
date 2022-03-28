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

public class TC_006_GoogleHomeLoginScreen extends Mobile_Base {


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

//			Index.clickonFacebookbutton();
//			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
//
//			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
//			justonce.click();
//
//			Thread.sleep(8000);
//			
//			Index.clickFBcancelbutton();
//			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
//			Thread.sleep(5000);
//			
//			Index.clickonFacebookbutton();
//			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
//			Thread.sleep(2000);
//			
//			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
//			justonce1.click();
//			Thread.sleep(5000);
//
//			Login.FBaccess();
//			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
//			Thread.sleep(5000);
//			

		
//			
//			Login.FBloginbtn();
//			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login successful");
//
//			Thread.sleep(3000);
//			Login.FBaccess();
//			GenerateReport.ValidationPass(NodeType, "Facebook access provided");
//
//			Thread.sleep(3000);
//
//			Index.clickProfilebutton();
//			GenerateReport.ValidationPass(NodeType, "Profilebutton");
//
//			Index.clicksignoutbutton();
//			GenerateReport.ValidationPass(NodeType, "Signout");
//
//			Index.clickcreateaccountbutton();
//			GenerateReport.ValidationPass(NodeType, "Createmyaccount");

			Index.clickonGooglebutton();
			GenerateReport.Logger_click(NodeType, "Google Login");

			Index.selectGoogleaccount();
			GenerateReport.Logger_click(NodeType, "Googleaccount selected");
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
}
