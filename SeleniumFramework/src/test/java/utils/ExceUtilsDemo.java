package utils;

public class ExceUtilsDemo {

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		
		ExcelUtils excel = new ExcelUtils(projectpath+"/excel/data.xlsx", "Sheet1");
		excel.getrowcount();
		excel.getcolcount();
		excel.getStringCellData(0, 0);
		//excel.getNumericalCellData(1, 1);

	}

}
