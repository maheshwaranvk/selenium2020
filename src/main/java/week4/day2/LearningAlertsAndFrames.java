package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningAlertsAndFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Mahesh");
		alert.accept();
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		
		boolean contains = text.contains("Mahesh");
		
		System.out.println(contains);
	}
}
