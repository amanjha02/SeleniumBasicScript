package Assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment2 {
	public WebDriver driver;
	@BeforeSuite
	public void launchBroser() {
		String basepath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",basepath+"\\Utils\\chromedriver.exe");
		 driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
	@Test(priority = 1)
	public void ValidatelandingPage_Title() throws IOException {
		//launchBroser();
		ReaddataFromExcel data=new ReaddataFromExcel();
		ArrayList<String> runvalue=data.readData(1);
		Iterator   itr=runvalue.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Yes")) {
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				String pageTitle=driver.getTitle();
				//OrangeHRM
			boolean status=pageTitle.equals("OrangeHRM");
			if(status) {
				//update result status is true
				data.WriteData("Pass");
			}
				
			else {
				data.WriteData("fail");
			}
			}
			else {
				System.out.println("Run Value is no");
			}
		}
//		
//			
//		}
		
	}
}
