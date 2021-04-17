package testng.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LTTestCase extends BaseClass{
	
	@Test
	  public void test2() {
		  
		  System.out.println("test2");
		  
	  }
	
	@BeforeMethod
	public void preCondition() {
		System.out.println("preCondition");

	}

}
