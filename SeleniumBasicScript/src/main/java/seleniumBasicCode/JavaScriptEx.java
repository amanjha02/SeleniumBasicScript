package seleniumBasicCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptEx {
	@Test
	public void javaScriptExample() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		
		JavascriptExecutor exe= (JavascriptExecutor)driver;
		String domainname=exe.executeScript("return document.domain").toString();
		String URl=exe.executeScript("return document.URL").toString();
		String Title=exe.executeScript("return document.title").toString();
		System.out.println(domainname+" "+URl+" "+Title);
	}

}
