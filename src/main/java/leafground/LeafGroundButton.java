package leafground;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElementByXPath("//button[@id='home']").click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//img[@class='wp-categories-icon svg-image' and @alt='Buttons']").click();
		
		Point location = driver.findElementByXPath("//button[contains(text(),'Get Position')]").getLocation();
		System.out.println("Location : "+ location);
		
		String cssValue = driver.findElementByXPath("//button[contains(text(),'What color')]").getCssValue("background-color");
		System.out.println("Color : "+ cssValue);
		
		Dimension size = driver.findElementByXPath("//button[contains(text(),'What is my')]").getSize();
		System.out.println("Size is "+size);
	}

}
