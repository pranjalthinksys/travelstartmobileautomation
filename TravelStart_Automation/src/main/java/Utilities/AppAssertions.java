package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AppAssertions 

{

	WebDriver driver;

	public AppAssertions(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void AssertText(String actual,String expected) 
	{
		Assert.assertEquals(actual.contains(expected),true);
	}

	public void jsClick(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
	}
}
