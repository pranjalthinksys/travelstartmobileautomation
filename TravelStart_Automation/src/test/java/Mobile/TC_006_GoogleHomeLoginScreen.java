package Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.Mobile_Base;
import Utilities.GenerateReport;
import config.Config;
import mobilePOM.TravelStart_Mobile_Index;

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


			test=createTest("Login");
			ExtentTest  NodeType=test;
			GenerateReport.Logger_LauchApp(NodeType, "TravelStart");

			Index.clickOnClosePopUp();
			GenerateReport.Logger_click(NodeType, "PopUpclose");

			Thread.sleep(5000);
			ValidationResult=Index.VerifyLOGO();
			System.out.println(ValidationResult);

			Index.clickonGooglebutton();
			GenerateReport.Logger_click(NodeType, "Google Login button");

			Index.selectGoogleaccount();
			GenerateReport.Logger_click(NodeType, "Googleaccount selected");
			Thread.sleep(5000);

			WebElement loctiondontallow = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
			loctiondontallow.click();
			GenerateReport.ValidationPass(NodeType, "Google login successfull");
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
