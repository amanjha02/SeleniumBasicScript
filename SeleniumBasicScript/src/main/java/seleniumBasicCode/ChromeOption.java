package seleniumBasicCode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
	List<String> li=new ArrayList<String>();
		li.add("start-maximized");
		li.add("incognito");
		li.add("version");
		option.addArguments(li);
		WebDriver driver=new ChromeDriver(option);
	}

}
