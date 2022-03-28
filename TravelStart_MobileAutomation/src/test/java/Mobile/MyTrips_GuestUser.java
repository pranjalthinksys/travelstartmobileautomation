package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;
import mobilePOM.TravelStart_Mobile_MyTrips_GuestUser;

public class MyTrips_GuestUser extends Mobile_Base {
	
	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;

	@Test
//	public static void ValidateGuestMyTrips() throws Exception
//	{
//
//		TravelStart_Mobile_MyTrips_GuestUser Trips=new TravelStart_Mobile_MyTrips_GuestUser (driver);
//		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
//
//		test=createTest("MyTrips Guest Login");
//		ExtentTest  NodeType=test;
//
//		ReusableMethods.verifylogoreuse();
//
//		GenerateReport.ValidationPass(NodeType, "LOGO");
//
////		ReusableMethods.verifysocialreuse();
////		Thread.sleep(3000);
////		
////		Index.ClickBackButton();
////		GenerateReport.Logger_click(NodeType, "Back Button");
//
//		Index.clickOnskip();
//		GenerateReport.Logger_click(NodeType, "Skip Button");
//
//		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
//		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
//		
//		Trips.verifyMyTripsButton();
//		System.out.println("My Trips button is visible") ;
//		
//		Trips.clickonMyTripsbutton();
//		GenerateReport.Logger_click(NodeType, "MyTrips Button");
//		System.out.println("My Trips button is visible and clicked");
//				
////		ValidationResult=Trips.verifybookingHeading("Find Your Booking",5000);
////		validate(NodeType, "Find Your Booking");
////		System.out.println("First part pass");
////		
////		ValidationResult=Trips.verifybookingSubHeading("Enter the email address you used when making the booking and the 10 digit Travelstart booking reference number and we will track it down.",7000);
////		validate(NodeType, "SubHeading text");
////		System.out.println("Second part pass");
////		
////		ValidationResult=Trips.verifyMoredetailstext("Find Your Booking",5000);
////		validate(NodeType, "Find Your Booking");
//		
//		Trips.EnterEmail();
//		GenerateReport.ValidationPass(NodeType, "Email Entered");
//		
//		Trips.EnterBookingReference();
//		GenerateReport.ValidationPass(NodeType, "Booking Reference entererd");
//		
//		Trips.EnterSurname();
//		GenerateReport.ValidationPass(NodeType, "Surname entered");
//		
//		Trips.clickonSearchbutton();
//	}
		
		
		// Another method
		
		
		public static void ValidateGuestMyTrips1() throws Exception
		{

			TravelStart_Mobile_MyTrips_GuestUser Trips=new TravelStart_Mobile_MyTrips_GuestUser (driver);
			TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
			TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);

			test=createTest("MyTrips Guest Login- with empty fields");
			ExtentTest  NodeType=test;

			ReusableMethods.verifylogoreuse();

			GenerateReport.ValidationPass(NodeType, "LOGO");

//			ReusableMethods.verifysocialreuse();
//			Thread.sleep(3000);
//			
//			Index.ClickBackButton();
//			GenerateReport.Logger_click(NodeType, "Back Button");

			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");

			Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
			GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");
			
			Trips.verifyMyTripsButton();
			System.out.println("My Trips button is visible") ;
			
			Trips.clickonMyTripsbutton();
			GenerateReport.Logger_click(NodeType, "MyTrips Button");
			System.out.println("My Trips button is visible and clicked");
					
//			ValidationResult=Trips.verifybookingHeading("Find Your Booking",5000);
//			validate(NodeType, "Find Your Booking");
//			System.out.println("First part pass");
//			
//			ValidationResult=Trips.verifybookingSubHeading("Enter the email address you used when making the booking and the 10 digit Travelstart booking reference number and we will track it down.",7000);
//			validate(NodeType, "SubHeading text");
//			System.out.println("Second part pass");
//			
//			ValidationResult=Trips.verifyMoredetailstext("Find Your Booking",5000);
//			validate(NodeType, "Find Your Booking");
			Trips.clickonSearchbutton();
			
			if(Trips.Blankemail().size()>0 || Trips.MissingReference().size()>0 || Trips.Blanksurname().size() > 0)
			{
				System.out.println("Fields are missing");
			}
			
			Trips.EnterEmail();
			GenerateReport.ValidationPass(NodeType, "Email Entered");
			
			if(Trips.Blankemail().size()>0 || Trips.MissingReference().size()>0 || Trips.Blanksurname().size() > 0)
			{
				System.out.println("Fields are missing");
			}
			
			Trips.EnterBookingReference();
			GenerateReport.ValidationPass(NodeType, "Booking Reference entererd");
			
			if(Trips.Blankemail().size()>0 || Trips.MissingReference().size()>0 || Trips.Blanksurname().size() > 0)
			{
				System.out.println("Fields are missing");
			}
			
			Trips.EnterSurname();
			GenerateReport.ValidationPass(NodeType, "Surname entered");
			
			Trips.clickonSearchbutton();
			
			if(Trips.Blankemail().size()>0 || Trips.MissingReference().size()>0 || Trips.Blanksurname().size() > 0)
			{
				System.out.println("Field missing");
			}
			
			Thread.sleep(3000);
			Trips.clickinvalidokaybutton();
		
}
	
	
	public static void validate(ExtentTest NodeType,String element) 
	{
		if(ValidationResult.equalsIgnoreCase("PASS"))
		{
			GenerateReport.ValidationPass(NodeType, element);	
		}
		else
		{
			GenerateReport.ValidationFail(NodeType, element);
		}
	}
	
}