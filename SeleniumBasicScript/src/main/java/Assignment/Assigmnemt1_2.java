package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assigmnemt1_2 {
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
@Test(priority = 1)
public void launchApplication_assignment_2() {
	//launchBroser();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	System.out.println("page title is: "+driver.getTitle());
	System.out.println(driver.getPageSource());
	
}
@Test(priority = 2)
public void getAdminPageTile() throws InterruptedException { 
     WebElement element=driver.findElement(By.id("menu_admin_viewAdminModule"));
	waitForElement(element).click();
	System.out.println("Admin page title is:-"+driver.getTitle());
}

@Test(priority = 3)
public void getPIMPageTile() {
	 WebElement element=driver.findElement(By.id("menu_pim_viewPimModule"));
	 waitForElement(element).click();
	System.out.println("PIM page title is:-"+driver.getTitle());
}
@Test(priority = 4)
public void getLeavePageTile() {
	 WebElement element=driver.findElement(By.id("menu_leave_viewLeaveModule"));
	 waitForElement(element).click();
	System.out.println("Leave page title is:-"+driver.getTitle());
}
@Test(priority = 5)
public void getdashBoardPageTile() {
	WebElement element=driver.findElement(By.id("menu_dashboard_index"));
	 waitForElement(element).click();
	System.out.println("Dashboard page title is:-"+driver.getTitle());
}
@Test(priority = 6)
public void getDirectoryPageTile() throws InterruptedException {
	
	WebElement element=driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']/b"));
	 waitForElement(element).click();
	System.out.println("Diractory page title is:-"+driver.getTitle());
}

@Test(priority = 7)
public void getMaintaincePageTile() {
	WebElement element=driver.findElement(By.id("menu_maintenance_purgeEmployee"));
	 waitForElement(element).click();
	System.out.println("Maintaince page title is:-"+driver.getTitle());
}
/*
 * Wait for some time
 */

public WebElement waitForElement(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	return wait.until(ExpectedConditions.elementToBeClickable(element));
}
/*
 * Minimize the window
 */
public void MinimizeWindow() {
	driver.manage().window().setPosition(new Point(0,-2000));
		System.out.println("Window is minimied");
		//driver.close();
	}

@Test(priority = 2)
public void ReadDashBoardHeading() throws InterruptedException {
	//Thread.sleep(5000);
	WebElement element=driver.findElement(By.xpath("//div[@id='content']/div/div[1]/h1"));
	if(element.isDisplayed()) {
		String Textvalue= element.getText();
		System.out.println(Textvalue);
	}else {
		System.out.println("element not found");
	}
	
}
}
