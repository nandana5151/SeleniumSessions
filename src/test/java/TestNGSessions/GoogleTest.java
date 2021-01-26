package TestNGSessions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	

	@Test(priority =1 )
	public void googletitleTest() {
		driver.get("https://www.google.com/");
	 String	title =driver.getTitle();
	 System.out.println("the page title is " + title);
	 assertEquals(title, "Google");
	}
	
	@Test(priority =2 )
	public void googlelogoTest() {
		//boolean flag = driver.findElement(By.id("hplogo")).isDisplayed();
		//Assert.assertEquals(flag, true);
		//Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed(),"enter the correct logoid");
	}
	
	@Test(priority =3 )
	public void googlesearchButtonTest()
	{
		Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed(), "Enter the correct locator-");
	}
	
//	@Test
//	public void googlesearchButtonTest()
//	{
//		Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed(), "Enter the correct locator-");
//	}
//	//
	
	

}
