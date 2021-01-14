package testng.day2_learnDependency;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readData(String excelFile) throws IOException {
		
		//load excel
		XSSFWorkbook wb = new XSSFWorkbook ("./data/"+excelFile+".xlsx");
		
		//readsheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//readrow
		XSSFRow wr = ws.getRow(0);
		
		//readcell
		XSSFCell wc = wr.getCell(0);
		
		//readcellvalue
		String stringCellValue = wc.getStringCellValue();
		
		int lastRowNum = ws.getLastRowNum();
		short lastCellNum = ws.getRow(0).getLastCellNum();
		
		String [][] cell = new String [lastRowNum][lastCellNum];
		
		
		for (int i = 1; i <=lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
			cell[i-1][j] = ws.getRow(i).getCell(j).getStringCellValue();
			
			}
			
		}
		wb.close();
return cell;
}}
