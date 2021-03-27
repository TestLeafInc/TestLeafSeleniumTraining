package week3.day1;


// Partially implemented class + Design to implement by concrete class
// May have unimplemented methods and hence
// Abstract class does not allow you to create object

public abstract class PartialHouse {

	public void buildKitchen() {
		System.out.println("Modular Kitchen ready");
	}
	
	public void buildLivingRoom() {
		System.out.println("Modern Living Room ready");
	}
	
	public abstract void buildRoof();
	
}
