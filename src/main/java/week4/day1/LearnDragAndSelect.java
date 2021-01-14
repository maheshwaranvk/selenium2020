package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement source = driver.findElementByXPath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']");
		WebElement target = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		
		System.out.println(driver.findElementById("droppable").getText());
		boolean displayed = driver.findElementById("droppable").isDisplayed();
		
		if (displayed==true) {System.out.println("Dropped");}
		else {System.out.println("Not Dropped");}
	}

}
