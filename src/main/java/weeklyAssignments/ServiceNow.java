package weeklyAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://dev68594.service-now.com/");
		driver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//input[@id='user_name']")));
		
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		
		driver.findElementById("sysverb_login").click();
		driver.switchTo().defaultContent();
		
		driver.findElementById("filter").sendKeys("incident");
Thread.sleep(5000);
		
		//WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait2.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("(//div[@class='sn-widget-list-title' and text()='All'])[2]")));
		driver.findElementByXPath("(//div[@class='sn-widget-list-title' and text()='All'])[2]").click();
		
		driver.switchTo().frame("gsft_main");
		driver.findElementById("sysverb_new").click();
		String text = driver.findElementById("incident.number").getAttribute("value");
		System.out.println(text);
		driver.findElementById("lookup.incident.caller_id").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWind = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWind.get(1));
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='column_head list_hdrcell table-col-header'])[4]").click();
		driver.findElementByXPath("(//a[@class='glide_ref_item_link'])[1]").click();
		driver.switchTo().window(listWind.get(0));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//a[@id='lookup.incident.short_description']").click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listWind1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(listWind1.get(1));
		driver.findElementByXPath("//a[text()='Issue with a web page']").click();
		driver.switchTo().window(listWind1.get(0));
		
		driver.switchTo().frame("gsft_main");
		driver.findElementById("sysverb_insert").click();
		Thread.sleep(3000);
		//System.out.println("Incident Number: " + text);
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(text);
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(Keys.ENTER);
		String text2 = driver.findElementByXPath("//a[@class='linked formlink']").getText();
		
		if(text.equalsIgnoreCase(text2)==true) {System.out.println("Incident Created Successfully");}
		

	else { System.out.println("Incident is not created");}}}

