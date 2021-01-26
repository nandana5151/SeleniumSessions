package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoonTest extends BaseTest{

	
	
	
	@Test(priority =1 )
	public void noontitleTest() {
		driver.get("https://www.noon.com/uae-en/");
	 String	title =driver.getTitle();
	 System.out.println("the page title is " + title);
	 //assertEquals(title, "Online Shopping");  - u will get error message because expected message u write only partially
	 Assert.assertTrue(title.contains("Online Shopping"));
	}
	
	@Test(priority =2 )
	public void noonlogoTest() {
			Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/uae-en']/img")).isDisplayed(),"enter the correct logoid");
	}
	
	@Test(priority =3)
	public void signinTest() {
		Assert.assertTrue(driver.findElement(By.id("dd_header_signInOrUp")).isDisplayed(),"enter the correct logoid");
	}
	
	
}
