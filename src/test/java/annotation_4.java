import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotation_4 {

	@Test
	public void abc()
	{
		System.out.println("this is abc test method");
	}
	@Test
	public void Abc1()
	{
		System.out.println("this is Abc1 test method");
	}
	
	@BeforeSuite
	
	public void abc1()
	{
		System.out.println("this is abc1 Before suite method");
	}
	
   @BeforeSuite
	
	public void Abc11()
	{
		System.out.println("this is Abc11 Before suite method");
	}
	
   @BeforeMethod
	
	public void abc12()
	{
		System.out.println("this is abc12 Before method");
	}

   @AfterMethod
	
  	public void abc123()
  	{
  		System.out.println("this is abc123 After method");
  	}
}
