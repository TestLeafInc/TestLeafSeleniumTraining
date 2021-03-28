package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfCharacters {

	public static void main(String[] args) {
		
		String desiredCompany = "Amazon Development Center";
		
		// You need to find the count of each character 
		// A -> 1
		// m -> 2
		// a -> 1
		// o -> 2
		
		/*
		 * psuedocode
		 * 
		 * 1) Convert String to character array
		 * 2) Add the character to the map with default value as 1 
		 * 3) If it is already existing, increment the value -> get the existing value + 1
		 * 4) Finally print the character and count
		 * 
		 */
		
		/*
		char[] chArray = desiredCompany.toCharArray();
		Map<Character, Integer> countCharacters = new HashMap<Character, Integer>();
		for (int i = 0; i < chArray.length; i++) {
			if(countCharacters.containsKey(chArray[i])) {
				countCharacters.put(chArray[i], countCharacters.get(chArray[i])+1 );
			}else {
				countCharacters.put(chArray[i], 1);
			}
		}*/
		
		char[] chArray = desiredCompany.replace(" ", "").toCharArray();
		Map<Character, Integer> countCharacters = new HashMap<Character, Integer>();
		for (int i = 0; i < chArray.length; i++)
			countCharacters.put(chArray[i],countCharacters.getOrDefault(chArray[i], 0)+1);
		
		System.out.println(countCharacters);
		
		// default -> 0 + 1 
		// already -> get the value + 1
		
		// put -> add an entry to the map
		// 
		
		

	}

}
