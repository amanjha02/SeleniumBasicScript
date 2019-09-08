package seleniumBasicCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LaunchFirefox {
	@Test
	public void launchFirefox() {
		 System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        capabilities.setCapability("marionette", true);
	       
	        	WebDriver driver=new FirefoxDriver(capabilities);
	}

}
