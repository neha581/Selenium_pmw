package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class PartnersAddImageStory{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void partnersAddImageStory() throws InterruptedException
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
		    
		    driver.findElement(By.id("partners_tab")).click();
		    System.out.println("partners Tab displayed");
		    Thread.sleep(10000);
		
		    driver.findElement(By.xpath("//span[contains(text(),'Add Story')]")).click();
		    System.out.println("Clicked on Add Story button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//div[contains(text(),'Image Story')]")).click();
		    System.out.println("click on Seelct story dropdown");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//li[contains(text(),'Image Story')]")).click();
		    System.out.println("clicked on Image Story");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Post Story')]")).click();
		    System.out.println("click on Post button--> 'Check that upload image is a mandatory field'");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//span[@class='btn btn-secondary btn-file mt-3']//input[@type='file']")).sendKeys("C:\\Users\\Vedant\\Desktop\\index.jpg");
		    System.out.println("uploading image");
		    Thread.sleep(5000);

		    driver.findElement(By.xpath("//button[contains(text(),'Post Story')]")).click();
		    System.out.println("click on Post button--> 'Check that color is a mandatory field'");
		    Thread.sleep(5000);

		    driver.findElement(By.xpath("//span[contains(text(),'Choose Color')]")).click();
		    System.out.println("click on choose color button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//div[@class='saturation-black']")).click();
		    System.out.println("click on black color ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//div[@style='position: fixed; inset: 0px;']")).click();
		    System.out.println("click on outside area");
		    Thread.sleep(3000);

		    driver.findElement(By.xpath("//button[contains(text(),'Post Story')]")).click();
		    System.out.println("click on Post button");
		    Thread.sleep(8000);
		    		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


