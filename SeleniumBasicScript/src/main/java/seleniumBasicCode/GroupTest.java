package seleniumBasicCode;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups= {"firstgroup","Secondgroup"})
	public void Test1() {
		System.out.println("firstgroup and Secondgroup run");
	}
	@Test(groups= {"firstgroup"})
	public void Test2() {
		System.out.println("firstgroup run");
	}
	@Test(groups= {"Secondgroup"})
	public void Test3() {
		System.out.println(" Secondgroup run");
	}
	@Test(groups= {"firstgroup","Secondgroup"})
	public void Test4() {
		System.out.println("firstgroup and Secondgroup run");
	}
	

}
