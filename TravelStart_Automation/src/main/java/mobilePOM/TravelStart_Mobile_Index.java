package mobilePOM;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;


public class TravelStart_Mobile_Index  {

	WebDriver driver;
	public String result;

	//constructor
	public TravelStart_Mobile_Index(WebDriver driver)
	{
		this.driver=driver;
	}


	private  List<io.appium.java_client.MobileElement> ClosePopUp;
	public  List<MobileElement> ClosePopUp()
	{
		ClosePopUp=driver.findElements(By.xpath("//android.widget.TextView[@index='0']")) ;
		return ClosePopUp;
	}

	private List<MobileElement> SkipButton;
	public List<MobileElement> SkipButton()
	{
		SkipButton=driver.findElements(By.xpath("//android.view.View[@content-desc='Skip']"));
		return SkipButton;
	}

	private List<MobileElement> Logo;
	public List<MobileElement> Logo()
	{
		Logo=driver.findElements(By.xpath("//android.view.View[@content-desc='flapp']"));
		return Logo;
	}

	private List<MobileElement> LoginButton;
	public List<MobileElement> LoginButton()
	{
		LoginButton=driver.findElements(By.xpath("//android.widget.Button[@content-desc='Login / Signup']")) ;
		return LoginButton;
	}

	private List<MobileElement> FacebookButton;
	public List<MobileElement> FacebookButton()
	{
		FacebookButton=driver.findElements(By.xpath("//android.widget.ImageView[@content-desc='Facebook']")) ;
		return FacebookButton;
	}

	private List<MobileElement> GoogleButton;
	public List<MobileElement> GoogleButton()
	{
		GoogleButton=driver.findElements(By.xpath("//android.widget.ImageView[@content-desc='Google']")) ;
		return GoogleButton;
	}

	private List<MobileElement> TermsLink;
	public List<MobileElement> TermsLink()
	{
		TermsLink=driver.findElements(By.xpath("//android.widget.Button[@content-desc='Terms and Conditions']")) ;
		return TermsLink;
	}

	private List<MobileElement> PrivacyLink;
	public List<MobileElement> PrivacyLink()
	{
		PrivacyLink=driver.findElements(By.xpath("//android.widget.Button[@content-desc='Privacy Statement']")) ;
		return PrivacyLink;
	}

	private  MobileElement denyacces;
	public  MobileElement denyacces()
	{
		denyacces=driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")) ;
		return denyacces;
	}

	private  MobileElement SkipNote;
	public  MobileElement SkipNote()
	{
		SkipNote=driver.findElement(By.xpath("//android.view.View[@index='0']")) ;
		return SkipNote;
	}


	private  MobileElement BackButton;
	public  MobileElement BackButton()
	{
		BackButton=driver.findElement(By.xpath("//android.widget.Button[@index='0']")) ;
		return BackButton;
	}

	private  MobileElement Header;
	public  MobileElement Header()
	{
		Header=driver.findElement(By.xpath("//android.widget.TextView[@index='0']")) ;
		return Header;
	}

	private  MobileElement DismissButton;
	public  MobileElement DismissButton()
	{
		DismissButton=driver.findElement(By.xpath("//android.widget.Button[@text='Dismiss']")) ;
		return DismissButton;
	}

	private List<MobileElement> GoogleElement;
	public List<MobileElement> GoogleElement()
	{
		GoogleElement=driver.findElements(By.xpath("//android.widget.FrameLayout[@resource-id='com.google.android.gms:id/account_particle_disc']"));
		return GoogleElement;
	}

	private List<MobileElement> Createmyaccount;
	public List<MobileElement> Createmyaccount()
	{
		Createmyaccount=driver.findElements(By.xpath("//android.widget.Button[@content-desc='Create My Account']"));
		return Createmyaccount;
	}

	private List<MobileElement> Forgotyourpasswordlink;
	public List<MobileElement> Forgotyourpasswordlink()
	{
		Forgotyourpasswordlink= driver.findElement(By.xpath("//android.widget.Button[@content-desc='Forgot your password?']"));
		return Forgotyourpasswordlink;
	}

	private List<MobileElement> Profilebutton;
	public List<MobileElement> Profilebutton()
	{
		Profilebutton=driver.findElements(By.xpath("//android.widget.ImageView[@content-desc='Profile']"));
		return Profilebutton;
	}


	private List<MobileElement> Signoutbutton;
	public List<MobileElement> Signoutbutton()
	{
		Signoutbutton=driver.findElements(By.xpath("//android.widget.ImageView[@content-desc='Sign Out']"));
		return Signoutbutton;
	}

	private List<MobileElement> FBcancelbutton;
	public List<MobileElement> FBcancelbutton()
	{
		FBcancelbutton=driver.findElements(By.xpath("//android.widget.Button[@text='Cancel']"));
		return FBcancelbutton;
	}

	private List<MobileElement> Hamburgerbutton;
	public List<MobileElement> Hamburgerbutton()

	{
		Hamburgerbutton=driver.findElements(By.xpath("//android.widget.Button[@index='0']"));
		return Hamburgerbutton;
	}


	private List<MobileElement> Supportbutton;
	public List<MobileElement> Supportbutton()
	{
		Supportbutton=driver.findElements(By.xpath("//android.view.View[@index='4']"));
		return Supportbutton;
	}

	private List<MobileElement> Mytripsbutton;
	public List<MobileElement> Mytripsbutton()
	{
		Mytripsbutton=driver.findElements(By.xpath("//android.widget.ImageView[@content-desc='My Trips']"));
		return Mytripsbutton;
	}


	private List<MobileElement> Signupbutton;
	public List<MobileElement> Signupbutton()
	{
		Signupbutton=driver.findElements(By.xpath("//android.view.View[@index='1']"));
		return Signupbutton;
	}


