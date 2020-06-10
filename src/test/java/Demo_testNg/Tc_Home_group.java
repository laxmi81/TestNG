package Demo_testNg;
import org.testng.annotations.Test;

public class Tc_Home_group {

	@Test(groups="sanity")
	public void TC_Home_01()
	{
		System.out.println("Tc_Home_01 executed");
	}
	@Test(groups="regression")
	public void TC_Home_02()
	{
		System.out.println("Tc_Home_02 executed");
	}
}
