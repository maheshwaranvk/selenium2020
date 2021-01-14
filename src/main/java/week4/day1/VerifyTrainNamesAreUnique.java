package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms"+Keys.ENTER+Keys.TAB+Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu"+Keys.ENTER+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ENTER);
		
		driver.findElementById("buttonFromTo").click();
		Thread.sleep(3000);
		
		List<WebElement> trainName = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		int size = trainName.size();
		
		List<String> trainNames = new ArrayList<String>();
		
		for (int i = 1; i <= size; i++) {
			String train = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[1]/td["+i+"]").getText();
			trainNames.add(train);
		}
	//	System.out.println(trainNames.size());
		int size2 = trainNames.size();
		Set<String> trainSet = new LinkedHashSet<String>(trainNames);
		
	// System.out.println(trainSet.size());
		int size3 = trainSet.size();
	 
	 if (size2==size3)
	 {System.out.println("There are not duplicates");
	}
	 else {System.out.println("There are duplicates");

}}}
