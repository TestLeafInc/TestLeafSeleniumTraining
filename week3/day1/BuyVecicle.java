package week3.day1;

public class BuyVecicle {

	public static void main(String[] args) {
		
		BMW myCar = new BMW();
		myCar.openSunRoof();// BMW
		myCar.turnAC(); 	// Car
		myCar.applyBrake(); // BMW 
		//myCar.applyABS();   // ABS
		
		BajajAuto myAuto = new BajajAuto();
		myAuto.startUsingHandStart(); // Auto
		myAuto.fillGas(); // Bajaj
		myAuto.applyBrake(); // Vehicle

	}

}
