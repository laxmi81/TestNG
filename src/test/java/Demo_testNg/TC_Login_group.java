package Demo_testNg;
import org.testng.annotations.Test;

public class TC_Login_group {

	@Test(groups="sanity")
	public void Tc_Login_01()
	{
		System.out.println("Tc_Login_01 executed");
	}
	@Test(groups="regression")
	public void Tc_Login_02()
	{
		System.out.println("Tc_Login_02 executed");
	}
	@Test
	public void Tc_Login_03()
	{
		System.out.println("Tc_Login_03 executed");
	}
}
