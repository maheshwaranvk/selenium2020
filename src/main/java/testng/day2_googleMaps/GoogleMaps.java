package testng.day2_googleMaps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleMaps{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		/* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); */
		driver.get("https://www.google.com/maps");
		driver.findElementByXPath("//img[@class='searchbox-directions-icon']").click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ByXPath.xpath("(//input[@class='tactile-searchbox-input'])[4]")));
		
		driver.findElementByXPath("(//input[@class='tactile-searchbox-input'])[4]").sendKeys("Villiyanur");
		driver.findElementByXPath("(//button[@class='searchbox-searchbutton'])[2]").click();
		
		driver.findElementByXPath("//input[@placeholder='Choose destination, or click on the map...']").sendKeys("Villupuram");
		driver.findElementByXPath("(//button[@class='searchbox-searchbutton'])[3]").click();
		driver.findElementByXPath("(//img[@class='directions-travel-mode-icon'])[1]").click();
		/*
		 * List<WebElement> distances = driver.
		 * findElementsByXPath("//div[@class='section-directions-trip-distance section-directions-trip-secondary-text']/div"
		 * ); for (WebElement webElement : distances) {
		 * System.out.println(webElement.getText()); }
		 */
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByXPath.xpath("(//div[@class='section-directions-trip-distance section-directions-trip-secondary-text']/div)[1]")));
		List<WebElement> distance = driver.findElementsByXPath("//div[@class='section-directions-trip-distance section-directions-trip-secondary-text']/div");
		List<Integer> dis = new ArrayList<Integer>();
		
		List<String> route = new ArrayList<String>();
		List<String> time = new ArrayList<String>();
		
		for (int i = 0; i < distance.size(); i++) {
			
	
			 String replaceAll = distance.get(i).getText().replaceAll("\\D","");
			 dis.add(Integer.parseInt(replaceAll)) ;
		}	
		
		
		for (int i = 0,j=1; i < dis.size() && j<(dis.size()+1); i++,j++) {
			
			System.out.println("The Available Routes are : ");
			System.out.println("Route["+j+"] Distance :" + dis.get(i));
			System.out.println("Route["+j+"] Time of Travel :" + driver.findElementByXPath("(//div[text()=\""+dis.get(i)+" km\"]/preceding::div[@class='section-directions-trip-duration delay-light']/span[1])["+(j)+"]").getText());
			time.add(driver.findElementByXPath("(//div[text()=\""+dis.get(i)+" km\"]/preceding::div[@class='section-directions-trip-duration delay-light']/span[1])["+(j)+"]").getText());
			System.out.println("Route["+j+"] : "+driver.findElementByXPath("(//h1[@class='section-directions-trip-title'])["+j+"]").getText());
			route.add(driver.findElementByXPath("(//h1[@class='section-directions-trip-title'])["+j+"]").getText());
		}
		Collections.sort(dis);
		
		System.out.println("The Shortest Route is ");
		System.out.println(driver.findElementByXPath("(//h1[@class='section-directions-trip-title'])[1]").getText());
		
	}
	
	

}
