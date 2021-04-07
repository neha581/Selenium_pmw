package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class FirstScript{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void createProject() throws InterruptedException
	{
		    driver.findElement(By.id("login_mobile")).sendKeys("7733992632");
		    Thread.sleep(2000);
		    System.out.println("number entered successfuly");
		    driver.findElement(By.id("generate_otp")).click();
		    Thread.sleep(15000);
		    System.out.println("generated otp successfuly");
		    driver.findElement(By.id("login_submit")).click();
		    System.out.println("Login complete");
		    Thread.sleep(15000); 
		
		    driver.findElement(By.id("project_tab")).click();
		    System.out.println("Project Tab displayed");
		    Thread.sleep(15000);
        
		    Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	        System.out.println("Scroll down perfomed");
	        Thread.sleep(3000);
	        
	        Actions act1 = new Actions(driver);
	        act1.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	        System.out.println("Scroll down perfomed");
	        Thread.sleep(3000);
	         
	        
	        Actions act2 = new Actions(driver);
	        act2.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	        System.out.println("Scroll down perfomed");
	        Thread.sleep(3000);
    }
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
		
}

