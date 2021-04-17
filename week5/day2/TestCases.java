package testng.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCases {

	@Test
	public void createLead() {
		System.out.println("Create Lead");
	//	throw new NoSuchElementException();

	}

	@Test(dependsOnMethods = "testng.day2.TestCases.createLead")
	public void editLead() {
		System.out.println("edit Lead");

	}

	@Test(dependsOnMethods = { "testng.day2.TestCases.createLead", "testng.day2.TestCases.editLead" })
	public void deleteLead() {
		System.out.println("delete Lead");

	}

}
