package Mobile;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Base.Mobile_Base;
import Utilities.GenerateReport;
import Utilities.HelperFunctions;
import Utilities.ReusableMethods;
import config.Config;
import mobilePOM.TravelStart_Mobile_CovidBanner;
import mobilePOM.TravelStart_Mobile_Index;
import mobilePOM.TravelStart_Mobile_Login;
import mobilePOM.TravelStart_Mobile_MyTrips_LoginUser;

public class CovidBanner extends Mobile_Base {


	public static String ValidationResult;
	public static String Email=Config.App_Email;
	public static String Password=Config.App_Password;


	/*
	@Test
	public static void ValidateCovidBannerBHD() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


//		ReusableMethods.verifylogoreuse();
//
//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
			Index.clickhamburgerbutton();
			GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
			Thread.sleep(3000);

			covid.selectcountry();
			GenerateReport.Logger_click(NodeType, "Country selection options");
			Thread.sleep(2000);
			covid.selectradiobuttonBHD();
			Thread.sleep(3000);

			//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
			//					+ "Bahrain - BHD']");
			//			if(BHDcountry.size()>0)
			//			{
			//				System.out.println("BHD country selected");
			//			}
			//			
			//			else
			//			{
			//				System.out.println("Country not selected");
			//				Assert.assertTrue(false, "BHD missing");

			//			}


			covid.clickcrossicon();

	}

	 */

	@Test
	public static void ValidateCovidBannerBotswana() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonBost();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			selectradiobuttonEgypt     selectradiobuttonkenya   selectradiobuttonkuwait
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	@Test
	public static void ValidateCovidBannerEgypt() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonEgypt();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			     selectradiobuttonkenya   selectradiobuttonkuwait
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	@Test
	public static void ValidateCovidBannerkenya() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonkenya();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        selectradiobuttonkuwait
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}
	@Test
	public static void ValidateCovidBannerkuwait() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonkuwait();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerMorroco() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonMorocco();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerNamibia() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonNamibia();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerNigeria() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonNigeria();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerOman() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonOman();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerQatar() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonQatar();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerArabia() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonArabia();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerTanzania() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonTanzania();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerTurkey() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonTurkey();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerUAE() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonUAE();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerSouthAfrica() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonSouthAfrica();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerZimbabwe() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonZimbabwe();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

	public static void ValidateCovidBannerGlobal() throws Exception
	{

		TravelStart_Mobile_Index Index=new TravelStart_Mobile_Index(driver);
		TravelStart_Mobile_Login Login=new TravelStart_Mobile_Login(driver);
		TravelStart_Mobile_CovidBanner covid=new TravelStart_Mobile_CovidBanner(driver);
		HelperFunctions helper=new HelperFunctions(driver);
		TravelStart_Mobile_MyTrips_LoginUser TripsUser=new TravelStart_Mobile_MyTrips_LoginUser (driver);

		test=createTest("Direct Login from Login Screen");
		ExtentTest  NodeType=test;


		//		ReusableMethods.verifylogoreuse();
		//
		//		GenerateReport.ValidationPass(NodeType, "LOGO");

		ReusableMethods.verifysocialreuse();
		Thread.sleep(3000);


		ReusableMethods.covidbanner();
		Thread.sleep(3000);
		Index.clickhamburgerbutton();
		GenerateReport.Logger_click(NodeType, "HamburgerbuttonClick");
		Thread.sleep(3000);

		covid.selectcountry();
		GenerateReport.Logger_click(NodeType, "Country selection options");
		Thread.sleep(2000);
		covid.selectradiobuttonGlobal();
		Thread.sleep(3000);

		//			List<MobileElement> BHDcountry= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Country\r\n"
		//					+ "Bahrain - BHD']");
		//			if(BHDcountry.size()>0)
		//			{
		//				System.out.println("BHD country selected");
		//			}
		//			        
		//			else
		//			{
		//				System.out.println("Country not selected");
		//				Assert.assertTrue(false, "BHD missing");

		//			}


		covid.clickcrossicon();

	}

}
