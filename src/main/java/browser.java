import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

	public static WebDriver driver;
	public static void setup() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	 driver=new org.openqa.selenium.chrome.ChromeDriver();
	 //driver.get(path);
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	}
	public static void tear_down()
	{
		driver.quit();
	}
	public static void login_credential(String email1,String pwd1) throws Exception
	{
		String path="http://qa-tekarch.firebaseapp.com";
		driver.get(path);
		WebElement email=driver.findElement(By.id("email_field"));
		email.clear();
		Thread.sleep(2000);
		email.sendKeys(email1);
		WebElement pwd=driver.findElement(By.id("password_field"));
		pwd.clear();
		pwd.sendKeys(pwd1);
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		click1.click();

		Thread.sleep(1000);
		System.out.println("login success with valid credential");
		return;
	}
}
