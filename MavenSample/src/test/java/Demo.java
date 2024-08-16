import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Beforeclass...");

	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Afterclass...");

	}
	@Before
	public void before() {
		System.out.println("Before...");

	}
	@After
	public void after() {
		System.out.println("Before...");

	}
	@Test
	public void tc1() {
		
		System.out.println("Test1...");
	}
	@Test
	public void tc2() {
		
		System.out.println("Test2...");
	}

}
