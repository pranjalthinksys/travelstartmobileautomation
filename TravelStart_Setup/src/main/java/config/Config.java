package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

public class Config {
	
	public static String value;

	public static  final String APPLICATION_URL =readData(null,"Url") ;
	public static  final String TEST_BROWSER =readData(null, "Browser");
	public static  final String App_Email =readData(null, "Email"); ;
	public static  final String App_Password = readData(null, "Password");;

	/*
	 *  [TestMethod]
	 *  [Description("To read the configuration file")] 
	 */

	public static String readData(String file,String key)
	{
		try 
		{			
			FileInputStream in=new FileInputStream("..//TravelStart//GlobalParameters.properties");	 
			Properties properties=new Properties();			
			properties.load(in);
			in.close();
			
			FileReader reader=new FileReader("..//TravelStart//GlobalParameters.properties");
			properties.load(reader);
			value=properties.getProperty(key);			
		}
		catch(Exception e)
		{
			System.out.println("Configuration file not readable");
		}
		return value;
	}

	/*
	 *  [TestMethod]
	 *  [Description("To update data in the config file")] 
	 */
	
	public static void writeData(String file,String key,String value) 
	{	  
	     try
	     {
            FileInputStream in=new FileInputStream("..//TravelStart//GlobalParameters.properties");  	             
		    Properties props = new Properties();
    	    props.load(in);
		    in.close();
		    
		    FileOutputStream out = new FileOutputStream("..//TravelStart//GlobalParameters.properties");
		    props.setProperty(key, value);
		    props.store(out, "properties");
		    out.close();
	        } 
	        catch(Exception e)
			{
			System.out.println("Configuration file not readable");
			}
	}
	
}
