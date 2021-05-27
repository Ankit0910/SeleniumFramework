package testpakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;

	@Parameters("browsername")
	@BeforeTest()
	public void setup(@Optional("chrome") String browsername) {
		System.out.println("The browser you are using "+ browsername);

		if (browsername.equalsIgnoreCase("chrome")){

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}

	@Test
	public void test1() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}


	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("test completed successfully");

	}



}
