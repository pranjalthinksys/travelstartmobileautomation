package mobilePOM;

import java.util.List;

import org.testng.Assert;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TravelStart_Mobile_Login {


	public AppiumDriver<MobileElement> driver;
	public String result;

	//constructor
	public TravelStart_Mobile_Login(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}


	private  List<MobileElement> LoginButton;
	public  List<MobileElement> LoginButton()
	{
		LoginButton=driver.findElementsByXPath("//android.widget.Button[@content-desc='Login']") ;
		return LoginButton;
	}

	private  MobileElement Email;
	public  MobileElement Email()
	{
		Email=driver.findElementByXPath("//android.widget.EditText[@text='Email address']") ;
		return Email;
	}

	private  MobileElement EmailTextBox;
	public  MobileElement EmailTextBox() 
	{
		EmailTextBox=driver.findElementByXPath("//android.widget.EditText[@index='0']") ;
		return EmailTextBox;
	}

	private  MobileElement Password;
	public   MobileElement Password()
	{
		Password=driver.findElementByXPath("//android.widget.EditText[@text='Password']") ;
		return Password;
	}

	private  MobileElement PasswordTextBox;
	public  MobileElement PasswordTextBox()
	{
		PasswordTextBox=driver.findElementByXPath("//android.widget.EditText[@index='2']") ;
		return PasswordTextBox;
	}

	private  MobileElement WelcomeNote;
	public  MobileElement WelcomeNote()
	{
		WelcomeNote=driver.findElementByXPath("//android.view.View[@index='0']") ;
		return WelcomeNote;
	}


	private  List<MobileElement> denyacces;
	public  List<MobileElement> denyacces()
	{
		denyacces=driver.findElementsById("com.android.permissioncontroller:id/permission_deny_button");

		return denyacces;
	}

	private List<MobileElement> Facebookemail;
	public List<MobileElement> Facebookemail()
	{
		Facebookemail=driver.findElementsByXPath("//android.widget.EditText[@resource-id='m_login_email']");
		return Facebookemail;
	}

	private List<MobileElement> Facebookpassword;
	public List<MobileElement> Facebookpassword()
	{
		Facebookpassword=driver.findElementsByXPath("//android.widget.EditText[@resource-id='m_login_password']");
		return Facebookpassword;
	}

	private List<MobileElement> Facebookloginbtn;
	public List<MobileElement> Facebookloginbtn()
	{
		Facebookloginbtn=driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return Facebookloginbtn;
	}

	private List<MobileElement> Facebookaccess;
	public List<MobileElement> Facebookaccess()
	{
		Facebookaccess=driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return Facebookaccess;
	}

	private MobileElement Incorrectpassword;
	public MobileElement Incorrectpassword()
	{
		Incorrectpassword=driver.findElementByXPath("//android.widget.EditText[@index='2']");
		return Incorrectpassword;
	}


	private MobileElement Incorrectpassworderror;
	public MobileElement Incorrectpassworderror()
	{
		Incorrectpassworderror=driver.findElementByXPath("//android.view.View[@index='4']");
		return Incorrectpassworderror;
	}

	private MobileElement Forgotpassword;
	public MobileElement Forgotpassword()
	{
		Forgotpassword=driver.findElementByXPath("//android.widget.Button[@content-desc='Forgot your password?']");
		return Forgotpassword;
	}

	private MobileElement Forgotpasswordalert;
	public MobileElement Forgotpasswordalert()
	{
		Forgotpasswordalert=driver.findElementByXPath("//android.view.View[@index='0']");
		return Forgotpasswordalert;
	}


	private List<MobileElement> Backarrow;
	public List<MobileElement> Backarrow()
	{
		Backarrow=driver.findElementsByXPath("//android.widget.Button[@index='0']");
		return Backarrow;
	}



	//Actions 


	public void clickbackarrow() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Backarrow().get(0).isDisplayed(), "Back arrow is missing");
		Backarrow().get(0).click();
	}

	public void verifyForgotpasswordalert(String message) throws InterruptedException
	{
		Thread.sleep(2000);
		String note=Forgotpasswordalert().getText();
		System.out.println(note);	
	}

	public void ClickForgotpassword()
	{
		Assert.assertEquals(true, Forgotpassword().isEnabled(),"Forgot password is missing");
		Forgotpassword().click();

	}

	public void verifyIncorrectpassworderror(String welcomeText) throws InterruptedException
	{
		Thread.sleep(2000);
		String note=Incorrectpassworderror().getText();
		System.out.println(note);	
	}

	public void EnterIncorrectPassword() throws InterruptedException
	{
		Assert.assertEquals(true, Password().isEnabled(),"password fieldbox is missing");
		Password().click();

		Thread.sleep(2000);
		Assert.assertEquals(true,Incorrectpassword().isEnabled(),"password fieldbox is missing");
		Incorrectpassword().sendKeys("testtest123@");
	}

	public void FBaccess()
	{
		Assert.assertEquals(true,Facebookaccess().get(0).isEnabled(),"Facebook access is missing");
		Facebookaccess().get(0).click();
	}

	public void FBloginbtn()
	{
		Assert.assertEquals(true, Facebookloginbtn().get(0).isEnabled(),"Facebook login is missing");
		Facebookloginbtn().get(0).click();
	}

	public void FBpasswordtext() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Facebookpassword().get(0).isEnabled(),"FB password fieldbox is missing");
		Facebookpassword().get(0).sendKeys("Jaishrikrishn1");	
	}


	public void FBemailtext() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Facebookemail().get(0).isEnabled(),"FB email fieldbox is missing");
		Facebookemail().get(0).sendKeys("pranjal.gupta2194.pg@gmail.com");

	}

	public String VerifyLoginButton()
	{
		Assert.assertEquals(true, LoginButton().get(0).isDisplayed(),"Login button is missing");
		return result=VerifyElement(LoginButton());
	}

	public void EnterEmail(String Email) throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(true, Email().isEnabled(),"Email fieldbox is missing");
		Email().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, EmailTextBox().isEnabled(),"Email fieldbox is missing");
		EmailTextBox().setValue(Email);
	}


	public void EnterPassword(String Password) throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(true, Password().isEnabled(),"password fieldbox is missing");
		Password().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, PasswordTextBox().isEnabled(),"password fieldbox is missing");
		PasswordTextBox().setValue(Password);
	}


	public void ClickLogin()
	{
		Assert.assertEquals(true, LoginButton().get(0).isEnabled(),"Login button is missing");
		LoginButton().get(0).click();
	}


	public void verifyWelcomeNote(String welcomeText) throws InterruptedException
	{
		Thread.sleep(4000);
		clickdenyaccess();
		Thread.sleep(4000);
		//		String note=WelcomeNote().getText();
		//	 Assert.assertEquals(note, welcomeText);
		//			AppAssertions compare=new AppAssertions(driver);
		//			compare.AssertText(note, welcomeText);
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