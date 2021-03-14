package week1.day1;

public class Airplane {
	
	// Actions -> applyBrake , takeLeft, turnHeadLight, turnAC !! 
	/*
	 * 4 Pillars 
	 * 
	 * 1) Access Modifier - public, private, protected, default/package
	 * 2) Return Type (output)  - primitive data type / Class / void -> not to return anything
	 * 3) Method Name  - Name of the method (meaningful name -> verbNoun)
	 * 4) Input Argument -> Input to your method (0/1/...) -> Primitive/class
	 * 
	 * last one -> logic !!
	 * 
	 */
	
	public void applyBrake(String brakeType) {
		System.out.println("The brake with type "+brakeType+" applied");
	}
	
	public boolean takeLeft() {
		return true;
	}
	
	public String getFlightName() {
		return "Boeing";
	}
	
	/*Mobile class

	write 3 methods
	one method with void as return type -> syso
	method 2 -> should return boolean
	method 3 -> should return String */
	
	/*
	 * 4 Access Modifiers for a method / variable:
	 * 
	 *  public		: Anyone can access (within or outside the project)
	 *  private 	: Only within the class alone can access 
	 *  protected	: Others within the same package can access 
	 *  			  or inherited members can access
	 *  default / package : Others within the same package can access 
	 *  
	 *  2 Access Modifiers for a class
	 *  
	 *  public 		: Anyone can access
	 *  default		: Only member of the same package can access
	 * 
	 */
	
	 /*
	  * public 	- profile / name / blood group 
	  * package - posts, photo, status
	  * private	- password / dob 
	  * protected - dob, activities, mobile number
	  * 
	  */
	
	/*
	  * public 		- common area, mini hall, door bell, lift, security
	  * package 	- Gym, Swimming pool, terrace, car park, play area 
	  * private		- keys / bedroom
	  * protected 	- credit card / mobile / 
	  * 
	  */
	
	/*
	 * Input argument -> Zero or multiple argument
	 * primitive data type or it can be class
	 * 
	 * add numbers -> what you need as input? 
	 * 1) How many inputs? 2 inputs -> data type and number of inputs
	 * 2) What data type? int / long / float / double 
	 * 
	 * 2 input, both are int !! -> add 2 numbers -> int as return type
	 * 3,4 -> 7 (int)
	 * 3.2f, 4.5f -> 7.7f(float)
	 * 
	 * did you eat? do you need input from me? (zero argument)
	 * what will you return -> boolean 
	 * 
	 * Assume, you have 2 cars with you and 2 different color !! 
	 * what is color of your car? -> Do you need an input?
	 * What input will you ask me?  which car?  Model / brand 
	 * What will you return? Color -> String 
	 * 
	 * What was your previous project name? (Assume you worked on multiple)
	 * Do you need more input? 1, 2, 3 (int)
	 * What will you return back to me? String -> Name of the project
	 * "Automax" 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	

}
