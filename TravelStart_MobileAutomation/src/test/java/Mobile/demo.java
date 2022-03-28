package Mobile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.Excel_Utilities;
import Utilities.GenerateReport;
import Utilities.ReusableMethods;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;


public class demo extends Mobile_Base {

	
	public static String ValidationResult;
	public static String Email;
	public static String Password;
	
	@Test(groups = {"Sanity"})
	public static void AppIndexPage() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
//		GenerateReport Node=new GenerateReport(test);
	
		test = extent.createTest("Validate Guest Login from Home Login Page");
		System.out.println(test);
		
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

		/*These lines are addeed
		 * 
		 */
		
		int DataRow=Excel_Utilities.getCellData("SuiteFile",11, 4);
		if(DataRow==0)
		{
			System.out.println("Please Enter valid Data in the TestData_Row ; The row cannot be zero");
		}
		else
		{
		Email=Excel_Utilities.getCellValue("Login",DataRow-1, 0);
		
		System.out.println("Email: "+Email);
		
		Password=Excel_Utilities.getCellValue("Login",DataRow-1, 1);
		System.out.println("Password :" +Password);
		
		}
		
		/*
		 * 
		 */
		
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
		
		
		
		

		ReusableMethods.verifysocialreuse();
		Index.ClickBackButton();
		GenerateReport.Logger_click(NodeType, "Back Button");
		System.out.println("BACK Button");

		Index.clickOnskip();
		GenerateReport.Logger_click(NodeType, "Skip Button");
		System.out.println("Skip button");

		Index.verifySkipNote("Hello there, Book cheap flights with your one-stop travel shop!");
		GenerateReport.ValidationPass(NodeType, "Hello there, Book cheap flights with your one-stop travel shop!");


	}
}
