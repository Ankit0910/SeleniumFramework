import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageObjects.ToDoNotePage;


public class Test {

	static WebDriver driver = null;
	
	//public static (String[] args) throws Throwable {	
	//	invokeandtest();
		
		
	//}
	
	
	
	public static void invokeandtest() throws Throwable {

		//String projectpath = System.getProperty("user.dir");
		//System.out.println(projectpath);
		
		//System.setProperty("webdriver.chrome.driver", projectpath+"//drivers/chromedriver");
		
	//invoke browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://todomvc.com/examples/react/#/");
		
		Thread.sleep(2000);
		
		//enter note in text box
		ToDoNotePage.textbox_enternote(driver).sendKeys("testnote1");
		ToDoNotePage.textbox_enternote(driver).sendKeys(Keys.ENTER); 
		
		ToDoNotePage.textbox_enternote(driver).sendKeys("testnote2");
		ToDoNotePage.textbox_enternote(driver).sendKeys(Keys.ENTER); 	
		
		ToDoNotePage.textbox_enternote(driver).sendKeys("testnote3");
		ToDoNotePage.textbox_enternote(driver).sendKeys(Keys.ENTER); 
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		


	}

}
