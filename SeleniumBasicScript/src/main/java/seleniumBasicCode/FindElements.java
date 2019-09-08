package seleniumBasicCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElements {
	@Test
	public void findElements() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		List<WebElement> radioButtonValue=driver.findElements(By.xpath("//input[@name='name']"));
		for (WebElement webElement : radioButtonValue) {
			System.out.println(webElement.getAttribute("value"));
		}
		driver.close();
	}
	

}
