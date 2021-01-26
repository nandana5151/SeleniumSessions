package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {

	@Test(expectedExceptions = ArithmeticException.class)
	public void divTest() {
		System.out.println("div test");
		
		int i =9/0;
		
		System.out.println("ignore the above value ");
	}
}
