package mobilePOM;

import java.util.List;

import org.testng.Assert;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TravelStart_Mobile_Notifications {
	


	public AppiumDriver<MobileElement> driver;
	public String result;

	//Constructor

	public TravelStart_Mobile_Notifications(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}

	private List<MobileElement> NotificationBell;
	public List<MobileElement> NotificationBell()
	{
		NotificationBell= driver.findElementsByXPath("//android.widget.Button[@index='2']");
		return NotificationBell;
	}

	private List<MobileElement> Notificationheading;
	public List<MobileElement> Notificationheading()
	{
		Notificationheading= driver.findElementsByXPath("//android.view.View[@index='1']");
		return Notificationheading;
	}

	private List<MobileElement> NoNotificationpage;
	public List<MobileElement> NoNotificationpage()
	{
		NoNotificationpage= driver.findElementsByXPath("//android.view.View[@index='2']");
		return NoNotificationpage;
	}

	private List<MobileElement> NotificationCount;
	public List<MobileElement> NotificationCount()
	{
		NotificationCount=  driver.findElementsByXPath("//android.view.View[@index='3']");
		return NotificationCount;
	}
	
	
	// Actions
	
	public void clickbellicon()
	{
		Assert.assertEquals(true, NotificationBell().get(0).isEnabled(),"Notification button is missing");
		NotificationBell().get(0).click();
	}	
	
	
	public String verifynoNotification(String Text, int Time) throws InterruptedException
	{

		Thread.sleep(Time);
		String note=NoNotificationpage().get(0).getText();
		System.out.println(note);	

		if(note.contentEquals(Text)) 
		{
			result="PASS";
			
		}
		else
		{
			result="FAIL";
			Assert.assertTrue(false, "missing" + note);
		}

		return result;
	}

}
