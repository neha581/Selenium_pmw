package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddWalletEntry{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addWalletEntry() throws InterruptedException
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
		    
		    driver.findElement(By.id("add_wallet_popup")).click();
		    System.out.println("clicked on Add Wallet button");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select Entries Type')]")).click();
		    System.out.println("click on 'select entry type' ");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//li[contains(text(),'Project Specific Entries')]")).click();
		    System.out.println("Clicked on Project Specific Entries");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("add_wallet_input2")).click();
		    System.out.println("Clicked on Select Reference Project");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//li[@data-value='44']")).click();
		    System.out.println("click on job id-44");
		    Thread.sleep(2000);
		    
		/*  
		    driver.findElement(By.id("add_wallet_input3")).click();
		    System.out.println("Clicked on Select Task");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//li[@data-value='30']")).click();
		    System.out.println("click on job id-30");
		    Thread.sleep(2000);
		*/  
		    driver.findElement(By.id("add_wallet_input4")).click();
		    System.out.println("calander displayed ");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--029']")).click();
		    System.out.println("date displayed");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//a[@target='_blank']")).click();
		    System.out.println("Clicked on Download button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("add_wallet_file_input")).sendKeys("C:\\Users\\Vedant\\Desktop\\payment_upload_sample.xlsx");
		    System.out.println("uploaded the file");
		    Thread.sleep(3000);
	    
		    driver.findElement(By.id("add_wallet_submit")).click();
		    System.out.println("wallet entry added successfully");
		    Thread.sleep(10000);
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


