import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {
	
	static WebDriver driver = null;
	

	public static void main(String[] args) {
		
		
		String projectpath = System.getProperty("user.dir");
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		System.out.println(caps.chrome());
		
		
		
		
				System.out.println(projectpath);
				
				System.setProperty("webdriver.chrome.driver", projectpath+"//drivers/chromedriver");
				
				
				driver = new ChromeDriver();
				
				driver.get("https://www.google.com");
				
				
				
	}

}
