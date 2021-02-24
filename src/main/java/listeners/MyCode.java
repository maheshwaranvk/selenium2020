package listeners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyCode {

	@Test
	public void executeMyCode() {
		System.out.println("Test");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	
	
}
