package week1.day2;

import java.util.Arrays;

public class SortNumbers {
	
	public static void main(String[] args) {
		
		// Find the first missing number in the array
		// Input {8,6,5,4,2,1,3} => sort
		// Find the missing number -> 7
		
		int[] input = {8,6,5,4,2,1,3};
		Arrays.sort(input);
		//System.out.println(Arrays.toString(input));
		for (int i = 0; i < input.length; i++) {
			if(input[i]+1 != input[i+1]) {
				System.out.println("The missing number is "+(input[i]+1));
				break;
			}
		}
		
		// Find the smallest valued duplicate number
		// int[] numbers = {2,5,3,7,2,7,2,1};

	}

}
