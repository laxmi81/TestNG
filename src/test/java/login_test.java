
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class login_test extends browser {
 
	@BeforeMethod
	public void enter() throws Exception
	{
		browser.setup();
	}
	
	@AfterMethod
	public void exit()
	{
		browser.tear_down();
	}
	
	@Test(priority=1)
	public void valid_credential() throws Exception
	{
		browser.login_credential("admin123@gmail.com","admin123");
	}
	
	@Test(priority=2)
	public void invalid_credential() throws Exception
	{
		browser.login_credential("abc@gmail.com","abc");
	}
}
