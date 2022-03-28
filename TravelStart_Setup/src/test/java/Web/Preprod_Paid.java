package Web;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import Base.Web_Base;
import config.Config;

public class Preprod_Paid extends Web_Base {


	static ArrayList<String> yourTDs = new ArrayList<String>();

	/**
	 *  [TestMethod]
	 *  [Description("To Login to the site Travelstart")]
	 */

	@Test

	public static void DirectLogin() throws InterruptedException, IOException
	{


		test=createTest("TCC");
		ExtentTest  NodeType=test;

		getDriver().get(Config.APPLICATION_URL);
		getDriver().manage().window().maximize();

		Thread.sleep(3000);
		WebElement username = getDriver().findElement(By.id("j_idt18:username"));
		username.sendKeys("Pranjal");

		WebElement password = getDriver().findElement(By.id("j_idt18:password"));
		password.sendKeys("London#2022");

		WebElement Loginbtn = getDriver().findElement(By.name("j_idt18:j_idt22"));
		Loginbtn.click();
		Thread.sleep(3000);


		//		WebElement Pendingbtn = getDriver().findElement(By.name("j_idt2:box1:j_idt82:j_idt110:6:j_idt112"));
		//		Pendingbtn.click();
		//		Thread.sleep(3000);

		WebElement Paidbtn = getDriver().findElement(By.name("j_idt2:box1:j_idt80:j_idt108:3:j_idt110"));
		Paidbtn.click();
		Thread.sleep(3000);

		WebElement enteremail = getDriver().findElement(By.id("j_idt2:box1:j_idt80:keyword"));
		enteremail.sendKeys("rezza@travelstart.com");

		WebElement Searchbutton = getDriver().findElement(By.name("j_idt2:box1:j_idt80:j_idt83"));
		Searchbutton.click();
		Thread.sleep(3000);

		int j = 1;
		while(j != -1)
		{

			List<WebElement> allTDs = getDriver().findElements(By.tagName("td"));
			int n = getDriver().findElements(By.tagName("tr")).size();

			//			ArrayList<String> yourTDs = new ArrayList<String>();
			for (int i = 1; i <= allTDs.size(); i = i +16){

				yourTDs.add(allTDs.get(i).getText());
			}
			System.out.println(yourTDs);

			List<	WebElement> nextbutton = getDriver().findElements(By.id("j_idt2:box2:itineraryListForm:nextLink"));

			if(nextbutton.size()>0 )
			{
				j++;
				nextbutton.get(0).click();
				Thread.sleep(5000);
			}

			else
			{
				j = -1;
				System.out.println("This is the last page");
			}


		}

		//Excel_Utilities.writeExcelRow(yourTDs, 1);

		//create an object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
		FileInputStream fis = new FileInputStream("C:\\Users\\thinksysuser\\Documents\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//call the getSheet() method of Workbook and pass the Sheet Name here.
		//In this case I have given the sheet name as “TestData”
		//or if you use the method getSheetAt(), you can pass sheet number starting from 0. Index starts with 0.
		XSSFSheet sheet = workbook.getSheet("LinkData");
		//XSSFSheet sheet = workbook.getSheetAt(0);
		//Now create a row number and a cell where we want to enter a value.
		//Here im about to write my test data in the cell B2. It reads Column B as 1 and Row 2 as 1. Column and Row values start from 0.
		//The below line of code will search for row number 2 and column number 2 (i.e., B) and will create a space.
		//The createCell() method is present inside Row class.

		//Now we need to find out the type of the value we want to enter.
		//If it is a string, we need to set the cell type as string
		//if it is numeric, we need to set the cell type as number
		//    cell.setCellType(cell.CELL_TYPE_NUMERIC);




		for (int k=0;k<yourTDs.size();k++)
		{
			Row row = sheet.createRow(k);
			Cell cell = row.createCell(0);	
			cell.setCellValue(yourTDs.get(k));
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\thinksysuser\\Documents\\Book1.xlsx");
		workbook.write(fos);
		fos.close();

		System.out.println("END OF WRITING DATA IN EXCEL");


	}






}

























































