import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basic_4 {
	
	// Running TC using Java methods/ class

	/*public static void main(String[] args) {

		System.out.println("Hello World");	
	     }
	}*/

	//Running TC using TestNG method
	@AfterClass
	public void afterclass()
	   {
		System.out.println("Will Execute after each class");
	   }
	
	@BeforeClass
	public void beforeclass()
	   {
		System.out.println("Will Execute before each class");
	   }

	@AfterMethod
	public void Demo14()
	   {
		System.out.println("Will Execute after each method");
	   }
	
	@AfterSuite
	public void Demo12()
	   {
		System.out.println("I am After Suite .i.e No 1 from Last");
	   }

	@Test
	public void Demo7()
	   {
		System.out.println("Hello World - Basic_4");
	   }

	@Test(groups={"Smoke"})
	public void Demo8()
	   {
		System.out.println("Hello World - Demo1 - Basic_4");
	   }
	
	@Test(groups={"Smoke"})
	public void Demo15()
	   {
		System.out.println("Hello World - Demo15 - Basic_4");
	   }
	@Test
	public void Demo16()
	   {
		System.out.println("Hello World - Demo16 - Basic_4");
	   }
	
	@BeforeSuite
	public void Demo11()
	   {
		System.out.println("I am Before Suite .i.e No 1");
	   }
	
	@BeforeMethod
	public void Demo13()
	   {
		System.out.println("Will Execute before each method");
	   }


	}

