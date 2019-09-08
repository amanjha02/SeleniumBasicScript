package seleniumBasicCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownHandling {
	@Test
	public void handleDropdown() {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	Select contryList=new Select(driver.findElement(By.name("country")));
	System.out.println(contryList.isMultiple());
	contryList.selectByIndex(2);
	List<WebElement> allcountry=contryList.getOptions();
	for (int i = 0; i <allcountry.size(); i++) {
		System.out.println(allcountry.get(i).getText());
	}
	}
}
