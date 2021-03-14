package week1.day2;

public class LearnString {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * String can be created by 2 ways
		 * 1) Using object
		 * 2) Using literal (like variables) 
		 * 
		 * Difference: to do with memory allocation
		 * 
		 */
		
		String title = "Leaftaps";
		String username = "demosalesmanager";
		String dropdownOption = "Marketing";
		
		
		// What a class can have? (Members of the class)
		/*
		 * 1) Methods
		 * 2) Variables
		 * 3) Constructor
		 * 
		 */
		
		// 11 Methods -> Essential automation 
		// String -> class -> concatenation of characters -> '1' , '2', 'a'
		/*
		 * 1) How many characters are available in a String?
		 * Method: length() -> int 
		 * 2) To convert the String to character array
		 * Method: toCharArray() -> char[]
		 * 3) To find whether given character/string exist or not?
		 * Method: contains('e') -> boolean  
		 * 4) Convert to upper or lowercase
		 * Methods: toLowerCase() -> String with all lowercase
		 * toUpperCase() -> String to uppercase
		 * 5) first index of the given character 
		 * indexOf('e') -> index starting from 0
		 * lastIndexOf()
		 * 
		 * 6) find the character that is present in the index 
		 * charAt(0) -> the character is living in the given index
		 * 
		 * 7) Compare 2 string -> equals, starts-with, ends-with
		 * String is immutable !! Hence == does not work for comparison
		 * equals -> return boolean 
		 * equalsIgnoreCase -> compare without case sensitivity\
		 * startsWith -> comparing starting text
		 * endsWith -> comparing ending text
		 * contains -> compare any text within full String
		 * 
		 * 8) Replace given character or String with another
		 * replace -> replace the given character or String with another
		 * replaceAll -> replace the pattern
		 * 
		 * 9) Split the given string by specific delimiter
		 * split("delimiter") -> return String[]
		 * 
		 * 10) Convert String to Integer
		 * Integer.parseInt("") -> number -> int
		 * 
		 * 11) Find the value of other data type from String
		 * String.valueOf()
		 */
		
		// String name = new String("TestLeaf $");
		String name = "TestLeaf $#";
		/*System.out.println(name.length());
		System.out.println(name.contains("k"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf("ea")); // if it does not -> -1
		System.out.println(name.lastIndexOf("es")); // if it does not -> -1
		*/
		//System.out.println(name.charAt(1));
		// I want to print the last character
		// What you need to find first? find the length -> length()
		// character at length()-1
		
		int lastIndex = name.length()-1;
		//System.out.println(name.charAt(lastIndex));
		
		String myPreviousCompany = "TestLeaff"; // TestLeaves // f -> ves
		String presentCompany = "TestLeaf Software";
		if(presentCompany.startsWith(myPreviousCompany)) {
			//System.out.println("I worked for only one org/company");
		} else {
			//System.out.println("You have switched companies");
		}
		
		//System.out.println(myPreviousCompany.replace("f", "ves"));
		
		String sentence = "I am learning Java well so far";
		String[] split = sentence.split(" ");
		System.out.println(split.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// when it is array -> length as property 
		// when it is String -> length() as method
		System.out.println(Integer.parseInt("91234"));
		// getText -> String -> 
		
		boolean isPuncture = true;
		System.out.println(String.valueOf(isPuncture));
		
		
		
	}

}
