package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// List -> Dynamic Array 
		// List -> Interface -> You cannot create an object
		// Hold data that can grow or shrink !! 
		// It allows to hold duplicate data
		// Implementation class -> ArrayList (Index) , LinkedList (Next, Prev)
		
		// Generic -> Stores the type of allowed data in the given data structure
		List<String> learners = new ArrayList<String>();
		
		// Methods 
		/*
		 * size -> how many items are there in the list -> int
		 * add -> add a new item to the list (by default it will add to the last) 
		 * remove -> remove given index or data from the list (if there are multiple, removes first)
		 * get -> retrieve the specific item using index -> Generic value
		 * contains -> find whether given item is present or not -> boolean
		 */
		
		learners.add("Sherin");
		learners.add("Nirmal");
		learners.add("arun");
		learners.add("Priyanga");
		learners.add("Nirmal");

		
		System.out.println(learners.size());
		
		learners.add(0, "Uma");
		
		// Sort the list
		Collections.sort(learners);
		Collections.reverse(learners);
		
		// Remove Nirmal
		//learners.remove("uma");
		learners.set(0, learners.get(0)+" Kumar");
		

		for (String eachLearner : learners) {
			System.out.println(eachLearner);
		}
		
		
		
		
		
		

	}

}
