package weeklyAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryMergeLead {

public static RemoteWebDriver driver=null;

	public PageFactoryMergeLead() {
		 
		PageFactory.initElements(driver, this);
	}
	//@FindBy(id="username")WebElement uName;
	
	@FindBy(how=How.ID,using="username")WebElement uName;
	
	@FindBy(how=How.ID,using="password")WebElement pass;
	//@FindBy(id="password")WebElement pass;
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")WebElement login;
	@Test
	public void pfMergeLead() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		uName.sendKeys("demosalesmanager");
		pass.sendKeys("crmsfa");
		login.click();
	}
}
