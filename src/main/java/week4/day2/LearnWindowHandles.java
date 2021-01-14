package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listWindow = new ArrayList<String>(windowHandles);
		//driver.close();
		driver.switchTo().window(listWindow.get(1));
		System.out.println(driver.getTitle());
String text = driver.findElementByXPath("//a[@class='d-block font-weight-bold']").getText();
System.out.println(text);

driver.switchTo().window(listWindow.get(0)).close();
	}

}
