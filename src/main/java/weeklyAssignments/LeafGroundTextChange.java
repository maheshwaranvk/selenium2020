package weeklyAssignments;

import java.time.Duration;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundTextChange {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));		
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByXPath.xpath("//button[text()='Click ME!']"))).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
//		driver.findElementByXPath("//button[text()='Click ME!']").click();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().accept();
	}

}
