package mobilePOM;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TravelStart_Mobile_MyCards {



	public AppiumDriver<MobileElement> driver;
	public String result;

	//Constructor

	public TravelStart_Mobile_MyCards(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}

	private List<MobileElement> MyCardsButton;
	public List<MobileElement> MyCardsButton()
	{
		MyCardsButton= driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
		return MyCardsButton;
	}

	private List<MobileElement> MyCardsButtonverify;
	public List<MobileElement> MyCardsButtonverify()
	{
		MyCardsButtonverify= driver.findElementsByXPath("//android.widget.ImageView[@content-desc='My Cards']");
		return MyCardsButtonverify;
	}

	private List<MobileElement> CardNumber;
	public List<MobileElement> CardNumber()
	{
		CardNumber= driver.findElementsByXPath("//android.widget.EditText[@text='1234 4567 8910 1112']");
		return CardNumber;
	}

	private List<MobileElement> binicon;
	public List<MobileElement> binicon()
	{
		binicon= driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		return binicon;
	}


	private List<MobileElement> NameonCard;
	public List<MobileElement> NameonCard()
	{
		NameonCard= driver.findElementsByXPath("//android.widget.EditText[@text='Name On Card']");
		return NameonCard;
	}

	private List<MobileElement> CardmonthYear;
	public List<MobileElement> CardmonthYear()
	{
		CardmonthYear= driver.findElementsByXPath("//android.view.View[@text='MM/YY']");
		return CardmonthYear;
	}

	private MobileElement Cardyear;
	public MobileElement Cardyear()
	{
		Cardyear= driver.findElementByXPath("//android.widget.SeekBar[@index='5']");
		return Cardyear;
	}

	private List<MobileElement> CVV;
	public List<MobileElement> CVV()
	{
		CVV= driver.findElementsByXPath("//android.widget.EditText[@text='cvv']");
		return CVV;
	}

	private MobileElement Donebutton;
	public MobileElement Donebutton()
	{
		Donebutton= driver.findElementByXPath("//android.widget.Button[@content-desc='Done']");
		return Donebutton;
	}

	private List<MobileElement> Savebutton;
	public List<MobileElement> Savebutton()
	{
		Savebutton= driver.findElementsByXPath("//android.view.View[@content-desc='Save']");
		return Savebutton;
	}

	private MobileElement invalidcardnumber;
	public MobileElement invalidcardnumber()
	{
		invalidcardnumber= driver.findElementByXPath("//android.view.View[@content-desc='Number is invalid']");
		return invalidcardnumber;
	}

	private MobileElement cardexpired;
	public MobileElement cardexpired()
	{
		cardexpired= driver.findElementByXPath("//android.view.View[@content-desc='Card has expired']");
		return cardexpired;
	}

	private List<MobileElement> savedcardwidget;
	public List<MobileElement> savedcardwidget()
	{
		savedcardwidget= driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		return savedcardwidget;
	}


	// ACTIONS

	public void clickSavebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Savebutton().get(0).isEnabled(),"Save button is missing");
		Savebutton().get(0).click();

	}

	public void clickDonebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Donebutton().isEnabled(),"Done button is missing");
		Donebutton().click();

	}

	public void EnterCVV() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, CVV().get(0).isEnabled(),"CVV fieldbox is missing");
		CVV().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, CVV().get(0).isEnabled(),"CVV fieldbox is missing");
		CVV().get(0).setValue("123");
	}

	public void clickonmonthYear() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, CardmonthYear().get(0).isEnabled());
		CardmonthYear().get(0).click();
		Thread.sleep(2000);



		Dimension dimension = driver.manage().window().getSize();

		int start_x = (int) (dimension.width * 0.25);
		int start_y = (int) (dimension.height * 0.86);

		int end_x = (int) (dimension.width * 0.26);
		int end_y = (int) (dimension.height * 0.912);


		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		
		Cardyear().click();

	}

	public void EnternameonCard() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, NameonCard().get(0).isEnabled(),"Card name fieldbox is missing");
		NameonCard().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, NameonCard().get(0).isEnabled(),"card name fieldbox is missing");
		NameonCard().get(0).setValue("Tester");
	}

	public void EnterCardnumber() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, CardNumber().get(0).isEnabled(),"card number fieldbox is missing");
		CardNumber().get(0).click();
		Thread.sleep(2000);
		Assert.assertEquals(true, CardNumber().get(0).isEnabled(),"card number fieldbox is missing");
		CardNumber().get(0).setValue("4111111111111111");
	}

	public void clickonMyCards() throws InterruptedException 
	{
		Assert.assertEquals(true, MyCardsButton().get(0).isEnabled(),"Mycards button is missing");
		MyCardsButton().get(0).click();
		Thread.sleep(3000);
	}


	public void clickbinicon() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, binicon().get(1).isEnabled(),"bin icon is missing");
		binicon().get(1).click();

	}

	public String VerifyMYCARDSbutton(){

		Assert.assertEquals(true, MyCardsButtonverify().get(0).isDisplayed(),"Mycard button is missing");
		return result=VerifyElement(MyCardsButtonverify());
	}

	public String VerifySavebutton(){

		Assert.assertEquals(true, Savebutton().get(0).isDisplayed(),"Save button is missing");
		return result=VerifyElement(Savebutton());
	}

	public void verifyinvalidnumbermessage(String welcomeText) throws InterruptedException
	{

		Thread.sleep(4000);
		String note=invalidcardnumber().getText();
		System.out.println(note);
		//	AppAssertions compare=new AppAssertions(driver);
		//	compare.AssertText(note, welcomeText);
	}

	public void verifycardexpiry(String welcomeText) throws InterruptedException
	{

		Thread.sleep(4000);
		String note=cardexpired().getText();
		System.out.println(note);
		//	Assert.assertEquals(welcomeText, note);
	}

	public String verifysavedcardwidget(){

		Assert.assertEquals(true, savedcardwidget().get(0).isDisplayed(),"Saved card widget is missing");
		return result=VerifyElement(savedcardwidget());
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
