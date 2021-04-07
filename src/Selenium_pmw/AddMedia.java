package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddMedia{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addJdVideo() throws InterruptedException
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
		    
		    driver.findElement(By.id("project_media_popup")).click();
		    System.out.println("Media tab displayed");
		    Thread.sleep(7000);
		   	    
		    driver.findElement(By.id("add_media")).click();
		    System.out.println("clicked on Add media button");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("add_jd")).click();
		    System.out.println("clicked on Add JD video button");
		    Thread.sleep(3000);
		    	
		    driver.findElement(By.id("video_upload_input")).sendKeys("C:\\Users\\Vedant\\Desktop\\test video.mp4");
		    System.out.println("video uploaded"); 
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("select_language")).click();
		    System.out.println("clicked on Select Language ");
		    Thread.sleep(3000);
		    	 
		    driver.findElement(By.xpath("//li[contains(text(),'English')]")).click();
		    System.out.println("English language selected ");
		    Thread.sleep(3000);	   
		    
		    driver.findElement(By.id("video_upload_submit")).click();
		    System.out.println("Clicked on Save button");
		    Thread.sleep(15000);
		    
		    driver.findElement(By.id("add_more_0")).click();
		    System.out.println("clicked on Add more button");
		    Thread.sleep(3000);
		    	
		    driver.findElement(By.id("video_upload_input")).sendKeys("C:\\Users\\Vedant\\Desktop\\test video.mp4");
		    System.out.println("video uploaded"); 
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("select_language")).click();
		    System.out.println("clicked on Select Language ");
		    Thread.sleep(3000);
		    	 
		    driver.findElement(By.xpath("//li[contains(text(),'Hindi')]")).click();
		    System.out.println("Hindi language selected ");
		    Thread.sleep(3000);	   
		    
		    driver.findElement(By.id("video_upload_submit")).click();
		    System.out.println("Clicked on Save button");
		    Thread.sleep(20000);
		    	    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}


