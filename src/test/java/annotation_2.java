import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotation_2 {

	/*@BeforeSuite
	public void m1()
	{
		System.out.println("this is m1 before suite");
	}
	
	@Test
	public void m2()
	{
		System.out.println("this is m2 test");
	}
	
	@AfterTest
	public void m3()
	{
		System.out.println("this is m3 after test");
	}
	
	@BeforeClass
	public void m4()
	{
		System.out.println("this is m4 before class");
	}
	
	@AfterClass
	public void m5()
	{
		System.out.println("this is m5 after class");
	}
	*/
	@Test
	public void A1m1()
	{
		System.out.println("this is A1m1 test");
	}
	
	@Test
	public void am1()
	{
		System.out.println("this is am1 test");
	}
	
	@Test
	public void a1m1()
	{
		System.out.println("this is a1m1 test");
	}
	
}
