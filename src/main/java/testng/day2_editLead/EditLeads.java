package testng.day2_editLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testng.day2_duplicateLead.BaseClass;

public class EditLeads extends BaseClass{
	
	public class DuplicateLead extends BaseClass{
		
		@BeforeTest
		public void readExcelFileName() {
			excelFileName ="EditLead";
		}
		
	@Test(dataProvider="fetchData")
	public void executeEditLeads(String name , String company) throws InterruptedException {
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(name);
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement a = driver.findElementById("updateLeadForm_companyName");
		a.sendKeys(company);
		driver.findElementByXPath("(//input[@name='submitButton' and @class='smallSubmit'])[1]").click();
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		
		boolean contains = text.contains(company);
		System.out.println(contains);
		

	}

}
}