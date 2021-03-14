package week1.day2;

public class GetAllNumbers {

	public static void main(String[] args) {
		
		String sentence = "Amazon has 11412 employees at chennai";
		// I wanted to get only the numbers here. => 11412
		System.out.println(sentence.replaceAll("[^0-9]", "")); 
		// What need to be deleted? ->
		// anything which is not a number to be deleted
		// How to find which ones are not number -> regular expression
		// ---->  \\D or [^0-9]
		

	}

}
