package weeklyAssignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		WebElement findElementByXPath = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[1]");
		driver.switchTo().frame(findElementByXPath);
		
		driver.findElementByXPath("//button[@id='Click']").click();
		System.out.println(driver.findElementByXPath("//button[text()='Hurray! You Clicked Me.']").isEnabled());
		
		driver.switchTo().defaultContent();

WebElement findElementByXPath2 = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[2]");
driver.switchTo().frame(findElementByXPath2);
driver.switchTo().frame("frame2");
driver.findElementById("Click1").click();
driver.switchTo().defaultContent();
//System.out.println(driver.findElementByXPath("(//button[@id='Click1' and text()='Hurray! You Clicked Me.'])").isEnabled());
		
		List<WebElement> findElementsByTagName = driver.findElementsByXPath("//iframe");
		
		System.out.println(findElementsByTagName.size());
		
	}

}
