package week1.day2;

public class Question1 {
	
	/*
	 * Given any number, print the following
	 * If the number is divisible by 3 -> print "fizz"
	 * If the number is divisible by 5 -> print "bizz"
	 * If the number is divisible by 3 & 5 -> print "fizzbizz"
	 * Else do nothing
	 * 
	 * -5 , 0 
	 * 
	 * 13 -> 3 or 5 -> will not print anything
	 * 10 -> 5 -> bizz
	 * 9  -> 3 -> fizz
	 * 15 -> 3 & 5 -> fizzbizz
	 * 
	 * Psuedocode
	 * 1) Take one of the number (int) -> negative, positive
	 * 2) if -> 3 & 5 first , else if either 3 or 5 else do nothing 
	 * 
	 * 
	 */
	 public static void main(String[] args) {
		 
		 int input = -11;
		 
		 if(input%15 == 0) {
			 System.out.println("fizzbizz");
		 } else if(input%3 == 0) {
			 System.out.println("fizz");
		 } else if(input%5 == 0) {
			 System.out.println("bizz");
		 } 
		 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
