package testng.day2_createLead;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void getExcelName() {
		excelFileName = "CreateLead";

	}

	@Test(dataProvider = "fetchData")
	public void executeCreateLead(String cName, String fName, String lName) {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();

		/*
		 * String text = driver.findElementById("viewLead_companyName_sp").getText();
		 * int parseInt = Integer.parseInt(text); return parseInt;
		 */

	}

	

	 

	/*
	 * @DataProvider(name = "excelData") public String[][] data() throws IOException
	 * {
	 * 
	 * // load excel XSSFWorkbook wb = new XSSFWorkbook("./data/data.xlsx");
	 * 
	 * // readsheet XSSFSheet ws = wb.getSheet("Sheet1");
	 * 
	 * // readrow XSSFRow wr = ws.getRow(0);
	 * 
	 * // readcell XSSFCell wc = wr.getCell(0);
	 * 
	 * // readcellvalue String stringCellValue = wc.getStringCellValue();
	 * 
	 * System.out.println(stringCellValue);
	 * 
	 * int lastRowNum = ws.getLastRowNum(); short lastCellNum =
	 * ws.getRow(0).getLastCellNum(); String[][] cell = new String[lastRowNum +
	 * 1][lastCellNum]; for (int i = 1; i <= lastRowNum; i++) { for (int j = 0; j <
	 * lastCellNum; j++) {
	 * 
	 * 
	 * String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
	 * System.out.println(stringCellValue2);
	 * 
	 * cell[i][j] = ws.getRow(i).getCell(j).getStringCellValue();
	 * 
	 * }
	 * 
	 * } for (int i = 1; i <= lastRowNum; i++) { for (int j = 0; j < lastCellNum;
	 * j++) { System.out.println(cell[i][j]); }
	 * 
	 * } return cell; }
	 */
}
