package weeklyAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartClass {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		RemoteWebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "(//button)[2]")));
		 * 
		 * driver.findElementByXPath("(//button)[2]").click();
		 */

		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ESCAPE).perform();

		driver.findElementByXPath("//input[@placeholder='Search for products, brands and more']").sendKeys("Perfumes");
		driver.findElementByXPath("//button[@type='submit']").click();
		List<WebElement> perfumeName = driver.findElementsByClassName("s1Q9rs");
		
		List<WebElement> perfumePriceXpath = driver.findElementsByClassName("_30jeq3");
		List<Integer> perfumePrice = new ArrayList<Integer>();
		
		for (WebElement a : perfumePriceXpath) {
			String text = a.getText();
			String replaceAll = text.replaceAll("\\D", "");
			int parseInt = Integer.parseInt(replaceAll);
			perfumePrice.add(parseInt);
		}
		Collections.sort(perfumePrice);
		
		String format = String.format("%,d", perfumePrice.get(perfumePrice.size()-1));
		driver.findElementByXPath("//div[@class='_30jeq3' and contains(text(),'"+format+"')]").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList(windowHandles);
		
		driver.switchTo().window(windowHandlesList.get(1));
		WebElement productPic = driver.findElementByXPath("//div[@class='CXW8mj _3nMexc']//img");
		
		File source = productPic.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/product.png");
		FileUtils.copyFile(source, target);
		
		driver.findElementByXPath("(//div[@class='_1p3MFP']//button)[1]").click();
		driver.findElementByXPath("//span[text()='Place Order']").click();
	}

}
