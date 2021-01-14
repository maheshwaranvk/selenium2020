package weeklyAssignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//h5[text()='HyperLink']/following::img[@alt='Link']").click();
		
		String attribute = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
		System.out.println(attribute);
		
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		driver.getTitle();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		List<WebElement> a = driver.findElementsByXPath("//a");
		int size = a.size();
		System.out.println(size);
		
		
	}

}
