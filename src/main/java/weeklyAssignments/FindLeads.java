package weeklyAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLeads {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
		Thread.sleep(3000);
		
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
		

	}

}
