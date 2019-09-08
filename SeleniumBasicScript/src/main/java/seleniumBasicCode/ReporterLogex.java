package seleniumBasicCode;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLogex {
	@Test
	public void Test1() {
		Reporter.log("WebDriver intialized");
		System.out.println("Repport log generated");
	}

}
