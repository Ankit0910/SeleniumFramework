package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.Main;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelpath, String sheetname) {
		
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		getrowcount();
		getStringCellData(0,0);
		getNumericalCellData(1,1);
	}
	
	public static int getrowcount() {
		
			int rowcount = sheet.getPhysicalNumberOfRows();
			//System.out.println(rowcount);
			return rowcount;
		
		
	}
	
	public static int getcolcount() {
		
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println(colcount);
		return colcount;
	
	
}
		
		public static String getStringCellData(int rowNum , int colNum) {

				String cellvalue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//		System.out.println(cellvalue);
				return cellvalue;

			
		}
			public static void getNumericalCellData(int rowNum , int colNum) {

					double cellvalue = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//			System.out.println(cellvalue);				
			
			
		}
		
		
	}


