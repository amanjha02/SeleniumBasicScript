package seleniumBasicCode;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	@Test
	public void handelKeyBoardEvent() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement firstnameElement=driver.findElement(By.name("firstName"));
		Actions actionbuilder=new Actions(driver);
Action seriesofAction=actionbuilder.moveToElement(firstnameElement).click()
					  .keyDown(firstnameElement,Keys.SHIFT).sendKeys(firstnameElement, "aman")
					  .doubleClick().contextClick().build();
seriesofAction.perform();

driver.manage().window().setPosition(new Point(0, 300));

			
	}

}
