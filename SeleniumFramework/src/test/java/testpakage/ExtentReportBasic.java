package testpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportBasic {
	
	private static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        //extent.attachReporter(spark);
        
        
        // creates a toggle for the given test, adds all log events under it    
       // ExtentTest test1 = 
        		
        		extent.createTest("Google Search Test", "Sample description").log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
        
        
        System.setProperty("webdriver.chrome.driver", "/Users/admin/eclipse-workspace/SeleniumFramework/drivers/chromedriver");
        
       // WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
				//test1.log(Status.INFO, "Test started");
		//go to google
				driver.get("https://www.google.com");
			//	test1.pass("Navigated to google");
		
		//enter text
				WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
				textbox.sendKeys("automation");
			//	test1.pass("text written");
			//	test1.addScreenCaptureFromPath("screenshot.png");
				
				textbox.sendKeys(Keys.RETURN);
			//	test1.pass("Enter done");
			//	test1.addScreenCaptureFromPath("screenshot1.png");

		//quit the browser
				driver.quit();
			//	test1.pass("Quit the browser");
				
		//		test1.info("Test Completed");
		
		
		extent.flush();
		
							
	}

}
