package mobilePOM;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TravelStart_Mobile_MyTrips_GuestUser {



	public AppiumDriver<MobileElement> driver;
	public String result;

	//Constructor

	public TravelStart_Mobile_MyTrips_GuestUser(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}

	private List<MobileElement> MyTripsButton;
	public List<MobileElement> MyTripsButton()
	{
		MyTripsButton= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='My Trips']");
		return MyTripsButton;
	}


	private List<MobileElement> FindyourbookingHeading;
	public List<MobileElement> FindyourbookingHeading()
	{
		FindyourbookingHeading= driver.findElementsByXPath("//android.view.View[@index='1']");
		return FindyourbookingHeading;
	}

	private List<MobileElement> FindyourbookingSubHeading;
	public List<MobileElement> FindyourbookingSubHeading()
	{
		FindyourbookingSubHeading= driver.findElementsByXPath("//android.view.View[@index='1']");
		return FindyourbookingSubHeading;
	}

	private MobileElement Moredetailstext;
	public MobileElement Moredetailstext()
	{
		Moredetailstext= driver.findElementByXPath("//android.view.View[@content-desc='Dear Traveller, we can only show you the bookings that you have made in the last 12 months.']");
		return Moredetailstext;
	}


	private List<MobileElement> Email;
	public List<MobileElement> Email()
	{
		Email= driver.findElementsByXPath("//android.widget.EditText[@text='Email']");
		return Email;
	}

	private List<MobileElement> BookingReference;
	public List<MobileElement> BookingReference()
	{
		BookingReference= driver.findElementsByXPath("//android.widget.EditText[@text='Booking Reference Number']");
		return BookingReference;
	}

	private List<MobileElement> Surname;
	public List<MobileElement> Surname()
	{
		Surname= driver.findElementsByXPath("//android.widget.EditText[@text='Surname']");
		return Surname;
	}

	private MobileElement SearchButton;
	public MobileElement SearchButton()
	{
		SearchButton= driver.findElementByXPath("//android.widget.Button[@index='3']");
		return SearchButton;
	}
	
	private List<MobileElement> Blankemail;
	public List<MobileElement> Blankemail()
	{
		Blankemail= driver.findElementsByXPath("//android.view.View[@content-desc='Email cannot be blank']");
		return Blankemail;
	}
	
	private List<MobileElement> MissingReference;
	public List<MobileElement> MissingReference()
	{
		MissingReference= driver.findElementsByXPath("//android.view.View[@content-desc='Booking Reference Number cannot be blank']");
		return MissingReference;
	}
	
	private List<MobileElement> Blanksurname;
	public List<MobileElement> Blanksurname()
	{
		Blanksurname= driver.findElementsByXPath("//android.view.View[@content-desc='Surname cannot be blank']");
		return Blanksurname;
	}

	
	private MobileElement invaliddetailokay;
	public MobileElement invaliddetailokay()
	{
		invaliddetailokay= driver.findElementByXPath("//android.widget.Button[@content-desc='Okay']");
		return invaliddetailokay;
	}
	
	
	private List<MobileElement> pendingEmail;
	public List<MobileElement> pendingEmail()
	{
		pendingEmail= driver.findElementsByXPath("//android.widget.EditText[@text='Email']");
		return pendingEmail;
	}

	private List<MobileElement> pendingBookingReference;
	public List<MobileElement> pendingBookingReference()
	{
		pendingBookingReference= driver.findElementsByXPath("//android.widget.EditText[@text='Booking Reference Number']");
		return pendingBookingReference;
	}

	private List<MobileElement> pendingSurname;
	public List<MobileElement> pendingSurname()
	{
		pendingSurname= driver.findElementsByXPath("//android.widget.EditText[@text='Surname']");
		return pendingSurname;
	}
	
	
	
	private List<MobileElement> CancelledBookingReference;
	public List<MobileElement> CancelledBookingReference()
	{
		CancelledBookingReference= driver.findElementsByXPath("//android.widget.EditText[@text='Booking Reference Number']");
		return CancelledBookingReference;
	}
	
	// Actions
	

	public void clickinvalidokaybutton()
	{
		Assert.assertEquals(true, invaliddetailokay().isEnabled(),"invalid pop up okay button is missing");
		invaliddetailokay().click();
	}

	public void clickonSearchbutton()
	{
		Assert.assertEquals(true, SearchButton().isEnabled(),"Search button is missing");
		SearchButton().click();
	}

	public void EnterSurname() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Surname().get(0).isEnabled(),"Surname field is missing");
		Surname().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, Surname().get(0).isEnabled(),"Surname field is missing");
		Surname().get(0).setValue("test");
	}

	public void EnterpendingSurname() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, pendingSurname().get(0).isEnabled(),"Surname field is missing");
		pendingSurname().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, pendingSurname().get(0).isEnabled(),"Surname field is missing");
		pendingSurname().get(0).setValue("Ernest");
	}
	

	public void EnterBookingReference() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, BookingReference().get(0).isEnabled(),"Booking reference field is missing");
		BookingReference().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, BookingReference().get(0).isEnabled(),"Booking reference field is missing");
		BookingReference().get(0).setValue("ZA00000000");
	}

	
	public void EnterpendingBookingReference() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, pendingBookingReference().get(0).isEnabled(),"Booking reference field is missing");
		pendingBookingReference().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, pendingBookingReference().get(0).isEnabled(),"Booking reference field is missing");
		pendingBookingReference().get(0).setValue("NA00164865");
	}
	
	public void EnterFailedBookingReference() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, BookingReference().get(0).isEnabled(),"Booking reference field is missing");
		BookingReference().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, BookingReference().get(0).isEnabled(),"Booking reference field is missing");
		BookingReference().get(0).setValue("ZA00165604");
	}
	
	
	public void EnterCancelledBookingReference() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, BookingReference().get(0).isEnabled(),"Booking reference field is missing");
		BookingReference().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, BookingReference().get(0).isEnabled(),"Booking reference field is missing");
		BookingReference().get(0).setValue("ZA00165609");
	}
	
	
	
	
	public void EnterEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Email().get(0).isEnabled(),"Email field is missing");
		Email().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, Email().get(0).isEnabled(),"Email field is missing");
		Email().get(0).setValue("Test@test.com");
	}
	
	public void EnterpendingEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, pendingEmail().get(0).isEnabled(),"Email field is missing");
		pendingEmail().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, pendingEmail().get(0).isEnabled(),"Email field is missing");
		pendingEmail().get(0).setValue("mrezza.ernest@gmail.com");
	}

	public String verifybookingHeading(String Text, int Time) throws InterruptedException
	{

		Thread.sleep(Time);
		String note=FindyourbookingHeading().get(0).getText();
		System.out.println(note);	

		if(note.contentEquals(Text)) 
		{
			result="PASS";
		}
		else
		{
			result="FAIL";
			Assert.assertTrue(false,  "missing" + note);
		}

		return result;
	}

	public String verifybookingSubHeading(String Text, int Time) throws InterruptedException
	{

		Thread.sleep(Time);
		String note=FindyourbookingSubHeading().get(1).getText();
		System.out.println(note);	

		if(note.contentEquals(Text)) 
		{
			result="PASS";
		}
		else
		{
			result="FAIL";
			Assert.assertTrue(false , "missing" + note);
		}

		return result;
	}

	public String verifyMoredetailstext(String Text, int Time) throws InterruptedException
	{

		Thread.sleep(Time);
		String note=Moredetailstext().getText();
		System.out.println(note);	

		if(note.contentEquals(Text)) 
		{
			result="PASS";
		}
		else
		{
			result="FAIL";
			Assert.assertTrue(false , "missing" + note);
		}

		return result;
	}

	public void clickonMyTripsbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTripsButton().get(0).isEnabled(),"MyTrips button is missing");
		MyTripsButton().get(0).click();
	}

		public String verifyMyTripsButton(){
	Assert.assertEquals(true, MyTripsButton().get(0).isDisplayed(),"MyTrips button is missing");
			return result=VerifyElement(MyTripsButton());
		}


	public String VerifyElement(List<MobileElement>Element) 
	{
		if(Element.size()>0)
		{
			result="PASS";
		}
		else
		{
			result="FAIL";
			Assert.assertTrue(false , "missing" + Element);
		}
		return result;
	}

}
