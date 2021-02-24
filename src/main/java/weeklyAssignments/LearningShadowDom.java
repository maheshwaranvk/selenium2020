package weeklyAssignments;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningShadowDom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.navigate().to("chrome://downloads/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dwld = (WebElement) js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		
		String jq = "arguments[0].setAttribute('Value','Mahesh')";
		
		((JavascriptExecutor)driver).executeScript(jq, dwld);
	}

}
