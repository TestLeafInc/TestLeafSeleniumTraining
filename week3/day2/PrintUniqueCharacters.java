package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		
		String companyName = "testleaf";
		
		/*
		 * 1) Convert String into character array
		 * 2) Add them to the Set
		 * 3) If it is duplicate, you don't do anything
		 * 4) Print
		 * 
		 * int -> Integer
		 * char -> Character
		 * boolean -> Boolean
		 * 
		 */
		char[] allChar = companyName.toCharArray();
		Set<Character> unique = new HashSet<Character>();
		for (int i = 0; i < allChar.length; i++) {
			if(unique.add(allChar[i])) {
				System.out.print(allChar[i]);
			}
		}
		

	}

}
