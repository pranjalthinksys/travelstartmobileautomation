package Mobile;

import org.testng.annotations.Test;
import Utilities.Excel_Utilities;

public class ExcelCheck {
	
	public static String Email;
	public static String Password;
	
	@Test(groups= {"Sanity"})
	public void test1() throws Exception {
		
		int DataRow=Excel_Utilities.getCellData("SuiteFile",11, 4);
		System.out.println("DataRow :"+DataRow);
		if(DataRow==0)
		{
			System.out.println("Please Enter valid Data in the TestData_Row ; The row cannot be zero");
		}
		else
		{
		Email=Excel_Utilities.getCellValue("Login",DataRow-1, 0);
		
		System.out.println("Email: "+Email);
		
		}
	}
}
