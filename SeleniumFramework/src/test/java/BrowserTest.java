import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageObjects.ToDoNotePage;


public class BrowserTest {

	static WebDriver driver = null;

	
	
	public static void main (String[] args) throws Throwable {	
		invokeandtest();
		
		
	}
	
	
	
	public static void invokeandtest() throws Throwable {

		//String projectpath = System.getProperty("user.dir");
		//System.out.println(projectpath);
		
		//System.setProperty("webdriver.chrome.driver", projectpath+"//drivers/chromedriver");
		
	//invoke browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("automation");
	
		List<WebElement> listofelement = driver.findElements(By.xpath("//input"));
	
		int count =	listofelement.size();
			System.out.println(count);
		
		Thread.sleep(2000);
		driver.quit();
		
		


	}

}
