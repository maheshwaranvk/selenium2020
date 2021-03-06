package testng.week6day2_learnGroups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead extends BaseClass{

	@Test(groups="smoke")
	public void executeMergeLead() throws InterruptedException, IOException {
		
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindow.get(1));
		//System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Gopi");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(listWindow.get(0));
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listWindow1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(listWindow1.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Gopi");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(listWindow.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(text);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		System.out.println("Merge Lead Completed");
		
		/*
		 * File source = driver.getScreenshotAs(OutputType.FILE);
		 * 
		 * File Target = new File("./snaps/FindLead.png"); FileUtils.copyFile(source,
		 * Target);
		 */
		
		
		
	}

}
