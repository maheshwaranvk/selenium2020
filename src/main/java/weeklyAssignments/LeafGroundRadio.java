package weeklyAssignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://leafground.com/home.html");
		driver.findElementByXPath("//h5[contains(text(),'Radio Button')]/following-sibling::img").click();
		
		driver.findElementByXPath("//label[contains(text(),'Are you enjoying the classes?')]/following::input[1]").click();
		

	}

}
