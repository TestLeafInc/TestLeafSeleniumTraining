package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,7,11,15};
		int target = 8;
		
		// Added to the map each value
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		// I traversed again, to find the difference and check in the map 
		for (int i = 0; i < nums.length; i++) {
	        int diff = target - nums[i];
	        if (map.containsKey(diff) && map.get(diff) != i) {
	            System.out.println( i +" "+ map.get(diff));
	            break;
	        }
	    }
		
	}
}
