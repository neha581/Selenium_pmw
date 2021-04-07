package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class VerifyBankDetails{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void verifyBankDetails() throws InterruptedException
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
		    
		    driver.findElement(By.id("verify_bank_account_popup")).click();
		    System.out.println("clicked on verify Bank Details button");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Download Bank Details')]")).click();
		    System.out.println("click on Download bank details button ");
		    Thread.sleep(10000);
		    		    
		    driver.findElement(By.id("verify_bank_input")).sendKeys("C:\\Users\\Vedant\\Desktop\\Bank Accounts - ALL.xlsx");
		    System.out.println("uploaded the file");
		    Thread.sleep(3000);
	    
		    driver.findElement(By.id("verify_bank_submit")).click();
		    System.out.println("Verify Bank Details successfully");
		    Thread.sleep(10000);
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


