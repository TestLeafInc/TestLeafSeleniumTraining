package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Set -> Dynamic Array 
		// Set -> Interface -> You cannot create an object
		// Hold data that can grow or shrink !! 
		// It allows to hold unique data (No duplicates allowed)
		// Implementation class -> HashSet, LinkedHashSet, TreeSet
		
		/*
		 * HashSet -> Hashing algorithm (Java internally create hashing value for each key)
		 * LinkedHashSet -> Maintains the order of adding (like List)
		 * TreeSet -> Uses Comparator -> ASCII value 
		 * 
		 */
		
		// Generic -> Stores the type of allowed data in the given data structure
		Set<String> learners = new LinkedHashSet<String>();
		
		// Methods 
		/*
		 * size -> how many items are there in the list -> int
		 * add -> add a new item to the list (by default it will add to the last) 
		 * remove -> remove given index or data from the list (if there are multiple, removes first)
		 * contains -> find whether given item is present or not -> boolean
		 * 
		 * No get method for the Set !!
		 * 
		 */
		
		System.out.println("Sowmya".hashCode());
		System.out.println("Annapoorani".hashCode());

		learners.add("Sowmya");
		learners.add("Annapoorani");
		learners.add("Chitra");
		learners.add("Dinesh");
		learners.add("Janani");
		learners.add("Chitra");

		System.out.println(learners.size());
		
		//learners.remove("Chitra");
		System.out.println(learners.contains("Chitra"));
		for (String eachLearner : learners) {
			System.out.println(eachLearner);
		}
		
		
		

	}

}
