package testng.week6day2_learnGroups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseClass{
	@Test(groups="sanity")
	public void executeDuplicateLead() throws InterruptedException {

		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String originalID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a[1]").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		String duplicateID = text.replaceAll("[^0-9]", "");
		//System.out.println(duplicateID);
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(originalID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String originalName = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println(originalName);
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(duplicateID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String duplicateName = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println(duplicateName);
		
		boolean contentEquals = originalName.contentEquals(duplicateName);
		
		if(contentEquals==true) {System.out.println("Duplicates Completed");}
		else{System.out.println("Duplicates not Completed");}
		System.out.println("Duplicate Lead Completed");
	}

}
