package mobilePOM;


import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class TravelStart_Mobile_Index  {

	SoftAssert assertion = new SoftAssert();

	public AppiumDriver<MobileElement> driver;
	public String result;

	//constructor
	public TravelStart_Mobile_Index(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}


	private List<MobileElement> dontallow;
	public List<MobileElement> dontallow()
	{
		dontallow= driver.findElementsByXPath("//android.widget.Button[@index='2']");
		return dontallow;
	}

	private  List<MobileElement> ClosePopUp;
	public  List<MobileElement> ClosePopUp()
	{
		ClosePopUp=driver.findElementsByXPath("//android.widget.TextView[@index='0']");

		return ClosePopUp;
	}

	private List<MobileElement> SkipButton;
	public List<MobileElement> SkipButton()
	{
		SkipButton=driver.findElementsByXPath("//android.view.View[@content-desc='Skip']");
		return SkipButton;
	}

	private List<MobileElement> Logo;
	public List<MobileElement> Logo()
	{
		Logo=driver.findElementsByXPath("//android.view.View[@content-desc='flapp']");
		return Logo;
	}

	private List<MobileElement> LoginButton;
	public List<MobileElement> LoginButton()
	{
		LoginButton=driver.findElementsByXPath("//android.widget.Button[@content-desc='Login / Signup']") ;
		return LoginButton;
	}

	private List<MobileElement> LoginButton1;
	public List<MobileElement> LoginButton1()
	{
		LoginButton1=driver.findElementsByXPath("//android.widget.Button[@content-desc='Login or Signup']") ;
		return LoginButton1;
	}

	private List<MobileElement> FacebookButton;
	public List<MobileElement> FacebookButton()
	{
		FacebookButton=driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Facebook']") ;
		return FacebookButton;
	}

	private List<MobileElement> GoogleButton;
	public List<MobileElement> GoogleButton()
	{
		GoogleButton=driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Google']") ;
		return GoogleButton;
	}

	private List<MobileElement> TermsLink;
	public List<MobileElement> TermsLink()
	{
		TermsLink=driver.findElementsByXPath("//android.widget.Button[@content-desc='Terms and Conditions']") ;
		return TermsLink;
	}

	private List<MobileElement> PrivacyLink;
	public List<MobileElement> PrivacyLink()
	{
		PrivacyLink=driver.findElementsByXPath("//android.widget.Button[@content-desc='Privacy Statement']") ;
		return PrivacyLink;
	}

	private  List<MobileElement> denyacces;
	public  List<MobileElement> denyacces()
	{
		denyacces=driver.findElementsById("com.android.permissioncontroller:id/permission_deny_button");

		return denyacces;
	}

	private  MobileElement SkipNote;
	public  MobileElement SkipNote()
	{
		SkipNote=driver.findElementByXPath("//android.view.View[@index='0']") ;
		return SkipNote;
	}


	private  MobileElement BackButton;
	public  MobileElement BackButton()
	{
		BackButton=driver.findElementByXPath("//android.widget.Button[@index='0']") ;
		return BackButton;
	}

	private  MobileElement Header;
	public  MobileElement Header()
	{
		Header=driver.findElementByXPath("//android.view.View[@index='1']") ;
		return Header;
	}

	private  MobileElement DismissButton;
	public  MobileElement DismissButton()
	{
		DismissButton=driver.findElementByXPath("//android.widget.Button[@text='Dismiss']") ;
		return DismissButton;
	}

	private List<MobileElement> GoogleElement;
	public List<MobileElement> GoogleElement()
	{
		GoogleElement=driver.findElementsByXPath("//android.widget.FrameLayout[@resource-id='com.google.android.gms:id/account_particle_disc']");
		return GoogleElement;
	}

	private List<MobileElement> Createmyaccount;
	public List<MobileElement> Createmyaccount()
	{
		Createmyaccount=driver.findElementsByXPath("//android.widget.Button[@content-desc='Create My Account']");
		return Createmyaccount;
	}

	private List<MobileElement> Forgotyourpasswordlink;
	public List<MobileElement> Forgotyourpasswordlink()
	{
		Forgotyourpasswordlink= driver.findElementsByXPath("//android.widget.Button[@content-desc='Forgot your password?']");
		return Forgotyourpasswordlink;
	}

	private List<MobileElement> Profilebutton;
	public List<MobileElement> Profilebutton()
	{
		Profilebutton=driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Profile']");
		return Profilebutton;
	}


	private List<MobileElement> Signoutbutton;
	public List<MobileElement> Signoutbutton()
	{
		Signoutbutton=driver.findElementsByXPath("//android.widget.ImageView[@content-desc='Sign Out']");
		return Signoutbutton;
	}

	private List<MobileElement> FBcancelbutton;
	public List<MobileElement> FBcancelbutton()
	{
		FBcancelbutton=driver.findElementsByXPath("//android.widget.Button[@text='Cancel']");
		return FBcancelbutton;
	}

	private List<MobileElement> Hamburgerbutton;
	public List<MobileElement> Hamburgerbutton()

	{
		Hamburgerbutton=driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return Hamburgerbutton;
	}


	private List<MobileElement> Supportbutton;
	public List<MobileElement> Supportbutton()
	{
		Supportbutton=driver.findElementsByXPath("//android.view.View[@index='4']");
		return Supportbutton;
	}

	private List<MobileElement> Mytripsbutton;
	public List<MobileElement> Mytripsbutton()
	{
		Mytripsbutton=driver.findElementsByXPath("//android.widget.ImageView[@content-desc='My Trips']");
		return Mytripsbutton;
	}


	private List<MobileElement> Signupbutton;
	public List<MobileElement> Signupbutton()
	{
		Signupbutton=driver.findElementsByXPath("//android.view.View[@index='1']");
		return Signupbutton;
	}


	private MobileElement FirstName;
	public MobileElement FirstName()
	{
		FirstName=driver.findElementByXPath("//android.widget.EditText[@index='0']");
		return FirstName;
	}

	private List<MobileElement> EnterFirstNametext;
	public List<MobileElement> EnterFirstNametext()
	{
		EnterFirstNametext=driver.findElementsByXPath("//android.widget.EditText[@index='0']");
		return EnterFirstNametext;
	}

	private MobileElement Surname;
	public MobileElement Surname()
	{
		Surname=driver.findElementByXPath("//android.widget.EditText[@index='1']");
		return Surname;
	}

	private List<MobileElement> EnterSurNametext;
	public List<MobileElement> EnterSurNametext()
	{
		EnterSurNametext=driver.findElementsByXPath("//android.widget.EditText[@index='1']");
		return EnterSurNametext;
	}


	private List<MobileElement> Emailtext;
	public List<MobileElement> Emailtext()
	{
		Emailtext=driver.findElementsByXPath("//android.widget.EditText[@index='2']");
		return Emailtext;
	}


	private MobileElement Email;
	public MobileElement Email()
	{
		Email=driver.findElementByXPath("//android.widget.EditText[@index='2']");
		return Email;
	}

	private List<MobileElement> Passwordtext;
	public List<MobileElement> Passwordtext()
	{
		Passwordtext=driver.findElementsByXPath("//android.widget.EditText[@index='4']");
		return Passwordtext;
	}

	private MobileElement Passwordclick;
	public MobileElement Passwordclick()
	{
		Passwordclick=driver.findElementByXPath("//android.widget.EditText[@index='4']");
		return Passwordclick;
	}

	private List<MobileElement> SignupbuttonButton;
	public List<MobileElement> SignupbuttonButton()
	{
		SignupbuttonButton=driver.findElementsByXPath("//android.widget.Button[@content-desc='Signup']");
		return SignupbuttonButton;
	}

	private MobileElement Passwordmissingerror;
	public MobileElement Passwordmissingerror()
	{
		Passwordmissingerror=driver.findElementByXPath("//android.view.View[@content-desc='Password Missing']");
		return Passwordmissingerror;
	}

	private MobileElement Emailmissingerror;
	public MobileElement Emailmissingerror()
	{
		Emailmissingerror=driver.findElementByXPath("//android.view.View[@content-desc='Please enter valid Email']");
		return Emailmissingerror;
	}

	private List<MobileElement> ShowPassword;
	public List<MobileElement> ShowPassword()
	{
		ShowPassword=driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return ShowPassword;
	}

	private List<MobileElement> Signupalert;
	public List<MobileElement> Signupalert()
	{
		Signupalert=driver.findElementsByXPath("//android.view.View[@index='0']");
		return Signupalert;
	}


	//Actions

	public void clickalertok()
	{
	
		Signupalert().get(4).click();

	}

	public void ClickShowPassword() 
	{
		Assert.assertEquals(true, ShowPassword().get(1).isEnabled());
		ShowPassword().get(1).click();
	}	

	public void EnterFirstName() throws InterruptedException 
	{

		FirstName().click();
		Assert.assertEquals(true, FirstName().isEnabled(),"First Name text field is missing");
		Thread.sleep(3000);
		EnterFirstNametext().get(0).sendKeys("Pranjallll");
		Assert.assertEquals(true, EnterFirstNametext().get(0).isEnabled(),"First Name text field is missing");
		Thread.sleep(2000);
	}



	public void EnterSurname() throws InterruptedException 
	{
		Surname().click();
		Assert.assertEquals(true, Surname().isEnabled(),"Sur Name text field is missing");
		Thread.sleep(2000);
		EnterSurNametext().get(0).sendKeys("Gupta");
		Assert.assertEquals(true, EnterSurNametext().get(0).isEnabled(),"Sur Name text field is missing");
		Thread.sleep(2000);
	}

	public void EnterEmail() throws InterruptedException 
	{

		Email().click();
		Assert.assertEquals(true, Email().isEnabled(),"Email text field is missing");
		Thread.sleep(2000);
		Emailtext().get(0).sendKeys("Pranjaltesttravel@mailinator.com");
		Assert.assertEquals(true, Emailtext().get(0).isEnabled(),"Email text field is missing");
		Thread.sleep(2000);
	}

	public void EnterPassword() throws InterruptedException
	{
		Passwordclick().click();
		Assert.assertEquals(true, Passwordclick().isEnabled(),"Password field is missing");
		Thread.sleep(2000);
		Passwordtext().get(0).sendKeys("Test@123");
		Assert.assertEquals(true, Passwordtext().get(0).isEnabled(),"Password field is missing");
		Thread.sleep(2000);
	}

	public void clickSignupbuttonButton() throws InterruptedException
	{

		Thread.sleep(3000);
		Assert.assertEquals(true, SignupbuttonButton().get(0).isEnabled(),"Signup button is missing");
		SignupbuttonButton().get(0).click();
	}


	public void clickSignupbutton() 
	{
		Assert.assertEquals(true, Signupbutton().get(1).isEnabled(),"Signup tab is missing");
		Signupbutton().get(1).click();

	}


	public void clickMyTripsbutton()
	{
		Assert.assertEquals(true, Mytripsbutton().get(0).isEnabled(),"MyTrip button is missing");
		Mytripsbutton().get(0).click();
	}

	public void clicksupportbutton()
	{
		Assert.assertEquals(true, Supportbutton().get(0).isEnabled(),"Support button is missing");
		Supportbutton().get(0).click();
	}

	public void clickhamburgerbutton()
	{
		Assert.assertEquals(true, Hamburgerbutton().get(0).isEnabled(),"Hamburger button is missing");
		Hamburgerbutton().get(0).click();
	}	


	public void clickFBcancelbutton()
	{
		Assert.assertEquals(true, FBcancelbutton().get(0).isEnabled(),"Facebook cancel button is missing");
		FBcancelbutton().get(0).click();
	}


	public void clicksignoutbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Signoutbutton().get(0).isEnabled(),"Signout button is missing");
		Signoutbutton().get(0).click();
	}

	public void clickProfilebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(Profilebutton().get(0).isDisplayed(), true, "Profile button is missing");
		//	Assert.assertEquals("Profile button is missing", true, Profilebutton().get(0).isDisplayed());
		Profilebutton().get(0).click();
	} 

	public void clickcreateaccountbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println(Createmyaccount().size());

		System.out.println(Createmyaccount().get(0).getText());
		Assert.assertEquals(true, Createmyaccount().get(0).isEnabled(),"Create account button is missing");
		Createmyaccount().get(0).click();
	}


	public void selectGoogleaccount() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, GoogleElement().get(0).isDisplayed(),"Google account selection is missing");
		GoogleElement().get(0).click();
	}

	public void clickonGooglebutton() throws InterruptedException
	{
		Thread.sleep(3000);

		System.out.println(GoogleButton().size());

		Assert.assertEquals(true, GoogleButton().get(0).isEnabled(),"Google button is missing");
		GoogleButton().get(0).click();
	}


	public void clickonFacebookbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(FacebookButton().size());
		Assert.assertEquals(true, FacebookButton().get(0).isEnabled(),"Facebook button is missing");
		FacebookButton().get(0).click();
	}


	public  void clickOnClosePopUp() throws InterruptedException{

		Thread.sleep(5000);
		if(ClosePopUp().size()>0)
		{
			ClosePopUp().get(0).click(); 
			System.out.println("clicked close popup");
		}
		else
		{
			System.out.println("No PopUp");	
		}

	}



	public  void clickondontallow() throws InterruptedException{

		Thread.sleep(5000);
		if(dontallow().size()>0)
		{
			dontallow().get(0).click(); 
			System.out.println("clicked location don't allow");
		}
		else
		{
			System.out.println("No PopUp");	
		}

	}


	public  void clickdenyaccess() throws InterruptedException{

		Thread.sleep(5000);
		if(denyacces().size()>0)
		{
			denyacces().get(0).click(); 
			System.out.println("clicked location don't allow");
		}
		else
		{
			System.out.println("No PopUp");	
		}

	}


	public void clickOnskip() throws InterruptedException{

		Thread.sleep(2000);
		System.out.println(SkipButton().get(0).getText());

		SkipButton().get(0).click();
	}

	public void clickOnLoginButton() throws InterruptedException{

		Thread.sleep(5000);

		Assert.assertEquals(true, LoginButton().get(0).isDisplayed(),"Login button is missing");
		LoginButton().get(0).click();
	}


	public void clickOnLoginButton1() throws InterruptedException{

		Thread.sleep(5000);

		Assert.assertEquals(true, LoginButton1().get(0).isDisplayed(),"Login button is missing");
		LoginButton1().get(0).click();
	}

	public String VerifySigInButton(){

		try
		{
			Assert.assertEquals(true, LoginButton().get(0).isDisplayed(),"Signin button is missing");
			return result=VerifyElement(LoginButton());
		}
		catch(AssertionError e)
		{
			return result;
		}

	}


	public String VerifyskipButton(){

		Assert.assertEquals(true, SkipButton().get(0).isDisplayed(),"Skip button is missing");
		return result=VerifyElement(SkipButton());
	}

	public String VerifyLOGO(){

		Assert.assertEquals(true, Logo().get(0).isDisplayed(),"Logo is missing");
		return result=VerifyElement(Logo());
	}
	public String VerifyFaceBookButton(){

		Assert.assertEquals(true, FacebookButton().get(0).isDisplayed(),"Facebook button is missing");
		return result=VerifyElement(FacebookButton());
	}

	public String VerifyForgotpasswordlink(){

		Assert.assertEquals(true, Forgotyourpasswordlink().get(0).isDisplayed(),"Forgot password link is missing");
		return result=VerifyElement(Forgotyourpasswordlink());
	}


	public String VerifyGoogleButton(){

		Assert.assertEquals(true, GoogleButton().get(0).isDisplayed(),"Google button is missing");
		return result=VerifyElement(GoogleButton());
	}

	public String VerifyTermsLink(){

		Assert.assertEquals(true, TermsLink().get(0).isDisplayed(),"Terms link is missing");
		return result=VerifyElement(TermsLink());
	}

	public String VerifyPrivacyPolicy(){

		Assert.assertEquals(true, PrivacyLink().get(0).isDisplayed(),"Privacy policy is missing");
		return result=VerifyElement(PrivacyLink());
	}

	public void ClickPrivacyPolicy(){
		Assert.assertEquals(true, PrivacyLink().get(0).isDisplayed(),"Privacy policy is missing");
		PrivacyLink().get(0).click();
	}


	public void ClickTermsLink(){

		Assert.assertEquals(true, TermsLink().get(0).isDisplayed(),"Terms link is missing");
		TermsLink().get(0).click();
	}

	public void verifySkipNote(String welcomeText) throws InterruptedException
	{

		Thread.sleep(2000);
		clickdenyaccess();
		Thread.sleep(10000);
		String note=SkipNote().getText();
		// Assert.assertEquals(note, welcomeText);


	}


	public void verifypasswordmissingerror(String welcomeText) throws InterruptedException
	{
		Thread.sleep(2000);
		String note=Passwordmissingerror().getText();
		System.out.println(note);	
		Assert.assertEquals(note, welcomeText);
		System.out.println(note);	
	}

	public void verifyemailmissingerror(String welcomeText) throws InterruptedException
	{
		Thread.sleep(2000);
		String note=Emailmissingerror().getText();
		System.out.println(note);	
	}




	public String verifyHeader(String HeaderText,int time) throws InterruptedException
	{
		Thread.sleep(time);
		System.out.println(time);
		System.out.println(DismissButton().getText());
		DismissButton().click();
		System.out.println("clicked dismiss");
		Thread.sleep(4000);
		String Actual=Header().getText();
		System.out.println(Actual);
		if(Actual.contains(HeaderText)) 
		{
			result="PASS";
		}
		else
		{
			result="FAIL";
			//	Assert.assertTrue(false , "missing" + Actual);
		}

		return result;

	}

	public void ClickBackButton(){

		Assert.assertEquals(true, BackButton().isDisplayed(),"Back button is missing");
		BackButton().click();

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
