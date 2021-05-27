package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
    String projectpath = System.getProperty("user.dir");
    WebDriver driver = null;
    
	@BeforeTest 
	public void setupBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
    
    @Test(dataProvider="testdata1")
    public void test1(String username, String password) throws Exception {
    	
    	System.out.println(username+ " | " +password);
    	
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	driver.findElement(By.id("txtUsername")).sendKeys(username);
    	driver.findElement(By.id("txtPassword")).sendKeys(password);
    	Thread.sleep(2000);
    	driver.quit();
    	
    	
    }
	
	@DataProvider(name = "testdata1")
	public Object[][] getData() {
		
		Object data[][]= testData(projectpath+"/excel/data.xlsx", "Sheet1");
		return data;
	}
	
	
	
	public Object[][] testData(String excelpath, String sheetname) {
	//String projectpath = System.getProperty("user.dir");
	
	ExcelUtils excel = new ExcelUtils(excelpath, sheetname);
	int rowcount = excel.getrowcount();
	int colcount = excel.getcolcount();
	
	Object data[][] = new Object[rowcount-1][colcount];
	
	
	for (int i = 1; i<rowcount; i++) {
		for (int j =0 ; j<colcount; j++) {
			String celldata = excel.getStringCellData(i, j);
			data[i-1][j]=celldata;		
		}
	}
	return data;
	
	}


}
