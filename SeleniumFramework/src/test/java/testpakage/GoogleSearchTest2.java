package testpakage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageObjects.GoogleSearchPage;

public class GoogleSearchTest2 {
	static WebDriver driver = null;
	

	public static void main(String[] args) throws Exception {
		googlesearch();
		
	}

	
	public static void googlesearch() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//go to google
		driver.get("https://www.google.com");

		//enter text
		//WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		//textbox.sendKeys("automation");
		//textbox.sendKeys(Keys.RETURN);
		
		GoogleSearchPage.textbox_search(driver).sendKeys("automation stap by step");
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);
		
		
		//Search
		//WebElement SearchBttn = driver.findElement(By.xpath("//input[@name='btnK']"));
		//SearchBttn.sendKeys(Keys.RETURN);
		
		
		//wait 
		Thread.sleep(1000);
		
		//quit
		driver.quit();
	}
}

