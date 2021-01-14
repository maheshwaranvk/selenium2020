package weeklyAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		
		driver.findElementById("email").sendKeys("vkmaheshwaran@gmail.com");
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Add This Key");
		
		String text = driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value");
		System.out.println(text);
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		System.out.println(driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled());
	}

}
