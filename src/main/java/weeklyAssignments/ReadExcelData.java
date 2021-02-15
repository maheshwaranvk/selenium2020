package weeklyAssignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook excel = new XSSFWorkbook("./data/NewUser.xlsx");
		
		XSSFSheet sheet = excel.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(0);
	
		
		XSSFCell cell = row.getCell(0);
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		String[][] data  = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		for (int i = 0; i < lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				System.out.println(data[i][j]);
			}
			
		}
	}
	
	
}
