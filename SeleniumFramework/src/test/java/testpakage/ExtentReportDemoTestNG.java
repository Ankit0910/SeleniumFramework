package testpakage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoTestNG {

	ExtentReports extent;

	@BeforeSuite
	public void setup() {
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		
		
		
		//extent = new ExtentReports();
		//extent.attachReporter(spark);
		

	}


	@Test
	public void test1() {
		
		extent.createTest("MyFirstTest").log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");



	}


	@AfterSuite
	public void teardown() {
		
		extent.flush();



	}

}
