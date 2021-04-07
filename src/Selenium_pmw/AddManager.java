package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddManager{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addManager() throws InterruptedException
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
		    
		    driver.findElement(By.id("project_city_manager_popup")).click();
		    System.out.println("Manager tab displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Add Manager')]")).click();
		    System.out.println("Clicked on Add Manager button ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select Manager')]")).click();
		    System.out.println("Select Manager tab displayed");
		    Thread.sleep(3000);
		  	    
		    driver.findElement(By.xpath("//li[contains(text(),'Add New')]")).click();
		    System.out.println("Clicked on Add new button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Testing");
		    System.out.println("name displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7703668962");
		    System.out.println("Phone number displayed ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("Testing.com");
		    System.out.println("Email displayed ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		    System.out.println("Clicked on Save button");
		    Thread.sleep(7000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select Manager')]")).click();
		    System.out.println("Clicked on Select Manager button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[@data-value='1']")).click();
		    System.out.println("select the manager button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//em[contains(text(),'Select City')]")).click();
		    System.out.println("Clicked on Select City button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//li[text()='Delhi']")).click();
		    System.out.println("Clicked on Delhi City button");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//div[@id='menu-']//div[@aria-hidden='true']")).click();
		    System.out.println("Clicked on outside area");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//span[@class='material-icons MuiIcon-root mr-1']")).click();
		    System.out.println("Manager added successfully");
		    Thread.sleep(10000);
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


