package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShots {

	public static void main(String[] args) throws IOException {
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
WebElement mail = driver.findElementByXPath("//a[@class='d-block font-weight-bold']");

File source1 = driver.getScreenshotAs(OutputType.FILE);

File source = mail.getScreenshotAs(OutputType.FILE);

File target = new File("./snaps/email.png");
File target1 = new File("./snaps/page.png");

FileUtils.copyFile(source, target);

FileUtils.copyFile(source1, target1);

	}

}
