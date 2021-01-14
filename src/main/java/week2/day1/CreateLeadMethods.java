package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadMethods {
	
	public void createLead(String fn, String ln, String cn) {
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
				driver.findElementById("createLeadForm_companyName").sendKeys(cn);
				
				//enter First Name
				driver.findElementById("createLeadForm_firstName").sendKeys(fn);
				
				//Enter Last Name
				driver.findElementById("createLeadForm_lastName").sendKeys(ln);
				
				//click Create Lead
				driver.findElementByClassName("smallSubmit").click();
				
				//wait
				//Thread.sleep(5000);
				
				//Close
				//driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		
		String FirstName = "Saathith Hasan";
		String LastName = "Mundey";
		String CompanyName = "Facebook";
		
		CreateLeadMethods obj = new CreateLeadMethods();
		obj.createLead(FirstName, LastName, CompanyName);
		
			

	}

}
