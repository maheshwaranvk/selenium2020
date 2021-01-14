package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragMeAround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drag.html");
		
		WebElement drag = driver.findElementById("draggable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 200, 300).perform();
		

	}

}
