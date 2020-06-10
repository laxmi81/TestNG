import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class annotation_3 {

	@BeforeSuite
	public void z1()
	{
		System.out.println("this is z1 before suite");
	}
	
	@BeforeClass
	public void z2()
	{
		System.out.println("this is z2 before class");
	}
	
	@BeforeTest
	public void z3()
	{
		System.out.println("this is z3 before test");
	}
	
	@BeforeMethod
	public void z4()
	{
		System.out.println("this is z4 before method");
	}
}
