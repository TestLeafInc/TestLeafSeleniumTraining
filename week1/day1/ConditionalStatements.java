package week1.day1;

public class ConditionalStatements {

	public static void main(String[] args) {
	
		int regNumber = 4000;
		
		// Audi -> 1234 => Red , BMW -> 4567 -> White , Ferrari -> 1001 -> Gray, 
		// Hyundai -> 4000 -> Red , MG -> 5005 -> Black !!
		if(regNumber == 1234 || regNumber == 4000) // Compare operator
			System.out.println("Red");
		else if(regNumber == 4567)
			System.out.println("White");
		else if(regNumber == 1001)
			System.out.println("Gray");
		else
			System.out.println("Black");
		
		// Expected print -> Red
		// Arithmetic Operations
		// + (add)   - (sub) * (multiply)  / (division -> quotient)
		// remainder % (mod)
		// 12 % 5 ->  2 

	}

}
