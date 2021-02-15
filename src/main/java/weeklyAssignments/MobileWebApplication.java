package weeklyAssignments;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileWebApplication {

	@Test
	public void accessMobileWeb() {
		WebDriverManager.firefoxdriver().setup();
		
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://m.facebook.com/home.php");
		driver.findElementByXPath("//a[@id='forgot-password-link']").click();
		driver.findElementByXPath("//input[@id='identify_search_text_input']").sendKeys("9629433877");
		driver.findElementByXPath("//button[@id='did_submit']").click();

	}
}
