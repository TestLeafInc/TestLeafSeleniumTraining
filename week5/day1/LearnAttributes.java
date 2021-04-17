package testng.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority = -1)
	public void createLead() {
		System.out.println("Create Lead");

	}
	
	@Test(priority = 1, enabled=false)
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test(priority = 2)
	public void deleteLead() {
		System.out.println("Delete Lead");

	}
	
	

}
