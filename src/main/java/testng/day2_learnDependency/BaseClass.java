package testng.day2_learnDependency;

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
	
	public ChromeDriver driver;
	
	public static String leadId;
	
	String excelFileName;
	
	@Parameters({"url","uname","pass"})
    @BeforeMethod
  public void beforeSuite(String link, String userName, String password) {
	  WebDriverManager.chromedriver().setup();
	  	driver = new ChromeDriver();
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
  }
    
	  @DataProvider(name ="fetchData")
	  public String[][] sendData() throws IOException { 
		 return ReadExcelData.readData(excelFileName);
	  }
  
	/*
	 * @AfterMethod public void afterSuite() { driver.close(); }
	 */

}
