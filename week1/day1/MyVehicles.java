package week1.day1;

public class MyVehicles {

	/*
	 * Main method is the entry point for java execution
	 * Any code you write inside main method -> will get executed
	 * public -> access modifier 
	 * static -> create single memory in Java 
	 * void -> return type
	 * main -> method name
	 * String[] args -> input arguments
	 */
	public static void main(String[] args) {
		// How to access other classes -> you are trying to call your school mate?
		// Store the number in the phone (your memory) -> call or sms or whatsapp 
		// Syntax 1: Create reference to that class (saving to the memory)
		// Syntax: ClassName reference = new ClassName();
		Airplane myFlight = new Airplane(); 
		// Send SMS to him stating that you will call him tomorrow
		// Syntax 2: Call the method of that class using the reference
		// Syntax: reference.methodName();
		myFlight.applyBrake("Back");
		boolean isLeft = myFlight.takeLeft();
		System.out.println(isLeft);
		String flightName = myFlight.getFlightName();
		System.out.println(flightName);
		System.out.println("^^^^^^^^^^^^^^^^^");
		// How to access variables 
		// Create reference, call variable
		Car myCar = new Car();
		boolean isNewCar = myCar.isNewCar;
		System.out.println(isNewCar);
		System.out.println(myCar.run);
		
		
	}
	
	/*	-> Call Mobile class
		-> Create a main method
		-> Within main method,
			Call each of the 3 methods and print the values */

}








