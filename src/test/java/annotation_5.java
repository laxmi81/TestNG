import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotation_5 {
 
	@BeforeSuite
	public void abc()
	{
		System.out.println("this is abc before suite method");
	}
	
	@AfterSuite
	public void xyz()
	{
		System.out.println("this is xyz after suite method");
	}
	@Test(priority=1)
	public void ab1()
	{
		System.out.println("this is ab1 test method");
	}
	
	@Test(priority=7)
	public void Ab1()
	{
		System.out.println("this is Ab1 test method");
	}
	
	@Test
	public void Abc1()
	{
		System.out.println("this is Abc1 test method");
	}
	
	@Test//(priority=1)
	public void Abc()
	{
		System.out.println("this is Abc test method");
	}
}
