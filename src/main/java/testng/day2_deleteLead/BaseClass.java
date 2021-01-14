package testng.day2_deleteLead;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public String excelFileName;
	public ChromeDriver driver;
	
@Parameters({"url","uname","pass"})
  @BeforeMethod
  public void beforeSuite(String url, String username, String password) {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
  }
  
  @DataProvider(name="fetchData")
  public String[][] readData() throws IOException 
  {
	return ReadExcelData.readExcelFile(excelFileName);
  }
  
	/*
	 * @AfterMethod public void afterSuite() { driver.close(); }
	 */

}
