package weeklyAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password' and @class='inputLogin']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit' and @type='submit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		
		driver.findElementByXPath("(//a[contains(text(),'Lead')])[1]").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9");
		String ID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a").getText();
		
		//System.out.println(ID);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a").click();
		
		
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(ID);
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
