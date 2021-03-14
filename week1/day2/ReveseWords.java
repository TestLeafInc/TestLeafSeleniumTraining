package week1.day2;

import java.util.Iterator;

public class ReveseWords {
	
	public static void main(String[] args) {
		
		String company = "Amazon Development Center"; 
		// Amazon
		// Development
		// Center
		// Center Development Amazon
		
		/*
		 * Psuedocode:
		 * 
		 * 1) Convert the given String into words
		 * 2) traverse from right to left
		 * 3) keep printing with white space between them 
		 * 
		 */
		
		// Convert the given String into words
		String[] words = company.split(" ");
		
		// Traverse from right to left
		for (int i = words.length-1; i >= 0 ; i--) {
			System.out.print(words[i]+" ");
		}
		
		
	}

}
