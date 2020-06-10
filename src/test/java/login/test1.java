package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class test1 {

	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception
	{

		//String path="http://qa-tekarch.firebaseapp.com";
		WebDriverManager.chromedriver().setup();
		 driver=new org.openqa.selenium.chrome.ChromeDriver();
		 //driver.get(path);
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
				
	}
	
	@AfterMethod
	public void exit()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void valid_credential() throws Exception
	{
		String path="http://qa-tekarch.firebaseapp.com";
		driver.get(path);
		WebElement email=driver.findElement(By.id("email_field"));
		email.clear();
		Thread.sleep(2000);
		email.sendKeys("admin123@gmail.com");
		WebElement pwd=driver.findElement(By.id("password_field"));
		pwd.clear();
		pwd.sendKeys("admin123");
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		click1.click();

		Thread.sleep(1000);
		System.out.println("login success with valid credential");
		//return email1;
		
	}
	@Test(priority=2)
	public void invalid_credential() throws Exception
	{
		String path="http://qa-tekarch.firebaseapp.com";
		driver.get(path);
		WebElement email=driver.findElement(By.id("email_field"));
		email.clear();
		Thread.sleep(2000);
		email.sendKeys("xyz@gmail.com");
		WebElement pwd=driver.findElement(By.id("password_field"));
		pwd.clear();
		pwd.sendKeys("abc");
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		click1.click();
        
		Thread.sleep(1000);
		System.out.println("login unsuccess with invalid credential");
		//return email1;
	}
	
	
}
