package weeklyAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadSpl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password' and @class='inputLogin']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit' and @type='submit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		
		driver.findElementByXPath("(//a[contains(text(),'Lead')])[1]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Create L')]").click();
		
		driver.findElementByXPath("//input[@id = 'createLeadForm_companyName']").sendKeys("Saathath Hasan");
		driver.findElementByXPath("//input[@class='inputBox' and @type='text' and @name ='lastName' ]").sendKeys("Mandto");
		driver.findElementByXPath("//input[@id = 'createLeadForm_firstName']").sendKeys("Instagram");
		
		WebElement a = driver.findElementByXPath("(//select[@class='inputBox'])[1]");
		Select obj = new Select(a);
		obj.selectByVisibleText("Employee");
		
		WebElement b = driver.findElementByXPath("(//select[@name='marketingCampaignId'])[1]");
		Select obj2 = new Select(b);
		obj2.selectByValue("9001");
		
		WebElement c = driver.findElementByXPath("//select[@name=\"ownershipEnumId\"]");
		Select obj3 = new Select(c);
		obj3.selectByIndex(6);
		
		WebElement findElementByXPath = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select obj4 = new Select(findElementByXPath);
		
		obj4.selectByVisibleText("India");
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
