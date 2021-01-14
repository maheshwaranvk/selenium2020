package testng.day2_editLead;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	
	public static String[][] readExcelFile(String excelFileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		XSSFRow wr = ws.getRow(0);
		
		XSSFCell wc = wr.getCell(0);
		
		int lastRowNum = ws.getLastRowNum();
		System.out.println(lastRowNum);
		short lastCellNum = ws.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		String[][] data  = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j <lastCellNum; j++) {
				data[i-1][j]=ws.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		wb.close();
return data;
	}

}
