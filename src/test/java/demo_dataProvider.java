import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo_dataProvider {
 
	@BeforeMethod
	public void enter() throws Exception
	{
		browser.setup();
	}
	
	@AfterMethod
	public void settingUrl()
	{
		/*if(browser.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed());
		{
		WebDriverWait wait=new WebDriverWait(browser.driver,30);
		wait.until((ExpectedConditions.visibilityOf(browser.driver.findElement(By.id("email_field")))));
		
		}*/
		browser.tear_down();
	}
	
	@Test(dataProvider="data_usernameandpassword")
	public void valid_credential(String username,String password) throws Exception
	{
		browser.login_credential(username,password);
		System.out.println(username+"\t"+password);
	}
	/*
	@Test(priority=2)
	public void invalid_credential() throws Exception
	{
		browser.login_credential("abc@gmail.com","abc");
	}*/
	@DataProvider(name="data_usernameandpassword")
	public Object[][] usernameandpassword_dp()
	{
		return new Object[][] {{"admin123@gmail.com","admin123"},{"abc@gmail.com","abc"},{"sdfsd","sddsf"}};
	}
	
}
