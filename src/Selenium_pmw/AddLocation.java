package Selenium_pmw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AddLocation{
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://beta-app.pickmywork.com/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void addLocation() throws InterruptedException
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
		
		    driver.findElement(By.id("project_card_44")).click();
		    System.out.println("Vedantu Job displayed");
		    Thread.sleep(10000);
	    
		    WebElement webElement = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		    webElement.sendKeys("Kota");
		    Thread.sleep(2000);
		    webElement.sendKeys(Keys.ARROW_DOWN); //Keyboard Arrow down button clicked
		    Thread.sleep(2000);
		    webElement.sendKeys(Keys.ENTER);  //Keyboard Enter button clicked
		    System.out.println("location displayed");
		    Thread.sleep(5000);
		  
		    driver.findElement(By.xpath("//input[@placeholder='Title/Code']")).sendKeys("Test Title");
		    System.out.println("title displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Partners Required']")).sendKeys("200");
		    System.out.println("Partners displayed");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//span[@class='material-icons MuiIcon-root mr-1']")).click();
		    System.out.println("location added successfully ");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//body[@class='modal-open']/div[@tabindex='-1']/div/div[@class='modal fade show']/div[@class='modal-dialog modal-lg']/div[@class='modal-content']/div[@class='modal-body']/form/div[@class='row']/div[@class='col']/div[2]/div[5]/span[1]")).click();
		    System.out.println("Clicked on sub location button ");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//body[@class='modal-open']/div[@tabindex='-1']/div/div[@class='modal fade show']/div[@class='modal-dialog modal-lg']/div[@class='modal-content']/div[@class='modal-body']/form/div[@class='row']/div[@class='col']/div[@class='row']/div[@class='col-12']/div[@class='collapse show']/div[@class='my-3 card']/div[@class='card-body']/button[1]")).click();
		    System.out.println("clicked on 'Add Sub Location' button");
		    Thread.sleep(3000);
		    
		    WebElement webElement1 = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		    webElement1.sendKeys("Bundi");
		    Thread.sleep(2000);
		    webElement1.sendKeys(Keys.ARROW_DOWN); //Keyboard Arrow down button clicked
		    Thread.sleep(2000);
		    webElement1.sendKeys(Keys.ENTER);//Keyboard Enter button clicked
		    System.out.println("Sub-location displayed");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Title/Code']")).sendKeys("Sub location Title");
		    System.out.println("title displayed of Sub-Location");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Partners Required']")).sendKeys("50");
		    System.out.println("Partners displayed of Sub-Location");
		    Thread.sleep(3000);
		    	   
		    driver.findElement(By.xpath("//input[@placeholder='Range(Km)']")).sendKeys("5");
		    System.out.println("Range displayed of Sub-Location");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//span[@class='material-icons MuiIcon-root mr-1']")).click();
		    System.out.println("Sub-location added successfully ");
		    Thread.sleep(5000);	    
		    
    }	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}

