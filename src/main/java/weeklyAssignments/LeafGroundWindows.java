package weeklyAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/Window.html");
		
		driver.findElementById("home").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow.get(0));
		
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listWindow2 = new ArrayList<String>(windowHandles2);
		
		System.out.println(listWindow2.size()-1);
		
		driver.switchTo().window(listWindow2.get(1)).close();
		driver.switchTo().window(listWindow2.get(2)).close();
		driver.switchTo().window(listWindow2.get(0));
		System.out.println(driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//button[text()='Wait for 5 seconds']")));
		driver.findElementByXPath("//button[text()='Wait for 5 seconds']").click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> windowHandles3 = driver.getWindowHandles();
		
		List<String> listWindow3 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(listWindow3.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(listWindow3.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(listWindow3.get(0));
		System.out.println(driver.getTitle());
		
		
	}

}
