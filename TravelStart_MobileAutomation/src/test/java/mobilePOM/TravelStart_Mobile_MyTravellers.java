package mobilePOM;

import java.util.List;


import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TravelStart_Mobile_MyTravellers {



	public AppiumDriver<MobileElement> driver;
	public String result;

	//Constructor

	public TravelStart_Mobile_MyTravellers(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}

	private List<MobileElement> MyTravellerButton;
	public List<MobileElement> MyTravellerButton()
	{
		MyTravellerButton= driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		return MyTravellerButton;
	}

	private List<MobileElement> MyTravellerButtonverify;
	public List<MobileElement> MyTravellerButtonverify()
	{
		MyTravellerButtonverify= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='My Travellers']");
		return MyTravellerButtonverify;
	}


	private List<MobileElement> SavedPassengerverify;
	public List<MobileElement> SavedPassengerverify()
	{
		SavedPassengerverify= driver.findElementsByXPath("//android.view.View[@content-desc='Saved Passengers']");
		return SavedPassengerverify;
	}


	private List<MobileElement> MyTravellerMale;
	public List<MobileElement> MyTravellerMale()
	{
		MyTravellerMale= driver.findElementsByXPath("//android.view.View[@index='3']");
		return MyTravellerMale;
	}

	private List<MobileElement> MyTravellerFeMale;
	public List<MobileElement> MyTravellerFeMale()
	{
		MyTravellerFeMale= driver.findElementsByXPath("//android.view.View[@index='4']");
		return MyTravellerFeMale;
	}

	private MobileElement MyTravellerFirstname;
	public MobileElement MyTravellerFirstname()
	{
		MyTravellerFirstname= driver.findElementByXPath("//android.widget.EditText[@index='5']");
		return MyTravellerFirstname;
	}



	private List<MobileElement> EnterMyTravellerFirstname;
	public List<MobileElement> EnterMyTravellerFirstname()
	{
		EnterMyTravellerFirstname= driver.findElementsByXPath("//android.widget.EditText[@index='5']");
		return EnterMyTravellerFirstname;
	}


	private List<MobileElement> EnterMyTravellerFirstname1;
	public List<MobileElement> EnterMyTravellerFirstname1()
	{
		EnterMyTravellerFirstname1= driver.findElementsByXPath("//android.widget.EditText[@index='5']");
		return EnterMyTravellerFirstname1;
	}

	private MobileElement MyTravellerLastname;
	public MobileElement MyTravellerLastname()
	{
		MyTravellerLastname= driver.findElementByXPath("//android.widget.EditText[@text='Last Name']");
		return MyTravellerLastname;
	}

	private List<MobileElement> EnterMyTravellerLastname;
	public List<MobileElement> EnterMyTravellerLastname()
	{
		EnterMyTravellerLastname= driver.findElementsByXPath("//android.widget.EditText[@index='6']");
		return EnterMyTravellerLastname;
	}

	private MobileElement MyTravellerNationality;
	public MobileElement MyTravellerNationality()
	{
		MyTravellerNationality= driver.findElementByXPath("//android.view.View[@text='Nationality']");
		return MyTravellerNationality;
	}

	private List<MobileElement> MyTravellerSearchcountry;
	public List<MobileElement> MyTravellerSearchcountry()
	{
		MyTravellerSearchcountry= driver.findElementsByXPath("//android.widget.EditText[@text='Search Country']");
		return MyTravellerSearchcountry;
	}	

	private List<MobileElement> Frequentflyerlist;
	public List<MobileElement> Frequentflyerlist()
	{
		Frequentflyerlist= driver.findElementsByXPath("//android.widget.EditText[@text='Search Frequent flyer']");
		return Frequentflyerlist;
	}

	private MobileElement MyTravellerMiddlename;
	public MobileElement MyTravellerMiddlename()
	{
		MyTravellerMiddlename= driver.findElementByXPath("//android.widget.EditText[@index='6']");
		return MyTravellerMiddlename;
	}

	private List<MobileElement> EnterMyTravellerMiddlename;
	public List<MobileElement> EnterMyTravellerMiddlename()
	{
		EnterMyTravellerMiddlename= driver.findElementsByXPath("//android.widget.EditText[@index='6']");
		return EnterMyTravellerMiddlename;
	}

	private MobileElement MyTravellerDOB;
	public MobileElement MyTravellerDOB()
	{
		MyTravellerDOB= driver.findElementByXPath("//android.view.View[@text='Date of Birth dd/mm/yy']");
		return MyTravellerDOB;
	}

	private MobileElement MyTravellerDOBdate;
	public MobileElement MyTravellerDOBdate()
	{
		MyTravellerDOBdate= driver.findElementByXPath("//android.widget.SeekBar[@index='3']");
		return MyTravellerDOBdate;
	}

	private MobileElement MyTravellerDOBmonth;
	public MobileElement MyTravellerDOBmonth()
	{
		MyTravellerDOBmonth= driver.findElementByXPath("//android.widget.SeekBar[@index='4']");
		return MyTravellerDOBmonth;
	}

	private MobileElement MyTravellerDOByear;
	public MobileElement MyTravellerDOByear()
	{
		MyTravellerDOByear= driver.findElementByXPath("//android.widget.SeekBar[@index='5']");
		return MyTravellerDOByear;
	}

	private MobileElement MyTravellerDOBDONE;
	public MobileElement MyTravellerDOBDONE()
	{
		MyTravellerDOBDONE= driver.findElementByXPath("//android.widget.Button[@content-desc='Done']");
		return MyTravellerDOBDONE;
	}

	private MobileElement MyTravellerpassportnumber;
	public MobileElement MyTravellerpassportnumber()
	{
		MyTravellerpassportnumber= driver.findElementByXPath("//android.widget.EditText[@text='Passport number']");
		return MyTravellerpassportnumber;
	}


	private List<MobileElement> MyTravellerpassportnumber1;
	public List<MobileElement> MyTravellerpassportnumber1()
	{
		MyTravellerpassportnumber1= driver.findElementsByXPath("//android.widget.EditText[@index='4']");
		return MyTravellerpassportnumber1;
	}

	private MobileElement MyTravellerexpirationdate;
	public MobileElement MyTravellerexpirationdate()
	{
		MyTravellerexpirationdate= driver.findElementByXPath("//android.view.View[@text='Expiration date']");
		return MyTravellerexpirationdate;
	}

	private MobileElement MyTravellerpassportissuecountry;
	public MobileElement MyTravellerpassportissuecountry()
	{
		MyTravellerpassportissuecountry= driver.findElementByXPath("//android.view.View[@text='Passport Issued Country']");
		return MyTravellerpassportissuecountry;
	}

	private MobileElement Frequentflyerlink;
	public MobileElement Frequentflyerlink()
	{
		Frequentflyerlink= driver.findElementByXPath("//android.widget.ImageView[@content-desc='Add Frequent flyer programme']");
		return Frequentflyerlink;
	}

	private MobileElement Frequentflyernumber;
	public MobileElement Frequentflyernumber()
	{
		Frequentflyernumber= driver.findElementByXPath("//android.widget.EditText[@text='Frequent Flyer Number']");
		return Frequentflyernumber;
	}

	private List<MobileElement> EnterFrequentflyernumber;
	public List<MobileElement> EnterFrequentflyernumber()
	{
		EnterFrequentflyernumber= driver.findElementsByXPath("//android.widget.EditText[@index='2']");
		return EnterFrequentflyernumber;
	}

	private MobileElement saveflyernumber;
	public MobileElement saveflyernumber()
	{
		saveflyernumber= driver.findElementByXPath("//android.widget.Button[@content-desc='Save Programme']");
		return saveflyernumber;
	}


	private List<MobileElement> binicon;
	public List<MobileElement> binicon()
	{
		binicon= driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		return binicon;
	}

	private MobileElement Addpassanger;
	public MobileElement Addpassanger()
	{
		Addpassanger= driver.findElementByXPath("//android.widget.ImageView[@content-desc='Add Passengers']");
		return Addpassanger;
	}

	private List<MobileElement> Deletepopupverify;
	public List<MobileElement> Deletepopupverify()
	{
		Deletepopupverify= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='AlertAre you sure, you want to delete?']");
		return Deletepopupverify;
	}

	private MobileElement deletepopupNOTNOW;
	public MobileElement deletepopupNOTNOW()
	{
		deletepopupNOTNOW= driver.findElementByXPath("//android.widget.Button[@index='0']");
		return deletepopupNOTNOW;
	}

	private MobileElement deletepopupDELETE;
	public MobileElement deletepopupDELETE()
	{
		deletepopupDELETE= driver.findElementByXPath("//android.widget.Button[@content-desc='Delete']");
		return deletepopupDELETE;
	}

	private MobileElement ClickCONTINUEbutton;
	public MobileElement ClickCONTINUEbutton()
	{
		ClickCONTINUEbutton= driver.findElementByXPath("//android.widget.Button[@content-desc='CONTINUE']");
		return ClickCONTINUEbutton;
	}

	private List<MobileElement> edittraveller;
	public List<MobileElement> edittraveller()
	{
		edittraveller= driver.findElementsByXPath("//android.view.View[@index='0']");
		return edittraveller;
	}

	// Actions

	public void clickedittraveller() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, edittraveller().get(7).isEnabled(),"edit traveller button is missing");
		edittraveller().get(7).click();
		

	}

	public void clickCONTINUEbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, ClickCONTINUEbutton().isEnabled(),"Continue button is missing");
		ClickCONTINUEbutton().click();

	}

	public void clicknotnow() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, deletepopupNOTNOW().isEnabled(),"Not now button is missing");
		deletepopupNOTNOW().click();

	}

	public void clickdelete() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, deletepopupDELETE().isEnabled(),"delete button is missing");
		deletepopupDELETE().click();

	}


	public void clickAddpassanger() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, Addpassanger().isEnabled(),"Add passanger button is missing");
		Addpassanger().click();

	}	

	public void clickbinicon() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, binicon().get(0).isEnabled(),"bin icon button is missing");
		binicon().get(0).click();

	}

	public void clicksavebutton()
	{
		Assert.assertEquals(true, saveflyernumber().isEnabled(),"Save button is missing");
		saveflyernumber().click();
	}

	public void enterflyernumber() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Frequentflyernumber().isEnabled(),"flyer number field is missing");
		Frequentflyernumber().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, EnterFrequentflyernumber().get(0).isEnabled(),"Flyer number field is missing");
		EnterFrequentflyernumber().get(0).setValue("FF123");

	}

	public void enterflyernumber1() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Frequentflyernumber().isEnabled(),"Flyer number field is missing");
		Frequentflyernumber().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, EnterFrequentflyernumber().get(0).isEnabled(),"Flyer number field is missing");
		EnterFrequentflyernumber().get(0).setValue("FF12345");

	}

	public void clickfrequentflyer() throws InterruptedException
	{
		Assert.assertEquals(true, Frequentflyerlink().isEnabled(),"Frequent flyer button is missing");
		Frequentflyerlink().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, Frequentflyerlist().get(0).isEnabled(),"Frequent flyer field is missing");
		Frequentflyerlist().get(0).setValue("Kenya Airways");
		Thread.sleep(2000);
		MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='Kenya Airways(KQ)']");
		element.click();

	}

	public void Enterpassportissuecountry() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, MyTravellerpassportissuecountry().isEnabled(),"passport issue country button is missing");
		MyTravellerpassportissuecountry().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTravellerSearchcountry().get(0).isEnabled(),"passport issue country field is missing");
		MyTravellerSearchcountry().get(0).setValue("South Africa");
		Thread.sleep(2000);
		MobileElement element = driver.findElementByXPath("//android.widget.ImageView[@content-desc='South Africa']");
		element.click();
	}

	public void Enterexpirationdate() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, MyTravellerexpirationdate().isEnabled(),"passport expiry button is missing");
		MyTravellerexpirationdate().click();
		Assert.assertEquals(true, MyTravellerDOBDONE().isEnabled());
		MyTravellerDOBDONE().click();
	}

	public void Enterpassportnumber() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTravellerpassportnumber().isEnabled(),"passport number button is missing");
		MyTravellerpassportnumber().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTravellerpassportnumber1().get(0).isEnabled(),"passport number field is missing");
		MyTravellerpassportnumber1().get(0).setValue("123456789");

	}

	public void Enterpassportnumber1() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTravellerpassportnumber().isEnabled());
		MyTravellerpassportnumber().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTravellerpassportnumber1().get(0).isEnabled());
		MyTravellerpassportnumber1().get(0).setValue("12345678900");

	}

	public void clickontravelDOB() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, MyTravellerDOB().isEnabled(),"Traveller DOB button is missing");
		MyTravellerDOB().click();
		Thread.sleep(2000);
		//		MyTravellerDOBdate().setValue("01");
		//		Thread.sleep(2000);
		//		MyTravellerDOBmonth().setValue("Jan");
		//		Thread.sleep(2000);
		//		MyTravellerDOByear().setValue("1950");
		Assert.assertEquals(true, MyTravellerDOBDONE().isEnabled(),"Traveller DOB field is missing");
		MyTravellerDOBDONE().click();

	}

	public void clickonTravelMiddlename() throws InterruptedException
	{
		Assert.assertEquals(true, MyTravellerMiddlename().isEnabled(),"Traveller middle name field is missing");
		MyTravellerMiddlename().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, EnterMyTravellerMiddlename().get(0).isEnabled(),"Traveller middle name field is missing");
		EnterMyTravellerMiddlename().get(0).sendKeys("test");
	}


	public void clickonTravelMiddlename1() throws InterruptedException
	{
		Assert.assertEquals(true, MyTravellerMiddlename().isEnabled(),"Traveller middle name field is missing");
		MyTravellerMiddlename().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, EnterMyTravellerMiddlename().get(0).isEnabled(),"Traveller middle name field is missing");
		EnterMyTravellerMiddlename().get(0).sendKeys("test");
	}

	public void clickonMyTravelNationality() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTravellerNationality().isEnabled(),"MyTraveller nationality field is missing");
		MyTravellerNationality().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, MyTravellerSearchcountry().get(0).isEnabled(),"My traveller search country field is missing");
		MyTravellerSearchcountry().get(0).setValue("South Africa");
		Thread.sleep(2000);
		MobileElement element = driver.findElementByXPath("//android.widget.ImageView[@content-desc='South Africa']");
		element.click();


	}

	public void clickonMyTravellers() throws InterruptedException 
	{
		Assert.assertEquals(true, MyTravellerButton().get(0).isEnabled(),"Mytraveller button is missing");
		MyTravellerButton().get(0).click();
		Thread.sleep(3000);

	}



	public void clickonMyTravellersMALE() throws InterruptedException 
	{
		Thread.sleep(5000);
		Assert.assertEquals(true, MyTravellerMale().get(0).isEnabled(),"Male gender button is missing");
		MyTravellerMale().get(0).click();
		Thread.sleep(3000);

	}

	public void clickonMyTravellersFEMALE() throws InterruptedException 
	{
		Thread.sleep(5000);
		Assert.assertEquals(true, MyTravellerFeMale().get(0).isEnabled(),"Female gender button is missing");
		MyTravellerFeMale().get(0).click();
		Thread.sleep(3000);

	}

	public void EnterMyTravellersFirstname() throws InterruptedException 
	{

		Assert.assertEquals(true, MyTravellerFirstname().isEnabled(),"Traveller First name field is missing");
		MyTravellerFirstname().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, EnterMyTravellerFirstname().get(0).isEnabled(),"Traveller First name field is missing");
		EnterMyTravellerFirstname().get(0).sendKeys("Hello");
		Thread.sleep(3000);

	}



	public void EnterMyTravellersFirstname1() throws InterruptedException 
	{
		Assert.assertEquals(true, MyTravellerFirstname().isEnabled(),"Traveller First name field is missing");
		MyTravellerFirstname().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, EnterMyTravellerFirstname1().get(0).isEnabled(),"Traveller First name field is missing");
		EnterMyTravellerFirstname1().get(0).sendKeys("Hello1");
		Thread.sleep(3000);

	}

	public void EnterMyTravellersLastnamefield() throws InterruptedException 
	{
		Assert.assertEquals(true, MyTravellerLastname().isEnabled(),"Traveller Last name field is missing");
		MyTravellerLastname().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, EnterMyTravellerLastname().get(0).isEnabled(),"Traveller Last name field is missing");
		EnterMyTravellerLastname().get(0).setValue("Tester");
		//sendKeys("Tester");
		Thread.sleep(3000);

	}

	public void EnterMyTravellersLastnamefield1() throws InterruptedException 
	{
		Assert.assertEquals(true, MyTravellerLastname().isEnabled(),"Traveller Last name field is missing");
		MyTravellerLastname().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, EnterMyTravellerLastname().get(0).isEnabled(),"Traveller Last name field is missing");
		EnterMyTravellerLastname().get(0).setValue("Tester1");
		//sendKeys("Tester");
		Thread.sleep(3000);

	}

	public String Verifytravelbutton(){

		Assert.assertEquals(true, MyTravellerButtonverify().get(0).isDisplayed(),"My Traveller buttoin is missing");
		return result=VerifyElement(MyTravellerButtonverify());
	}



	public String VerifySavedpassengerheading() throws InterruptedException{

		Thread.sleep(3000);
		Assert.assertEquals(true, SavedPassengerverify().get(0).isDisplayed(),"Saved passenger heading is missing");
		return result=VerifyElement(SavedPassengerverify());
	}

	public String verifyDeletepop() throws InterruptedException{
		Thread.sleep(3000);
		Assert.assertEquals(true, Deletepopupverify().get(0).isDisplayed());
		return result=VerifyElement(Deletepopupverify());
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
			Assert.assertTrue(false);
		}
		return result;
	}

}

