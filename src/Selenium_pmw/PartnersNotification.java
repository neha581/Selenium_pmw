package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class PartnersNotification{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void partnersNotification() throws InterruptedException
	{
		    Thread.sleep(2000);
		    driver.findElement(By.id("login_mobile")).sendKeys("7733992632");
		    Thread.sleep(2000);
		    System.out.println("number entered successfuly");
		    driver.findElement(By.id("generate_otp")).click();
		    Thread.sleep(15000);
		    System.out.println("generated otp successfuly");
		    driver.findElement(By.id("login_submit")).click();
		    System.out.println("Login complete");
		    Thread.sleep(15000); 
		
		    driver.findElement(By.id("partners_tab")).click();
		    System.out.println("partners Tab displayed");
		    Thread.sleep(15000);
		
		    driver.findElement(By.xpath("//span[contains(text(),'filter_list')]")).click();
		    System.out.println("Clicked on Filter button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//span[contains(text(),'Generic')]")).click();
		    System.out.println("clicked on Generic checkbox");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//span[contains(text(),'Project Specific')]")).click();
		    System.out.println("clicked on Project Specific checkbox");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//em[contains(text(),'Select Filter')]")).click();
		    System.out.println("click on Select Filter");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//li[contains(text(),'Job Involved')]")).click();
		    System.out.println("Select job involved");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//em[contains(text(),'Any Project')]")).click();
		    System.out.println("click on 'Any Project'");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//li[@data-value='55']")).click();
		    System.out.println("click on Siply project");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//em[contains(text(),'Any Location')]")).click();
		    System.out.println("click on 'Any location'");
		    Thread.sleep(2000);		    

		    driver.findElement(By.xpath("//li[contains(text(),'Kota')]")).click();
		    System.out.println("click on Kota Location");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		    System.out.println("click Apply button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//span[contains(text(),'Notification')]")).click();
		    System.out.println("Clicked on Notification button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//h6[contains(text(),'Schedule')]")).click();
		    System.out.println("clicked on Schedule");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//h6[contains(text(),'Send Now')]")).click();
		    System.out.println("clicked on Send Now");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@value='ALERT']")).click();
		    System.out.println("clicked on ALERT checkbox");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@value='NOTIFICATION']")).click();
		    System.out.println("clicked on General Notification checkbox");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
		    System.out.println("click on Send button--> 'Check that Title is a mandatory field'");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@name='title']")).sendKeys("testing%123  ");
		    System.out.println("clicked on Title");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
		    System.out.println("click on Send button--> 'Check that Message is a mandatory field'");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("testing messgae, %%%%%444490...////A");
		    System.out.println("clicked on MESSAGE");
		    Thread.sleep(3000);

		    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		    System.out.println("click on 'Notify With SMS'");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
		    System.out.println("click on Send button");
		    Thread.sleep(5000);
	    
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


