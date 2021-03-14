package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		String mentor1 = "Sheriba";
		String mentor2 = "Divya";
		String mentor3 = "Bowya";
		String mentor4 = "Naveen";
		String mentor5 = "Kruthi";

		// Array -> Can store similar data under one variable
		String[] mentors = {"Sheriba", "Divya","Bowya", "Naveen", "Kruthi"};
		System.out.println(mentors.length);
		
		/*for (int i = 0; i < mentors.length; i++) {
			System.out.println(mentors[i]);
		}*/
		Arrays.sort(mentors);
		for (String eachMentor : mentors) {
			System.out.println(eachMentor);
		}
		
		
		// Array work by the index -> starts at 0
		//System.out.println(mentors[2]);
		
		// Limitation: You should declare the size upfront!!
		// You cannot increase or decrease the size of array later
		String[] courses = new String[14]; 
		courses[0] = "Selenium"; // Assigned value for the first index
		courses[1] = "Rest API Automation";
		courses[2] = "Microservices Automation";
		// Other index -> default value as null
		//System.out.println(courses[4]);
		

	}

}






