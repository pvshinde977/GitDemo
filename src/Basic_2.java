import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic_2 {
	
	// Running TC using Java methods/ class

	/*public static void main(String[] args) {

		System.out.println("Hello World");	
	     }
	}*/

	//Running TC using TestNG method

	@Test(dependsOnMethods= {"Demo4"})
	public void Demo3()
	   {
		System.out.println("Hello World - Basic_2");
	   }
	}

