package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddInterviewer{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addInterviewer() throws InterruptedException
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
		       
		    driver.findElement(By.id("project_access_menu_collapse")).click();
		    System.out.println("Access tab displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("project_interviewer_popup")).click();
		    System.out.println("Interviewer tab displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Add Interviewer')]")).click();
		    System.out.println("Clicked on Add Interviewer button ");
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
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//body[@class='modal-open']/div[@tabindex='-1']/div/div[@class='modal fade show']/div[@class='modal-dialog modal-lg']/div[@class='modal-content']/div[@class='modal-body']/div/div[12]/div[3]/span[3]")).click();
		    System.out.println("Clicked on Edit button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select City')]")).click();
		    System.out.println("Clicked on Select city button");
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//li[text()='Lucknow']")).click();
		    System.out.println("Clicked on Lucknow city button");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//span[@class='material-icons MuiIcon-root mr-1']")).click();
		    System.out.println("Interviewer added successfully");
		    Thread.sleep(10000);
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


