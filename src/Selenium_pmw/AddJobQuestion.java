package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddJobQuestion{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addJobQuestion() throws InterruptedException
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
		
		    driver.findElement(By.id("project_card_53")).click();
		    System.out.println("Clicked on jobId-53");
		    Thread.sleep(5000);
		       
		    driver.findElement(By.id("project_jd_menu_collapse")).click();
		    System.out.println("JD Deatils tab displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("project_question_popup")).click();
		    System.out.println("Job Questions tab displayed");
		    Thread.sleep(3000);
		   	    
		    driver.findElement(By.id("add_question")).click();
		    System.out.println("clicked on Add Question button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("select_state")).click();
		    System.out.println("clicked on select_state button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[contains(text(),'Interview')]")).click();
		    System.out.println("Interview state selected ");
		    Thread.sleep(3000);	 
		    
		    driver.findElement(By.id("question_type")).click();
		    System.out.println("clicked on question_type ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[contains(text(),'Text')]")).click();
		    System.out.println("click on 'Text' type"); 
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("question_type")).click();
		    System.out.println("clicked on question_type ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[contains(text(),'Text')]")).click();
		    System.out.println("click on 'Text' type"); 
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//p[@data-placeholder='Question Heading']")).sendKeys("For automation Testing");
		    System.out.println("Questions Heading displayed");
		    Thread.sleep(3000);
		        
		    driver.findElement(By.id("is_mandatory_switch")).click();
		    System.out.println("Clicked on mandatory switch button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("ques_save")).click();
		    System.out.println("Clicked on Save button");
		    Thread.sleep(10000);
		    
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


