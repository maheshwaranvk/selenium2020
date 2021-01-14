package testng.day2_deleteLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseClass{
	
	@BeforeTest
	public String setExcelName() {
		return excelFileName="DeleteLead";

	}
	@Test(dataProvider="fetchData")
	public void executeDeleteLead(String leadId) throws InterruptedException {
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a").click();
		
		
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		String text = driver.findElementByXPath("//div[@class='x-toolbar x-small-editor']//div[1]").getText();
	
		System.out.println(text);
		//if (text=="No records to display") {System.out.println("Record has been Deleted");}
		//else {System.out.println("Record is not Deleted");}
		
		//WebElement a = driver.findElementByXPath("//div[text()='No records to display']");
		//a.isDisplayed();
		//System.out.println(a);
		

	}

}
