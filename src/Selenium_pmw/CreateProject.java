package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class CreateProject{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void createProject() throws InterruptedException
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
		    driver.findElement(By.id("create_project")).click();
		    System.out.println("Create Project popup displayed");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("company_list")).click();
		    System.out.println("company list displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[@data-value='2']")).click();
		    System.out.println("click on Part time and displayed");
		    Thread.sleep(3000);
		   
		    driver.findElement(By.id("upload_banner_img")).sendKeys("C:\\Users\\Vedant\\Desktop\\index.jpg");
		    System.out.println("banner_img uploaded"); 
		    Thread.sleep(7000);
		    driver.findElement(By.id("project_title")).sendKeys("test");
		    System.out.println("Create Project popup displayed");
		    Thread.sleep(5000);
		    driver.findElement(By.id("project_domain")).sendKeys("test domain");
		    System.out.println("project_domain displayed");
		    Thread.sleep(3000);
		    driver.findElement(By.id("project_type")).click();
		    System.out.println("Project type dropdown displayed");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//li[@data-value='Part Time']")).click();
		    System.out.println("click on Part time and displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("maximum_earn_oportunity")).sendKeys("2000");
		    System.out.println("maximum_earn_oportunity displayed"); 
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("perks")).sendKeys("test perks");
		    System.out.println("perks displayed"); 
		    Thread.sleep(3000);
		    driver.findElement(By.id("project_duration")).sendKeys("3");
		    System.out.println("project_duration displayed"); 
		    Thread.sleep(3000);
		    driver.findElement(By.id("project_tagline")).sendKeys("test tagline");
		    System.out.println("project_tagline displayed"); 
		    Thread.sleep(3000);
		    driver.findElement(By.id("total_no_partners")).sendKeys("500");
		    System.out.println("total_no_partners displayed"); 
		    Thread.sleep(3000);
		    
		    Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	        System.out.println("Scroll down perfomed");
	        Thread.sleep(3000);
	        
		    driver.findElement(By.id("deadline")).click();
		    System.out.println("deadline displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--025']")).click();
		    System.out.println("Date displayed"); 
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//li[contains(text(),'17:30')]")).click();
		    System.out.println("time displayed"); 
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("job_requirement_0")).click();
		    System.out.println("Motor Bike checkbox displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("job_requirement_4")).click();
		    System.out.println("License checkbox displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("project_create_submit")).click();
		    System.out.println("project created successfully");
		    Thread.sleep(15000);
		    
		    Actions act1 = new Actions(driver);
	        act1.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	        System.out.println("Scroll down perfomed");
	        Thread.sleep(3000);
	        
		    
    }
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
		
}

