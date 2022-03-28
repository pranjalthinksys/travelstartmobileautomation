package mobilePOM;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TravelStart_Mobile_CovidBanner {


	public AppiumDriver<MobileElement> driver;
	public String result;

	//Constructor

	public TravelStart_Mobile_CovidBanner(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}

	private List<MobileElement> covidbannerLearnmore;
	public List<MobileElement> covidbannerLearnmore()
	{
		covidbannerLearnmore= driver.findElementsByXPath("//android.widget.Button[@content-desc='Learn more']");
		return covidbannerLearnmore;
	}

	private  MobileElement DismissButton;
	public  MobileElement DismissButton()
	{
		DismissButton=driver.findElementByXPath("//android.widget.Button[@text='Dismiss']") ;
		return DismissButton;
	}

	private  MobileElement Hamburgerbutton;
	public  MobileElement Hamburgerbutton()
	{
		Hamburgerbutton=driver.findElementByXPath("//android.view.View[@resource-id='hamburger-link']") ;
		return Hamburgerbutton;
	}

	private  MobileElement countryselection;
	public  MobileElement countryselection()
	{
		countryselection=driver.findElementByXPath("//android.widget.ImageView[@index='4']") ;
		return countryselection;
	}


	private List<MobileElement> countryradioBHD;
	public List<MobileElement> countryradioBHD()
	{
		countryradioBHD= driver.findElementsByXPath("//android.widget.RadioButton[@index='0']");
		return countryradioBHD;
	}


	private List<MobileElement> crossicon;
	public List<MobileElement> crossicon()
	{
		crossicon= driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return crossicon;
	}

	// Actions

	public void clickcrossicon()
	{
		crossicon().get(1).click();
	}


	public void selectradiobuttonBHD()
	{
		Assert.assertEquals(true, countryradioBHD().get(0).isEnabled(),"radio button missing");
		countryradioBHD().get(0).click();

	}

	public void selectradiobuttonBost()
	{
		Assert.assertEquals(true, countryradioBHD().get(1).isEnabled(),"radio button missing");
		countryradioBHD().get(1).click();

	}

	public void selectradiobuttonEgypt()
	{
		Assert.assertEquals(true, countryradioBHD().get(2).isEnabled(),"radio button missing");
		countryradioBHD().get(2).click();

	}

	public void selectradiobuttonkenya()
	{
		Assert.assertEquals(true, countryradioBHD().get(3).isEnabled(),"radio button missing");
		countryradioBHD().get(3).click();

	}

	public void selectradiobuttonkuwait()
	{
		Assert.assertEquals(true, countryradioBHD().get(4).isEnabled(),"radio button missing");
		countryradioBHD().get(4).click();

	}

	public void selectradiobuttonMorocco()
	{
		Assert.assertEquals(true, countryradioBHD().get(5).isEnabled(),"radio button missing");
		countryradioBHD().get(5).click();

	}

	public void selectradiobuttonNamibia()
	{
		Assert.assertEquals(true, countryradioBHD().get(6).isEnabled(),"radio button missing");
		countryradioBHD().get(6).click();

	}

	public void selectradiobuttonNigeria()
	{
		Assert.assertEquals(true, countryradioBHD().get(7).isEnabled(),"radio button missing");
		countryradioBHD().get(7).click();

	}

	public void selectradiobuttonOman()
	{
		Assert.assertEquals(true, countryradioBHD().get(8).isEnabled(),"radio button missing");
		countryradioBHD().get(8).click();

	}

	public void selectradiobuttonQatar()
	{
		Assert.assertEquals(true, countryradioBHD().get(9).isEnabled(),"radio button missing");
		countryradioBHD().get(9).click();

	}

	public void selectradiobuttonArabia()
	{
		Assert.assertEquals(true, countryradioBHD().get(10).isEnabled(),"radio button missing");
		countryradioBHD().get(10).click();

	}


	public void selectradiobuttonTanzania()
	{
		Assert.assertEquals(true, countryradioBHD().get(11).isEnabled(),"radio button missing");
		countryradioBHD().get(11).click();

	}

	public void selectradiobuttonTurkey()
	{
		Assert.assertEquals(true, countryradioBHD().get(12).isEnabled(),"radio button missing");
		countryradioBHD().get(12).click();

	}

	public void selectradiobuttonUAE()
	{
		Assert.assertEquals(true, countryradioBHD().get(13).isEnabled(),"radio button missing");
		countryradioBHD().get(13).click();

	}

	public void selectradiobuttonSouthAfrica()
	{
		Assert.assertEquals(true, countryradioBHD().get(14).isEnabled(),"radio button missing");
		countryradioBHD().get(14).click();

	}

	public void selectradiobuttonZimbabwe()
	{
		Assert.assertEquals(true, countryradioBHD().get(15).isEnabled(),"radio button missing");
		countryradioBHD().get(15).click();

	}

	public void selectradiobuttonGlobal()
	{
		Assert.assertEquals(true, countryradioBHD().get(16).isEnabled(),"radio button missing");
		countryradioBHD().get(16).click();

	}

	public void selectcountry()
	{
		Assert.assertEquals(true, countryselection().isEnabled(),"covidbannerLearnmore button missing");
		countryselection().click();
	}

	public void ClickcovidbannerLearnmore()
	{
		Assert.assertEquals(true, covidbannerLearnmore().get(0).isEnabled(),"covidbannerLearnmore button missing");
		covidbannerLearnmore().get(0).click();
	}


	public void clickdismiss()
	{
		Assert.assertEquals(true, DismissButton().isEnabled(),"covidbannerLearnmore button missing");
		DismissButton().click();
	}

	public void clickhamburgerbutton()
	{
		Assert.assertEquals(true, Hamburgerbutton().isEnabled(),"Hamburgerbutton button missing");
		Hamburgerbutton().click();
	}


}
