package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToDoNotePage {

	private static WebElement element = null;
	
	
	public static WebElement textbox_enternote(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("body.learn-bar:nth-child(2) section.todoapp:nth-child(2) div:nth-child(1) header.header > input.new-todo:nth-child(2)"));
		
		return element;
				
	}
	
public static WebElement checkbox_note(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("body.learn-bar:nth-child(2) section.todoapp:nth-child(2) div:nth-child(1) header.header > input.new-todo:nth-child(2)"));
		return element;
				
	}
	
}
