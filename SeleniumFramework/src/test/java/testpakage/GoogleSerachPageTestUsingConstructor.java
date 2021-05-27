package testpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.GoogleSearchPageObjects;

public class GoogleSerachPageTestUsingConstructor {
	
	public static void main(String[] args) {
		googleSearchtest();
	}

	public static void googleSearchtest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		GoogleSearchPageObjects SearchPageObj = new GoogleSearchPageObjects(driver);
		String x = SearchPageObj.getButtonName();
		System.out.println(x);
		SearchPageObj.setText("Automation Step by Step");
		SearchPageObj.pressEnter();
		
		
		driver.quit();
		
	}
}
