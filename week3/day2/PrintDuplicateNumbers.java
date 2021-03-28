package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {
	
	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * 1) Add every element into Set
		 * 2) If it is already there in the Set -> Print duplicate
		 * 
		 */
		
		Set<Integer> unique = new HashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			if(!unique.add(data[i])) {
				System.out.println("It is duplicate "+data[i]);
			}
		}
		
		
		
		// Time Complexity: O(n2) -> Brute Force approach
		/*for (int i = 0; i < data.length; i++) { // 1 pass
			for (int j = i+1; j < data.length; j++) { // 2 pass
				if(data[i] == data[j]) {
					System.out.println("The duplicate number is "+data[i]);
					break;
				}
			}
		}*/
		
	}

}
