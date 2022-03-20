import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic_3 {
	
	// Running TC using Java methods/ class

	/*public static void main(String[] args) {

		System.out.println("Hello World");	
	     }
	}*/

	//Running TC using TestNG method

	@Test
	public void Demo5()
	   {
		System.out.println("Hello World - Basic_3");
	   }

	@Test(dataProvider="getData")
	public void Demo6(String username, String password)
	   {
		System.out.println("Hello World - Demo1 - Basic_3");
		System.out.println(username);
		System.out.println(password);
	   }
	
	@BeforeTest
	public void Demo9()
	   {
		System.out.println("Execute First");
	   }
	
	@DataProvider
	public Object[] getData()
	{
		//1st Combination = Username & PWD -- Good Credit History
		//2nd Combination = Username & PWD -- No Credit History
		//3rd Combination = Username & PWD -- Fraud Credit History
		
		Object[][] data = new Object[3][2];
		//1st Set
		data [0][0] = "FirstUsername";
	    data [0][1] = "FirstPassword";

	    //2nd Set
	    data [1][0] = "SecondUsername";
	    data [1][1] = "SecondPassword";
	    
	  //3rd Set
	    data [2][0] = "ThirdUsername";
	    data [2][1] = "ThirdPassword";
	    return data;
	}
	
	@AfterTest
	public void Demo10()	   
	{
		System.out.println("Execute Last");
	}
	
}

