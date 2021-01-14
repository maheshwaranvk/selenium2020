package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDowns {

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
		
		//Find the Last but one Element in a Drop Down
		//1.Find the WebElement
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		//2.Select Class
		Select obj = new Select(source);
		
		//3. Get Options Method
		List<WebElement> allOptions = obj.getOptions();
		
		//4. Find the size
		int size = allOptions.size();
		
		//5. Select the last but one option
		
		obj.selectByIndex(size-2);
		WebElement firstSelectedOption = obj.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		
		//Find the Last but one Element in a Drop Down
		WebElement marketingCampign = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select obj2 = new Select(marketingCampign);
		List<WebElement> options = obj2.getOptions();
		int size2 = options.size();
		
		obj2.selectByIndex(size2-1);
		WebElement firstSelectedOption2 = obj2.getFirstSelectedOption();
		System.out.println(firstSelectedOption2.getText());
		
		
		//wait
		//Thread.sleep(5000);
		
		//Close
		//driver.close();
		

	}

}
