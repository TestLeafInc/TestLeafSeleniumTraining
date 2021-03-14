package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// Problem Statement
		// Given a string, reverse the string
		// Example: testleaf -> faeltset
		
		// Psuedocode
		// How to each charcter -> character array
		// Loop through every character from the right to left
		// concatenate each character inside the loop
		// finally, print !!
		
		String input = "testleaf"; // index ->0 , lastIndex -> 8-1 => 7
		// 7 -> 6 => 5 => 4 ... 0
		// How to convert to character array
		char[] everyChar = input.toCharArray();		
		for (int i = everyChar.length-1; i >= 0; i--) {
			System.out.print(everyChar[i]);
		}
		
		
		

	}

}
