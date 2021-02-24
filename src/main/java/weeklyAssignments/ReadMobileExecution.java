package weeklyAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadMobileExecution {

	
	public void executeMobileSite() {
		
		
		
		//Profile Initialization
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile("myFireFoxProfile");
		
		FirefoxDriver driver = new FirefoxDriver();
	}
}
