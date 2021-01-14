package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//Open Chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize 
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		//wait
		Thread.sleep(5000);
		
		//Close
		driver.close();
		

	}

}
