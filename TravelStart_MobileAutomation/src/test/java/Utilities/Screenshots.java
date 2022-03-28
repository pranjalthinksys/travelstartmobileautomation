package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Base.Mobile_Base;

public class Screenshots extends Mobile_Base {

	public static String getScreenshot()
	{

	//	driver.hideKeyboard();
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	File source=ts.getScreenshotAs(OutputType.FILE);
	
	  SimpleDateFormat dateFormat = new SimpleDateFormat(
              "yyyy-MM-dd HH.mm.ss");
                   

	String path = "C:\\Users\\THINKS~1\\AppData\\Local\\Temp\\"+ dateFormat.format(new Date())+ ".png";
	
	File destination = new File(path);
	
	try
	{
	
	FileUtils.copyFile(source, destination);
//	 byte[] imagebytes=  IOUtils.toByteArray(new FileInputStream(path));
//	return Base64.getEncoder().encodeToString(imagebytes);
	System.out.println("Screenshot taken");
	
	} 
	catch (IOException e)
	{
	System.out.println("Exception while taking screenshot"+e.getMessage());
	} 
	
	return path;
}
}
