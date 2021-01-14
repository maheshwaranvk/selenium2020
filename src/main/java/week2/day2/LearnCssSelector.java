package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCssSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElementByXPath("//input[@class='decorativeSubmit']");
		String cssValue = a.getCssValue("background-color");
		
		System.out.println(a.getCssValue("text-align"));
		System.out.println(a.getCssValue("margin-left"));
		System.out.println(a.getCssValue("color"));
		System.out.println(a.getCssValue("width"));
		System.out.println(a.getCssValue("border"));
		System.out.println(cssValue);
	}

}
