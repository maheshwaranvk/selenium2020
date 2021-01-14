package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//Open Chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize 
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		//Type UserName
		WebElement a = driver.findElementById("username");
		a.sendKeys("demosalesmanager");
		
		//Type Password
		WebElement b = driver.findElementById("password");
		b.sendKeys("crmsfa");
		
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Leads
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		//enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Google");
		
		//enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Saathith Hasan");
		
		//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Mundey");
		
	
		
		//find Element of dropdown
		WebElement dd = driver.findElementById("createLeadForm_ownershipEnumId");
		
		
		Select obj = new Select(dd);
		
		obj.selectByVisibleText("Partnership");
		
		//find Element of Dropdown by Index
		
		WebElement ee = driver.findElementById("createLeadForm_marketingCampaignId");
		Select obj1 = new Select(ee);
		
		obj1.selectByValue("CATRQ_CARNDRIVER");
		
		//click Create Lead
		driver.findElementByClassName("smallSubmit").click();
		
		
		//wait
		//Thread.sleep(5000);
		
		//Close
		//driver.close();
		

	}

}
