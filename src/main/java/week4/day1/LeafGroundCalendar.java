package week4.day1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCalendar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/Calendar.html");
		
		driver.findElementById("datepicker").click();
		driver.findElementByXPath("//span[text()='Next']").click();
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Date to Enter : ");
		
		int nextInt = obj.nextInt();
		driver.findElementByXPath("//a[text()="+nextInt+"]").click();}}

