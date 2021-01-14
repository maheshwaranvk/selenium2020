package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement men = driver.findElementByXPath("(//a[@class='menuLinks leftCategoriesProduct '])[6]//span");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(men).perform();
		WebElement shirt = driver.findElementByXPath("(//span[text()='Shirts'])[2]/..");
		
		builder.moveToElement(shirt).click().perform();
	//	builder.click(shirt).perform();
		
		WebElement firstShirt = driver.findElementByXPath("(//img[@class='product-image '])[1]");
		
		builder.moveToElement(firstShirt).perform();
		
		WebElement quickView = driver.findElementByXPath("((//picture[@class='picture-elem'])[1]/following::div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]");
		
		builder.moveToElement(quickView).click().perform();
	}

}
