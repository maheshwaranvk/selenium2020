package weeklyAssignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Map<String,Integer> perfumePriceTags = new LinkedHashMap();
		  Set<Entry<String, Integer>> entrySet = perfumePriceTags.entrySet();
		  
		  WebDriverManager.chromedriver().setup();
		  
		  RemoteWebDriver driver = new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.amazon.in/");
		  
		  driver.findElementById("twotabsearchtextbox").sendKeys("driving glass");
		  
		  driver.findElementById("nav-search-submit-button").click();
		  
		  
		 // WebElement unisex = driver.findElementByXPath("(//a[@class='a-size-base a-link-normal s-no-hover'])[3]");
		  if (driver.findElementByXPath("(//a[@class='a-size-base a-link-normal s-no-hover'])[3]").isDisplayed()) {driver.findElementByXPath("(//a[@class='a-size-base a-link-normal s-no-hover'])[3]").click();
		  }
		  
		  //PerfumeNames : List perfumeName
		  List<WebElement> perfumexpath = driver.findElementsByXPath("//span[@class='a-size-base-plus a-color-base a-text-normal']"); 
		  
		  List<String> perfumeName = new ArrayList(); 
		  
		  for (WebElement a : perfumexpath) { 
			  perfumeName.add(a.getText()); 
			  }
		  
		  
		  //PerfumePrice - List : perfumePrice
		  List<WebElement> perfumePriceXpath =
		  driver.findElementsByXPath("//span[@class='a-price-whole']"); 
		  
		  List<Integer> perfumePrice = new ArrayList();

		  for (WebElement b : perfumePriceXpath) {
		  
		  String text = b.getText(); 
		  String text1 = text.replaceAll("\\D","");
		 // System.out.println(text1);
		 
		  int parseInt = Integer.parseInt(text1); 
		  perfumePrice.add(parseInt); }
		  
		  for (Integer integer : perfumePrice) { //System.out.println(integer); }
			  
		  }
		
		 Collections.sort(perfumePrice);
		 int highPrice = perfumePrice.get(perfumePrice.size()-1);
		 
		 driver.findElementByXPath("//span[@class='a-price-whole' and text()='"+String.format("%,d", highPrice)+"']").click();
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windowList = new ArrayList<String>(windowHandles);
		 
		 driver.switchTo().window(windowList.get(1));
		 System.out.println(driver.getTitle());
		 
		 String productWeight = driver.findElementByXPath("(//span[@class='a-text-bold' and contains(text(),'Item Weight')]/following::span)[1]").getText();
		 System.out.println("Product Weight : " +productWeight);
		 
		 String productName = driver.findElementById("bylineInfo").getText();
		 System.out.println("Product Name : " +productName);
		 
		 WebElement productImage = driver.findElementByXPath("//img[@id='landingImage']");
		 File source = productImage.getScreenshotAs(OutputType.FILE);
		 File target = new File("./snaps/productImage.png");
		 FileUtils.copyFile(source, target);
		 
		 driver.findElementById("add-to-cart-button").click();
		 driver.findElementById("hlb-view-cart-announce").click();
		 driver.findElementById("sc-buy-box-ptc-button").click();
		 driver.close();
		 
	}
}
