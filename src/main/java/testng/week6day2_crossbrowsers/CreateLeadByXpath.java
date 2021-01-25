package testng.week6day2_crossbrowsers;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadByXpath {
	RemoteWebDriver driver;
@Parameters({"browser"})
	@Test
	public void createLead(String bName) {
				
	if(bName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	else if(bName.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	else if(bName.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
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
		
		WebElement findElementByXPath = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select obj = new Select(findElementByXPath);
		
		obj.selectByVisibleText("India");
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	}

}
