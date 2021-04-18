package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCases {
	
	@Test
	public void login() {
		System.out.println("login");

	}
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();

	}
	
	@Test
	public void editLead() {
		System.out.println("edit Lead");
		throw new NoSuchElementException();
	}

	@Test
	public void deleteLead() {
		System.out.println("delete Lead");

	}
	
	@Test
	public void duplicateLead() {
		System.out.println("duplicate Lead");

	}
	
	@Test
	public void mergeLead() {
		System.out.println("merge Lead");

	}
	
	
	

}
