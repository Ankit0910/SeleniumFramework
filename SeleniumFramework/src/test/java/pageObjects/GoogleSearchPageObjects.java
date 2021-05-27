package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPageObjects {
	
	WebDriver driver =null;
	WebDriverWait wait;
	
	By searchtextbox = By.name("q");
	By luckybutton = By.name("btnI");
	
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void setText(String test) {
		
		
		wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(searchtextbox));
		
		driver.findElement(searchtextbox).sendKeys(test);
	}
	

	public void pressEnter() { 
		
		driver.findElement(searchtextbox).sendKeys(Keys.ENTER);
	}
	
	public String getButtonName() {
		
		String label = driver.findElement(luckybutton).getAttribute("aria-label");
		System.out.println(label);
		return label;
		
	}

	
}
