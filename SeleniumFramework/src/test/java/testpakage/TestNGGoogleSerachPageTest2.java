package testpakage;

import org.testng.annotations.Test;

import config.PropertiesFile;

import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.GoogleSearchPageObjects;

public class TestNGGoogleSerachPageTest2 {
	
	WebDriver driver = null;
	public static String browsername =  null;
	
	@BeforeTest
	public void setupBrowser() {
		
	PropertiesFile.getproperties();
	
		
		if(browsername.equalsIgnoreCase("chrome")){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		else if(browsername.equalsIgnoreCase("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		}
		else{
			System.out.println("please set your browser in config.properties");
		}
		driver.get("https://www.google.com");
	}
	
	@Test
	public  void googleSearchtest() {
		
		GoogleSearchPageObjects SearchPageObj = new GoogleSearchPageObjects(driver);
		String x = SearchPageObj.getButtonName();
		System.out.println(x);
		SearchPageObj.setText("Automation Step by Step");
		SearchPageObj.pressEnter();
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("test done");
	}
	}
