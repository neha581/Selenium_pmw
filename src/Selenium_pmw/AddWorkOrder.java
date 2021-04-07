package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddWorkOrder{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addWorkOrder() throws InterruptedException
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
		
		    driver.findElement(By.id("project_card_44")).click();
		    System.out.println("Clicked on jobId-44");
		    Thread.sleep(5000);
		       
		    driver.findElement(By.id("project_jd_menu_collapse")).click();
		    System.out.println("JD Deatils tab displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("project_workorder_popup")).click();
		    System.out.println("Work order tab displayed");
		    Thread.sleep(7000);
		   	    
		    driver.findElement(By.xpath("//button[contains(text(),'Add Work Order')]")).click();
		    System.out.println("clicked on Add work order button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Work order category']")).sendKeys("Testing");
		    System.out.println("Category Displayed ");
		    Thread.sleep(3000);
		    	
		    driver.findElement(By.xpath("//p[@data-placeholder='Work order description']")).sendKeys("Testing description Section");
		    System.out.println("Work order description displayed ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//p[@data-placeholder='Payment reimbursement']")).sendKeys("Testing Payment section");
		    System.out.println("Payment reimbursement displayed ");
		    Thread.sleep(3000);
		    	 
		    driver.findElement(By.xpath("//p[@data-placeholder='instruction']")).sendKeys("Testing instruction section");
		    System.out.println("instruction displayed ");
		    Thread.sleep(3000);
		    
		    Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	        System.out.println("Scroll down perfomed");
	        Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		    System.out.println("Clicked on Save button");
		    Thread.sleep(7000);
		    
		   
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}

