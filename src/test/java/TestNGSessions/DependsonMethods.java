package TestNGSessions;

import org.testng.annotations.Test;

public class DependsonMethods {
	
	@Test(priority =1)
	public void loginTest() {
		System.out.println("login test ");
		int i =9/0 ;
	}
	
	@Test(priority =2 , dependsOnMethods = {"loginTest"}, alwaysRun = true)
	public void homesearchTest() {
		System.out.println("home seach ");
	}
	
}
