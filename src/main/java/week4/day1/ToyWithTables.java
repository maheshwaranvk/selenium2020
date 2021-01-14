package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyWithTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		
		//Count No of Rows
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		System.out.println("No of Rows : "+ rows.size());
		
		List<WebElement> columns = driver.findElementsByXPath("//table[@id='table_id']//tr[1]/th");
		System.out.println("No of Columns : "+ columns.size());
		
		String text = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		System.out.println("Learn to Interact with Elements's Progress Value is "+text);
		
		List<String> progress = new ArrayList<String>();
		
		for (int i = 2; i <= rows.size(); i++) {
			String text2 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]").getText();
			progress.add(text2);
		}
		
		System.out.println(progress);
		String chk = "30%";
		for (int i = 0; i < progress.size(); i++) {
			System.out.println(progress.get(i));
			
			String string = progress.get(i);
			boolean equalsIgnoreCase = string.equalsIgnoreCase(chk);
		//	System.out.println(equalsIgnoreCase);
			if (equalsIgnoreCase==true) {
				driver.findElementByXPath("(//input[@type='checkbox' and @name='vital'])[3]").sendKeys(Keys.SPACE);
			}
			else {continue;
		}
}

	}}
