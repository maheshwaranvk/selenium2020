package leafground;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.findElementByXPath("(//input[@name='webform'])[4]").click();
		
		//WebElement a = driver.findElementByXPath("(//input[@type='checkbox'])[3]");
		//a.sendKeys(Keys.SPACE);

	}

}
