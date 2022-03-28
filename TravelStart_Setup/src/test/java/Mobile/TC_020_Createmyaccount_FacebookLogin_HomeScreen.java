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

public class TC_020_Createmyaccount_FacebookLogin_HomeScreen extends Mobile_Base {
	
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
			
			ValidationResult=Index.VerifyFaceBookButton();
			System.out.println(ValidationResult);
			GenerateReport.ValidationPass(NodeType, "FaceBook Button");
			
			Index.clickOnskip();
			GenerateReport.Logger_click(NodeType, "Skip Button");
			
			Index.verifySkipNote("There");
			GenerateReport.ValidationPass(NodeType, "There");
			
			Index.clickcreateaccountbutton();
			GenerateReport.ValidationPass(NodeType, "Createmyaccount");
			
			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");

			WebElement justonce = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce.click();

			Thread.sleep(8000);
			
			Index.clickFBcancelbutton();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook Login Cancelled");
			Thread.sleep(5000);
			
			Index.clickonFacebookbutton();
			GenerateReport.Logger_click(NodeType, "Facebook Button clicked");
			Thread.sleep(2000);
			
			WebElement justonce1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Use selected app just once']"));
			justonce1.click();
			Thread.sleep(5000);

			Login.FBaccess();
			GenerateReport.Logger_LauchApp(NodeType, "Facebook continue");
			Thread.sleep(5000);
			
			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			Thread.sleep(5000);

}
		
		catch (Exception e)
		{

			e.printStackTrace();
		}
	}
}
