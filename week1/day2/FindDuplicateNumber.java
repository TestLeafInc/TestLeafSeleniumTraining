package week1.day2;

import java.util.Arrays;

public class FindDuplicateNumber {

	// Monday to Thursday -> 1 hour -> 7 to 8 PM IST 
	public static void main(String[] args) {
		
		int[] numbers = {2,5,3,7,4,7,4,1};
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == numbers[i+1]) {
				System.out.println("Duplicate number "+numbers[i]);
				break;
			}
		}

	}

}
