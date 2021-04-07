package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddRecruiter{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addRecruiter() throws InterruptedException
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
		
		    driver.findElement(By.id("project_card_50")).click();
		    System.out.println("Clicked on jobId-50");
		    Thread.sleep(10000);
		       
		    driver.findElement(By.id("project_access_menu_collapse")).click();
		    System.out.println("Access tab displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("project_recruiter_popup")).click();
		    System.out.println("Recruiter tab displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Add Recruiter')]")).click();
		    System.out.println("Add Recruitment button displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select Recruiter')]")).click();
		    System.out.println("Select Recruiter tab displayed");
		    Thread.sleep(3000);
		  	    
		    driver.findElement(By.xpath("//li[contains(text(),'Add New')]")).click();
		    System.out.println("Clicked on Add new button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Testing");
		    System.out.println("name displayed ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7703668961");
		    System.out.println("Phone number displayed ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("Testing.com");
		    System.out.println("Email displayed ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		    System.out.println("Clicked on Save button");
		    Thread.sleep(7000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select Recruiter')]")).click();
		    System.out.println("Clicked on Select Recruiter button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[@data-value='5']")).click();
		    System.out.println("Select the Recruiter from ,ist");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select City')]")).click();
		    System.out.println("Clicked on Select City button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[text()='Mumbai']")).click();
		    System.out.println("Clicked on Mumbai City button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//div[@id='menu-']//div[contains(@aria-hidden,'true')]")).click();
		    System.out.println("Clicked on outside area");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//span[contains(@class,'material-icons MuiIcon-root mr-1')]")).click();
		    System.out.println("Recruiter added successfully");
		    Thread.sleep(10000);
		    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


