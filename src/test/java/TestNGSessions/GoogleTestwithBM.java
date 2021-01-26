package TestNGSessions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestwithBM {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googletitleTest() {
	 String	title =driver.getTitle();
	 System.out.println("the page title is " + title);
	 assertEquals(title, "Google");
	}
	
	@Test
	public void googlelogoTest() {
		//boolean flag = driver.findElement(By.id("hplogo")).isDisplayed();
		//Assert.assertEquals(flag, true);
		//Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed(),"enter the correct logoid");
	}
	
	@Test
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
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
