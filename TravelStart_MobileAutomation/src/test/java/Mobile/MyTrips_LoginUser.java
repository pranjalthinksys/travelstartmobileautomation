package Mobile;

import java.util.List;

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
import mobilePOM.TravelStart_Mobile_MyTrips_GuestUser;
import mobilePOM.TravelStart_Mobile_MyTrips_LoginUser;
import mobilePOM.TravelStart_Mobile_Notifications;

public class MyTrips_LoginUser extends Mobile_Base{


	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	@Test
	public static void ValidateUSERMyTrips() throws Exception
	{

		TravelStart_Mobile_MyTrips_GuestUser Trips=new TravelStart_Mobile_MyTrips_GuestUser (driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);
		TravelStart_Mobile_Notifications notification=new TravelStart_Mobile_Notifications (driver);

		test=createTest("MyTrips User Login");
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

		ReusableMethods.manualloginreuse(8);


		Thread.sleep(3000);
		Trips.verifyMyTripsButton();
		System.out.println("My Trips button is visible") ;

		Trips.clickonMyTripsbutton();
		GenerateReport.Logger_click(NodeType, "MyTrips Button");
		System.out.println("My Trips button is visible and clicked");

		List <MobileElement> MyBookings = driver.findElementsByXPath("//android.view.View[@content-desc='My Bookings']");
		if(MyBookings.size()>0 )
		{
			System.out.println("User lands on the My booking page");

			if(TripsUser.Upcomingtab().size()>0)
			{
				System.out.println("User lands on the upcoming tab page");
				GenerateReport.Logger_Validation(NodeType, "Upcoming tab");

			}

			Thread.sleep(3000);
			TripsUser.clickbookmytripbutton();
			GenerateReport.Logger_Validation(NodeType, "Book my trip button clicked");

			Thread.sleep(2000);
			List <MobileElement> SearchFlight = driver.findElementsByXPath("//android.view.View[@content-desc='Search Flights']");
			if(SearchFlight.size()>0)
			{
				System.out.println("Search flight page appears");
				GenerateReport.Logger_Validation(NodeType, "Search Flight page");
				Thread.sleep(2000);

				List <MobileElement> backbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
				backbutton.get(0).click();
				GenerateReport.Logger_Validation(NodeType, "back button clicked");

			}

		}

		else
		{
			Assert.assertTrue(false, "missing Mytrips page");
		}

		Thread.sleep(2000);
		TripsUser.clickPASTTab();
		GenerateReport.Logger_Validation(NodeType, "Past tab clicked");

		if(TripsUser.PASTTab().size()>0)
		{
			System.out.println("User lands on the Past tab page");
		}

		else
		{
			Assert.assertTrue(false, "missing past tab page");
		}

		Thread.sleep(2000);
		TripsUser.clickCANCELLEDTab();
		GenerateReport.Logger_Validation(NodeType, "Cancelled tab clicked");

		if(TripsUser.CANCELLEDTab().size()>0)
		{
			System.out.println("User lands on the Cancelled tab page");
		}

		else
		{
			Assert.assertTrue(false, "missing cancelled tab page");
		}

		Thread.sleep(2000);
		TripsUser.clickFAILEDTab();
		GenerateReport.Logger_Validation(NodeType, "Failed tab clicked");

		if(TripsUser.FAILEDTab().size()>0)
		{
			System.out.println("User lands on the Failed tab page");
		}

		else
		{
			Assert.assertTrue(false, "missing failed tab page");
		}

		Thread.sleep(2000);
		TripsUser.clickSUSPENDEDTab();
		GenerateReport.Logger_Validation(NodeType, "Suspended tab clicked");

		if(TripsUser.SUSPENDEDTab().size()>0)
		{
			System.out.println("User lands on the suspended tab page");
		}

		else
		{
			Assert.assertTrue(false, "missing suspended tab page");
		}

		Thread.sleep(3000);


		notification.clickbellicon();
		GenerateReport.Logger_click(NodeType, "Notification bell clicked");

		Thread.sleep(2000);

		if(notification.Notificationheading().size()>0 )
		{
			System.out.println("Landed on notification page");
			GenerateReport.ValidationPass(NodeType, "Landed on notification page");
		}

		else
		{		
			Assert.assertTrue(false, "Not landed on notification page" + notification.Notificationheading());
		}

		//		notification.verifynoNotification("Uh! Oh! No Notifications Found", 5000);
		//		GenerateReport.ValidationPass(NodeType, "No notifications found");

		Index.ClickBackButton();
		GenerateReport.Logger_Validation(NodeType, "Back button from notifications page clicked");	


		TripsUser.clickbackbutton();
		GenerateReport.Logger_Validation(NodeType, "Back button from My trips page clicked");

		Thread.sleep(3000);
		Login.verifyWelcomeNote("Hello Pranjal, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello Pranjal, Book cheap flights with your one-stop travel shop!");


	}

}
