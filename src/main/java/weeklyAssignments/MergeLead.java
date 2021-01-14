package weeklyAssignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindow.get(1));
		//System.out.println(driver.getTitle());
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(listWindow.get(0));
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listWindow1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(listWindow1.get(1));
		
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		driver.switchTo().window(listWindow.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(text);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File Target = new File("./snaps/FindLead.png");
		FileUtils.copyFile(source, Target);
		
		
		
	}

}
