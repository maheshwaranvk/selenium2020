package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LensCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");
		
		
		Actions builder = new Actions(driver);
		WebElement computerGlasses = driver.findElementByXPath("//a[text()='Computer Glasses']");
		builder.moveToElement(computerGlasses).perform();
		WebElement men = driver.findElementByXPath("(//span[@class='uppercase' and text()='men'])[2]");
		builder.moveToElement(men).perform();;
		WebElement range = driver.findElementByXPath("(//span[@class='fs12'])[10]");
		builder.moveToElement(range).click().perform();
		driver.findElementByXPath("//span[text()='Round']/preceding-sibling::img").click();
		driver.findElementByXPath("//span[text()='Black(11)']").click();
		
		int size = driver.findElementsByXPath("//div[@class='pos-rel overflow-hidden padding-0']").size();
		if (size == 11) {System.out.println("Count Matching");}
		else {System.out.println("Count not matching");}
		WebElement firstKannadi = driver.findElementByXPath("(//div[@class='product-info col-md-12 padding-b10 padding-t10 padding-l0 padding-r0 '])[1]");
		builder.moveToElement(firstKannadi).perform();
		
		String text = driver.findElementByXPath("(//p[@class='fs12 no-decoration text-black margin-b0 inline-block'])[1]/span[@class='fw700']").getText();
		System.out.println(text);

	}

}
