package smoke;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import pages.LoginPage;
import resusable.CommonFunctions;

public class test {

	@Test(dataProvider="excelData")
	public void launchb(String strUserName, String strPassword) throws IOException {
		LoginPage objLP = new LoginPage();
		objLP.setUserName(strUserName);
		objLP.setPassword(strPassword);
		//objLP.clickLogin();
	}
	
	@DataProvider
	public Object[][] excelData() throws IOException {
		String sheetPath = System.getProperty("user.dir") + "/testData/testData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(sheetPath);
		XSSFSheet xs = wb.getSheet("login");
			
		int i = 1;
		int iRowCount = xs.getLastRowNum();
		int iColCount = xs.getRow(0).getLastCellNum();
		
		Object[][] arrData = new Object[iRowCount][iColCount];
		while (i <= xs.getLastRowNum())// 1,2
		{
			XSSFRow sr = xs.getRow(i);
			int j = 0;
			while (j < xs.getRow(0).getLastCellNum())// 0,1
			{
				XSSFCell xss = sr.getCell(j);
				if (xss == null) {
					arrData[i-1][j] = "";
					j++;
				}
				else {
					xss.setCellType(CellType.STRING);
					arrData[i-1][j] = xss.getStringCellValue();
					j++;
				}
				
			}

			i++;
		}
		
		return arrData;
	}

	
	@DataProvider
	public Object[][] testData() {
		int rowCount=  3;
		int colCount = 2;
		
		Object[][] arrData = new Object[rowCount][colCount];
		
		arrData[0][0] = "admin1";
		arrData[0][1] = "admin1";
		
		arrData[1][0] = "admin2";
		arrData[1][1] = "admin2";
		
		arrData[2][0] = "admin3";
		arrData[2][1] = "admin3";
		
		return arrData;

	}
	
}
