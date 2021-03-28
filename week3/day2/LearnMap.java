package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
	
		// Dictionary
		// Keyword (Key) -> Meaning (Value)
		// Key is always unique
		// Value can be duplicate 
		// Map is a data structure that stores key-value pair
		// Map -> Interface -> Cannot create object
		// It requires implementation class -> HashMap, LinkedHashMap, TreeMap
		
		/*
		 * HashMap -> Hashing algorithm -> ordered by the hash value
		 * LinkedHashMap -> Order of insertion 
		 * TreeMap -> Order based on comparator -> ASCII
		 */
		
		// Methods
		
		/*
		 * size -> It returns the number of entries (Entry -> Key : Value)
		 * put -> add the entry to the map
		 * remove -> remove the entry from the map based on the key
		 * containsKey -> returns whether key is present or not -> boolean 
		 * 
		 */
		
		
		Map<String, String> trains = new HashMap<String, String>();
		trains.put("06795", "MS TPJ EXPRESS");
		trains.put("05120", "RMM FESTIVL SPL");
		trains.put("08496", "BBS RMM SPL");
		trains.put("06865", "MS TJ SPL");
		
		System.out.println(trains.size());
		System.out.println(trains.containsKey("05121"));
		
		// I wanted to check by train name 
		System.out.println(trains.containsValue("MS TJ SPL"));
		trains.put("06865", "SBC TJ SPL");
		
		// Wanted to check how many SPL trains are available !!
		/*
		 * 1) Get all the key value pairs (map) -> entrySet
		 * 2) From each entry -> get the value
		 * 3) Check if the value contains 'SPL'
		 * 4) If yes, count it !!
		 * 5) Finally print the count
		 */
		
		System.out.println(trains.get("06865"));
		int count = 0;
		System.out.println(trains.entrySet());
		for (Entry<String, String> eachTrain : trains.entrySet()) {
			if(eachTrain.getValue().contains("SPL")) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		

	}

}
