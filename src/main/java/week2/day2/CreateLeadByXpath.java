package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadByXpath {

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
		
		WebElement findElementByXPath = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select obj = new Select(findElementByXPath);
		
		obj.selectByVisibleText("India");
		
		/*
		 * WebElement findElementByXPath2 = driver.findElementByXPath(
		 * "//input[@id='createLeadForm_generalStateProvinceGeoId']"); Select obj2 = new
		 * Select(findElementByXPath2);
		 * 
		 * List<WebElement> options = obj2.getOptions(); int size = options.size();
		 * 
		 * obj2.selectByIndex(size - 2);
		 */
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	}

}
