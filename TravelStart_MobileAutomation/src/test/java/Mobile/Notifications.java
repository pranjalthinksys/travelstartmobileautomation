package Mobile;

import java.util.List;

import javax.management.Notification;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;
import io.appium.java_client.MobileElement;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;
import mobilePOM.TravelStart_Mobile_Notifications;

public class Notifications extends Mobile_Base {
	
	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	@Test
	public static void ValidateNotifications() throws Exception
	{

		TravelStart_Mobile_Notifications notification=new TravelStart_Mobile_Notifications (driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);

		test=createTest("Notifications verification");
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
		Thread.sleep(3000);
		
		if(notification.NotificationBell().size()>0 )
		{
			System.out.println("Bell icon is visible and available");
			GenerateReport.ValidationPass(NodeType, "Bell icon is visible and available");
		}
		
		else
		{
			System.out.println("Bell icon is missing");
			Assert.assertTrue(false, "Bell icon is missing");
		}
		
		
		if(notification.NotificationCount().size()>0 )
		{
			
			System.out.println("Notification count is present:" + notification.NotificationCount());
		}
		
//		notification.clickbellicon();
//		GenerateReport.Logger_click(NodeType, "Notification bell clicked");
//		
//		Thread.sleep(2000);
//		
//		if(notification.Notificationheading().size()>0 )
//		{
//			System.out.println("Landed on notification page");
//			GenerateReport.ValidationPass(NodeType, "Landed on notification page");
//		}
//		
//		else
//		{		
//			Assert.assertTrue(false, "Not landed on notification page" + notification.Notificationheading());
//		}
//		
//		notification.verifynoNotification("Uh! Oh! No Notifications Found", 5000);
//		GenerateReport.ValidationPass(NodeType, "No notifications found");
//		
//		Index.ClickBackButton();
//		
	}
	}
