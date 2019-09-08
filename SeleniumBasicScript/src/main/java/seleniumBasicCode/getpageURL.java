package seleniumBasicCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getpageURL {
	@Test
	public void VerifyPageTitle() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Welcome: Mercury Tours";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		driver.close();
		//System.exit(0);
		
	}

}