	private MobileElement FirstName;
	public MobileElement FirstName()
	{
		FirstName=driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		return FirstName;
	}

	private List<MobileElement> EnterFirstNametext;
	public List<MobileElement> EnterFirstNametext()
	{
		EnterFirstNametext=driver.findElements(By.xpath("//android.widget.EditText[@text='First Name']"));
		return EnterFirstNametext;
	}

	private List<MobileElement> SurName;
	public List<MobileElement> SurName()
	{
		SurName=driver.findElements(By.xpath("//android.widget.EditText[@text='Surname']"));
		return SurName;
	}


	private List<MobileElement> Email;
	public List<MobileElement> Email()
	{
		Email=driver.findElements(By.xpath("//android.widget.EditText[@text='Email']"));
		return Email;
	}

	private List<MobileElement> Password;
	public List<MobileElement> Password()
	{
		Password=driver.findElements(By.xpath("//android.widget.EditText[@text='Password']"));
		return Password;
	}

	private List<MobileElement> SignupbuttonButton;
	public List<MobileElement> SignupbuttonButton()
	{
		SignupbuttonButton=driver.findElements(By.xpath("//android.widget.Button[@content-desc='Signup']"));
		return SignupbuttonButton;
	}

	private MobileElement Passwordmissingerror;
	public MobileElement Passwordmissingerror()
	{
		Passwordmissingerror=driver.findElement(By.xpath("//android.view.View[@content-desc='Password Missing']"));
		return Passwordmissingerror;
	}

	private MobileElement Emailmissingerror;
	public MobileElement Emailmissingerror()
	{
		Emailmissingerror=driver.findElement(By.xpath("//android.view.View[@content-desc='Please enter valid Email']"));
		return Emailmissingerror;
	}

	private List<MobileElement> ShowPassword;
	public List<MobileElement> ShowPassword()
	{
		ShowPassword=driver.findElements(By.xpath("//android.widget.Button[@index='0']"));
		return ShowPassword;
	}

	//Actions

	public void ClickShowPassword() 
	{

		ShowPassword().get(1).click();
	}	

	public void EnterFirstName() 
	{

		FirstName().click();
		EnterFirstNametext.get(1).sendKeys("Pranjal");
	}



	public void EnterSurname() 
	{

		SurName().get(0).sendKeys("Gupta");
	}

	public void EnterEmail() 
	{

		Email().get(0).sendKeys("Pranjaltesttravel@mailinator.com");
	}

	public void EnterPassword()
	{

		Password().get(0).sendKeys("Test@123");
	}

	public void clickSignupbuttonButton()
	{

		SignupbuttonButton().get(0).click();
	}


	public void clickSignupbutton() 
	{
		Signupbutton().get(1).click();

	}


	public void clickMyTripsbutton()
	{
		Mytripsbutton().get(0).click();
	}

	public void clicksupportbutton()
	{
		Supportbutton().get(0).click();
	}

	public void clickhamburgerbutton()
	{
		Hamburgerbutton().get(0).click();
	}	


	public void clickFBcancelbutton()
	{
		FBcancelbutton().get(0).click();
	}


	public void clicksignoutbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println(Signoutbutton().size());

		System.out.println(Signoutbutton().get(0).getText());
		Signoutbutton().get(0).click();
	}

	public void clickProfilebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println(Profilebutton().size());

		System.out.println(Profilebutton().get(0).getText());
		Profilebutton().get(0).click();
	} 

	public void clickcreateaccountbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println(Createmyaccount().size());

		System.out.println(Createmyaccount().get(0).getText());
		Createmyaccount().get(0).click();
	}


	public void selectGoogleaccount() throws InterruptedException
	{
		Thread.sleep(3000);
		GoogleElement().get(0).click();
	}

	public void clickonGooglebutton() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(GoogleButton().size());
		GoogleButton().get(0).click();
	}


	public void clickonFacebookbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(FacebookButton().size());
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

	public void clickOnskip() throws InterruptedException{

		Thread.sleep(2000);
		System.out.println(SkipButton().size());

		System.out.println(SkipButton().get(0).getText());
		SkipButton().get(0).click();
	}

	public void clickOnLoginButton() throws InterruptedException{

		Thread.sleep(5000);
		System.out.println(LoginButton().size());
		LoginButton().get(0).click();
	}

	public String VerifySigInButton(){

		return result=VerifyElement(LoginButton());
	}


	public String VerifyskipButton(){

		return result=VerifyElement(SkipButton());
	}

	public String VerifyLOGO(){

		return result=VerifyElement(Logo());
	}
	public String VerifyFaceBookButton(){

		return result=VerifyElement(FacebookButton());
	}

	public String VerifyForgotpasswordlink(){

		return result=VerifyElement(Forgotyourpasswordlink());
	}


	public String VerifyGoogleButton(){

		return result=VerifyElement(GoogleButton());
	}

	public String VerifyTermsLink(){

		return result=VerifyElement(TermsLink());
	}

	public String VerifyPrivacyPolicy(){

		return result=VerifyElement(PrivacyLink());
	}

	public void ClickPrivacyPolicy(){

		PrivacyLink().get(0).click();
	}


	public void ClickTermsLink(){

		TermsLink().get(0).click();
	}

	public void verifySkipNote(String welcomeText) throws InterruptedException
	{

		denyacces().click();
		Thread.sleep(3000);
		String note=SkipNote().getText();
		System.out.println(note);	
	}


	public void verifypasswordmissingerror(String welcomeText) throws InterruptedException
	{
		Thread.sleep(2000);
		String note=Passwordmissingerror().getText();
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
		DismissButton().click();
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
		}

		return result;

	}

	public void ClickBackButton(){

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
		}
		return result;
	}

}
