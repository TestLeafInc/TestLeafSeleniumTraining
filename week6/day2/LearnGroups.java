package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups="smoke")
	public void login() {
		throw new NoSuchElementException();

	}
	
	@Test(groups= {"smoke"})
	public void createLead() {
		System.out.println("Create Lead");

	}
	
	@Test(groups="functional",dependsOnGroups="smoke")
	public void editLead() {
		System.out.println("edit Lead");

	}

	@Test(groups="regression",dependsOnGroups="smoke")
	public void deleteLead() {
		System.out.println("delete Lead");

	}
	
	@Test(groups= {"functional","regression"},dependsOnGroups="smoke")
	public void duplicateLead() {
		System.out.println("duplicate Lead");

	}
	
	@Test(groups="smoke")
	public void mergeLead() {
		System.out.println("merge Lead");

	}
	
	
	

}
