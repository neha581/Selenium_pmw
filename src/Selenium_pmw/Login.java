package Selenium_pmw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://beta-app.pickmywork.com/");
	}	
	
	@Test
	public void login() throws InterruptedException
	{
	    driver.findElement(By.id("login_mobile")).sendKeys("7733992632");
	    Thread.sleep(10000);
	    System.out.println("number entered successfuly");
	    driver.findElement(By.id("generate_otp")).click();
	    System.out.println("generated otp successfuly");
	    Thread.sleep(10000);
	    driver.findElement(By.id("login_submit")).click();
	    Thread.sleep(12000);
	  		
		System.out.println("Login complete");
	}
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
	
}


