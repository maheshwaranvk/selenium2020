package testng.day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
	
	@Test()
	public void executeCreateLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		
		  String replaceAll = text.replaceAll("\\D", "");
		  
		/*
		 * int leadID = Integer.parseInt(text); System.out.println(leadID);
		 */
		 
		System.out.println(replaceAll);
}
}






