package mobilePOM;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TravelStart_Mobile_MyTrips_LoginUser {




	public AppiumDriver<MobileElement> driver;
	public String result;

	//Constructor

	public TravelStart_Mobile_MyTrips_LoginUser(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}

	private List<MobileElement> Upcomingtab;
	public List<MobileElement> Upcomingtab()
	{
		Upcomingtab= driver.findElementsByXPath("//android.view.View[@index='0']");
		return Upcomingtab;
	}

	private List<MobileElement> PASTTab;
	public List<MobileElement> PASTTab()
	{
		PASTTab= driver.findElementsByXPath("//android.view.View[@index='1']");
		return PASTTab;
	}

	private List<MobileElement> CANCELLEDTab;
	public List<MobileElement> CANCELLEDTab()
	{
		CANCELLEDTab= driver.findElementsByXPath("//android.view.View[@index='2']");
		return CANCELLEDTab;
	}

	private List<MobileElement> FAILEDTab;
	public List<MobileElement> FAILEDTab()
	{
		FAILEDTab= driver.findElementsByXPath("//android.view.View[@index='3']");
		return FAILEDTab;
	}

	private List<MobileElement> SUSPENDEDTab;
	public List<MobileElement> SUSPENDEDTab()
	{
		SUSPENDEDTab= driver.findElementsByXPath("//android.view.View[@index='4']");
		return SUSPENDEDTab;
	}

	private List<MobileElement> Bookmytripbutton;
	public List<MobileElement> Bookmytripbutton()
	{
		Bookmytripbutton= driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return Bookmytripbutton;
	}


	private List<MobileElement> Backbutton;
	public List<MobileElement> Backbutton()
	{
		Backbutton= driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return Backbutton;
	}

	// ACTIONS

	public void clickbackbutton()
	{
		Assert.assertEquals(true, Backbutton().get(0).isEnabled(),"back button is missing");
		Backbutton().get(0).click();
	}	


	public void clickbookmytripbutton()
	{
		Assert.assertEquals(true, Bookmytripbutton().get(1).isEnabled(),"Bookmytripbutton is missing");
		Bookmytripbutton().get(1).click();
	}	


	public void clickupcomingtab()
	{
		Assert.assertEquals(true, Upcomingtab().get(0).isEnabled(),"Upcomingtab is missing");
		Upcomingtab().get(0).click();
	}	


	public void clickPASTTab()
	{
		Assert.assertEquals(true, PASTTab().get(1).isEnabled(),"PASTTab is missing");
		PASTTab().get(1).click();
	}

	public void clickCANCELLEDTab()
	{
		Assert.assertEquals(true, CANCELLEDTab().get(0).isEnabled(),"CANCELLEDTab is missing");
		CANCELLEDTab().get(0).click();
	}

	public void clickFAILEDTab()
	{
		Assert.assertEquals(true, FAILEDTab().get(0).isEnabled(),"FAILEDTab is missing");
		FAILEDTab().get(0).click();
	}

	public void clickSUSPENDEDTab()
	{
		Assert.assertEquals(true, SUSPENDEDTab().get(0).isEnabled(),"SUSPENDEDTab is missing");
		SUSPENDEDTab().get(0).click();
	}


	//	public String verifynoNotification(String Text, int Time) throws InterruptedException
	//	{
	//
	//		Thread.sleep(Time);
	//		String note=NoNotificationpage().get(0).getText();
	//		System.out.println(note);	
	//
	//		if(note.contentEquals(Text)) 
	//		{
	//			result="PASS";
	//			
	//		}
	//		else
	//		{
	//			result="FAIL";
	//			Assert.assertTrue(false, "missing" + note);
	//		}
	//
	//		return result;
	//	}
}
