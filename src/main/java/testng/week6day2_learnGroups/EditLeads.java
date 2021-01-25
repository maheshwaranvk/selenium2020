package testng.week6day2_learnGroups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads extends BaseClass{
	@Test(groups= {"funtional","regression"})
	public void executeEditLeads() throws InterruptedException {
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement a = driver.findElementById("updateLeadForm_companyName");
		a.sendKeys("Wipro");
		driver.findElementByXPath("(//input[@name='submitButton' and @class='smallSubmit'])[1]").click();
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		
		boolean contains = text.contains("Wipro");
		System.out.println(contains);
		
		System.out.println("Edit Lead Completed");
		

	}

}
