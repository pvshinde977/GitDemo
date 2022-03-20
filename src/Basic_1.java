import org.testng.annotations.Test;

public class Basic_1 {
	
	// Running TC using Java methods/ class

	/*public static void main(String[] args) {

		System.out.println("Hello World");	
	     }
	}*/

	//Running TC using TestNG method

	@Test(timeOut=4000)
	public void Demo()
	   {
		System.out.println("Hello World");
	   }

	@Test(enabled=false)
	public void Demo1()
	   {
		System.out.println("Hello World - Demo1");
	   }

	}

