package testpakage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.GoogleSearchPageObjects;

public class TestNGGoogleSerachPageTest {
	
	WebDriver driver = null;
	
	
	@BeforeTest
	public void setupBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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
	public void quibrowser() {
		driver.quit();
		System.out.println("test done");
	}
	}
