package weeklyAssignments;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com﻿");
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementByXPath("//a[contains(text(),'Forgot Your')]/preceding-sibling::button").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByXPath("//a[text()='Log Out']").click();
		Thread.sleep(3000);
		driver.close();
	}

}
