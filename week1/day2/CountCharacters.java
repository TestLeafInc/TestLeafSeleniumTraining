package week1.day2;

public class CountCharacters {

	public static void main(String[] args) {
		// Find the count of given character in the String
		// Input String -> "testleaf"
		// Input character -> 'e'
		// Output -> how many 'e' available in testleaf -> 2 
		
		String input = "cognizant";
		char ch = 'e';
		int count = 0;
		
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ch) {
				count = count+1;
			}
		}
		System.out.println(count);
		

	}

}
