package mobilePOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.MobileElement;

public class TravelStart_Mobile_Login {


	WebDriver driver;
	public String result;

	//constructor
	public TravelStart_Mobile_Login(WebDriver driver)
	{
		this.driver=driver;
	}


	private  List<MobileElement> LoginButton;
	public  List<MobileElement> LoginButton()
	{
		LoginButton=driver.findElements(By.xpath("//android.widget.Button[@content-desc='Login']")) ;
		return LoginButton;
	}

	private  MobileElement Email;
	public  MobileElement Email()
	{
		Email=driver.findElement(By.xpath("//android.widget.EditText[@text='Email address']")) ;
		return Email;
	}

	private  MobileElement EmailTextBox;
	public  MobileElement EmailTextBox() 
	{
		EmailTextBox=driver.findElement(By.xpath("//android.widget.EditText[@index='0']")) ;
		return EmailTextBox;
	}

	private  MobileElement Password;
	public   MobileElement Password()
	{
		Password=driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")) ;
		return Password;
	}

	private  MobileElement PasswordTextBox;
	public  MobileElement PasswordTextBox()
	{
		PasswordTextBox=driver.findElement(By.xpath("//android.widget.EditText[@index='2']")) ;
		return PasswordTextBox;
	}

	private  MobileElement WelcomeNote;
	public  MobileElement WelcomeNote()
	{
		WelcomeNote=driver.findElement(By.xpath("//android.view.View[@index='0']")) ;
		return WelcomeNote;
	}


	private  MobileElement denyacces;
	public  MobileElement denyacces()
	{
		denyacces=driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")) ;
		return denyacces;
	}

	private List<MobileElement> Facebookemail;
	public List<MobileElement> Facebookemail()
	{
		Facebookemail=driver.findElements(By.xpath("//android.widget.EditText[@resource-id='m_login_email']"));
		return Facebookemail;
	}

	private List<MobileElement> Facebookpassword;
	public List<MobileElement> Facebookpassword()
	{
		Facebookpassword=driver.findElements(By.xpath("//android.widget.EditText[@resource-id='m_login_password']"));
		return Facebookpassword;
	}

	private List<MobileElement> Facebookloginbtn;
	public List<MobileElement> Facebookloginbtn()
	{
		Facebookloginbtn=driver.findElements(By.xpath("//android.widget.Button[@index='0']"));
		return Facebookloginbtn;
	}

	private List<MobileElement> Facebookaccess;
	public List<MobileElement> Facebookaccess()
	{
		Facebookaccess=driver.findElements(By.xpath("//android.widget.Button[@index='0']"));
		return Facebookaccess;
	}
	
	private MobileElement Incorrectpassword;
	public MobileElement Incorrectpassword()
	{
		Incorrectpassword=driver.findElement(By.xpath("//android.widget.EditText[@index='2']"));
		return Incorrectpassword;
	}
		
	
	private MobileElement Incorrectpassworderror;
	public MobileElement Incorrectpassworderror()
	{
		Incorrectpassworderror=driver.findElement(By.xpath("//android.view.View[@index='4']"));
		return Incorrectpassworderror;
	}
	
	private MobileElement Forgotpassword;
	public MobileElement Forgotpassword()
	{
		Forgotpassword=driver.findElement(By.xpath("//android.widget.Button[@content-desc='Forgot your password?']"));
		return Forgotpassword;
	}
	
	private MobileElement Forgotpasswordalert;
	public MobileElement Forgotpasswordalert()
	{
		Forgotpasswordalert=driver.findElement(By.xpath("//android.view.View[@index='0']"));
		return Forgotpasswordalert;
	}
	
		
		

	//Actions 
	
	public void verifyForgotpasswordalert(String message) throws InterruptedException
	{
		Thread.sleep(2000);
		String note=Forgotpasswordalert().getText();
		System.out.println(note);	
	}
	
	public void ClickForgotpassword()
	{
		Forgotpassword().click();
		
	}
	
	public void verifyIncorrectpassworderror(String welcomeText) throws InterruptedException
	{
		Thread.sleep(2000);
		String note=Incorrectpassworderror().getText();
		System.out.println(note);	
	}
	
	public void EnterIncorrectPassword()
	{
		Password().click();
		Incorrectpassword().sendKeys("testtest123@");
	}

	public void FBaccess()
	{
		Facebookaccess().get(0).click();
	}

	public void FBloginbtn()
	{
		Facebookloginbtn().get(0).click();
	}

	public void FBpasswordtext() throws InterruptedException
	{
		Thread.sleep(2000);
		Facebookpassword().get(0).sendKeys("Jaishrikrishn1");	
	}


	public void FBemailtext() throws InterruptedException
	{
		Thread.sleep(2000);
		Facebookemail().get(0).sendKeys("pranjal.gupta2194.pg@gmail.com");

	}

	public String VerifyLoginButton()
	{
		return result=VerifyElement(LoginButton());
	}

	public void EnterEmail(String Email) throws InterruptedException
	{
		Thread.sleep(3000);
		Email().click();
		Thread.sleep(3000);
		EmailTextBox().setValue(Email);
	}


	public void EnterPassword(String Password) throws InterruptedException
	{
		Thread.sleep(2000);
		Password().click();
		Thread.sleep(3000);
		PasswordTextBox().setValue(Password);
	}


	public void ClickLogin()
	{
		LoginButton().get(0).click();
	}


	public void verifyWelcomeNote(String welcomeText) throws InterruptedException
	{
		Thread.sleep(4000);
		denyacces().click();
		Thread.sleep(4000);
		String note=WelcomeNote().getText();
		System.out.println(note);
		//	AppAssertions compare=new AppAssertions(driver);
		//	compare.AssertText(note, welcomeText);
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