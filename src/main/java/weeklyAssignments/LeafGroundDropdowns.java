package weeklyAssignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement f1 = driver.findElementByXPath("//select[@id='dropdown1']");
		Select obj = new Select(f1);
		obj.selectByIndex(1);
		
		WebElement f2 = driver.findElementByXPath("//select[@name='dropdown2']");
		Select obj2 = new Select(f2);
		obj2.selectByVisibleText("Appium");
		
		WebElement f3 = driver.findElementByXPath("//select[@id='dropdown3']");
		Select obj3 = new Select(f3);
		obj3.selectByValue("3");
		
		WebElement f4 = driver.findElementByXPath("//select[@class='dropdown']");
		Select obj4 = new Select(f4);
		List<WebElement> options = obj4.getOptions();
		int i = options.size();
		System.out.println(i-1);
		
		driver.findElementByXPath("(//div[@class='example']//select)[5]").sendKeys("S");
		
		driver.findElementByXPath("//select[@multiple='']/option[@value=1]").click();
	}

}
