package weeklyAssignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://leafground.com/home.html");
		driver.findElementByXPath("//h5[text()='Image']/following-sibling::img").click();
		
		driver.findElementByXPath("//label[contains(text(),'Click on this image to go home page')]/following-sibling::img").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.findElementByXPath("//h5[text()='Image']/following-sibling::img").click();
		
		driver.findElementByXPath("//label[contains(text(),'Click me using Keyboard or Mouse')]/following-sibling::img").click();

	
		//WebElement a = driver.findElementByXPath("//label[contains(text(),'Am I Broken Image?')]/following-sibling::img");
		//boolean enabled = a
		
		//if(enabled==false) {System.out.println("The Link is not Enabled");}
		//else {System.out.println("Link is enabled");}
		
		
		

	}

}
