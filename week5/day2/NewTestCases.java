package testng.day2;

import org.testng.annotations.Test;

public class NewTestCases {
	//packageName.ClassName.methodName
	@Test(dependsOnMethods = {"testng.day2.TestCases.createLead"})
	public void duplicateLead() {
		System.out.println("duplicate lead");

	}
	
	@Test
	public void mergeLead() {
		System.out.println("merge lead");

	}

}
