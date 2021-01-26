package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseTest {


	@Test(priority =1 )
	public void flipkarttitleTest() {
		driver.get("https://www.flipkart.com/");
	 String	title =driver.getTitle();
	 System.out.println("the page title is " + title);
	 //assertEquals(title, "Online Shopping");  - u will get error message
	 Assert.assertTrue(title.contains("Online Shopping"));
	}
	
	@Test(priority =2 )
	public void flipkartlogoTest() {
			Assert.assertTrue(driver.findElement(By.className("_2xm1JU")).isDisplayed(),"enter the correct logoid");
	}
	
	
	
	
}
