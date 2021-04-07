package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class VerifyAndRejectTask{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void verifyAndRejectTask() throws InterruptedException
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
		
		    driver.findElement(By.id("project_tab")).click();
		    System.out.println("Project Tab displayed");
		    Thread.sleep(15000);
		
		    driver.findElement(By.id("task_cycle_all")).click();
		    System.out.println("Clicked on All");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("task_cycle_prev")).click();
		    System.out.println("Clicked on Previous");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("task_cycle_curr")).click();
		    System.out.println("Clicked on Current cycle");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("open_task_detail_30")).click();
		    System.out.println("clicked on Referral Form");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("download_task_resp_input1")).click();
		    System.out.println("clicked on Pending Download button");
		    Thread.sleep(2000);
		    ///date should be added"Code is not completed"
		    driver.findElement(By.id("download_task_resp_input2")).click();
		    System.out.println("clicked on Pending Download button");
		    Thread.sleep(2000);
		    //date should be added
		    driver.findElement(By.id("download_pending_task_30")).click();
		    System.out.println("clicked on Pending Download button");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("verify_task_response_30")).click();
		    System.out.println("Clicked on verify task response");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("verify_task_resp_input")).sendKeys("C:\\Users\\Vedant\\Desktop\\payment_upload_sample.xlsx");
		    System.out.println("Clicked on 'Browse' button");
		    Thread.sleep(5000);
		    	    
		    driver.findElement(By.id("verify_task_resp_submit")).click();
		    System.out.println("click on 'Update Status' ");
		    Thread.sleep(10000);

		   
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}
