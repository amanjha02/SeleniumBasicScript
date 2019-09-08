package seleniumBasicCode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

public class TakeScreenShot {
	@Test
	public void takeScereenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		TakesScreenshot scrshot= ((TakesScreenshot)driver);
		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		File destfile=new File("D:\\screenshot.png");
		FileUtils.copyFile(srcfile, destfile);
		driver.close();
	}

}
