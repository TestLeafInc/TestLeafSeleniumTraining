package week3.day1;

public class Lunch {
	
	/*
	 * Within the same class, you have more than 1 method
	 * - with same signature
	 * - with different input arguments
	 * - can be by number of arguments or data type of arguments
	 * 
	 * What is real purpose?
	 * Simplify the verbose 
	 * 
	 * This will be known when you code itself !! Compile time polymorphism
	 * 
	 */
	
	public String bringLunch() {
		return "Variety Rice";
	}
	
	public String bringLunch(String type) {
		if(type.equalsIgnoreCase("potluck"))
			return "Chicken Briyani";
		else
			return "Curd Rice";
	}

}
