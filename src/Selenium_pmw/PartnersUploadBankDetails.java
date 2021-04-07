package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class PartnersUploadBankDetails{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void partnersUploadBankDetails() throws InterruptedException
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
		    Thread.sleep(10000); 
		
		    driver.findElement(By.id("partners_tab")).click();
		    System.out.println("Partners Tab displayed");
		    Thread.sleep(10000);
		
		    driver.findElement(By.xpath("//span[contains(text(),'more_vert')]")).click();
		    System.out.println("Clicked on right corner option");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Upload Bank Details')]")).click();
		    System.out.println("Clicked on 'Upload Bank Details'");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//a[contains(text(),'Download Sample File')]")).click();
		    System.out.println("Download Sample File");
		    Thread.sleep(4000);
    	    
		    driver.findElement(By.xpath("//span[contains(text(),'Upload')]")).click();
		    System.out.println("click on 'Upload' and check 'Browse' option should be mandatory ");
		    Thread.sleep(4000);
	    	  	    
		    driver.findElement(By.xpath("//input[contains(@type,'file')]")).sendKeys("C:\\Users\\Vedant\\Desktop\\uploadBankDetails.xlsx");
		    System.out.println("Clicked on 'Browse' button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//span[contains(text(),'Upload')]")).click();
		    System.out.println("click on 'Upload' ");
		    Thread.sleep(15000);
		    
		    
		   
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


