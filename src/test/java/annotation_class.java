import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation_class {

	@Test
	public void m1()
	{
		System.out.println("i am your TestNG method");
	}
	
	@BeforeSuite
	public void m2()
	{
		System.out.println("this is m2 before suite");
	}
	
	@AfterSuite
	public void m3()
	{
		System.out.println("this is m3 after suite");
	}
	
	@BeforeTest
	public void m4()
	{
		System.out.println("this is m4 before test");
	}
	
	@AfterTest
	public void m5()
	{
		System.out.println("this is m5 after test");
	}
	
	@BeforeClass
	public void m6()
	{
		System.out.println("this is m6 before class");
	}
	
	@AfterClass
	public void m7()
	{
		System.out.println("this is m7 after class");
	}
	
	@BeforeMethod
	public void m8()
	{
		System.out.println("this is m8 before method");
	}
	
	@AfterMethod
	public void m9()
	{
		System.out.println("this is m9 after method");
	}
	
	@Test
	public void m10()
	{
		System.out.println("this is m10 test");
	}
}
