package week3.day1;

public interface House {
	
	// Variable
	public static String baseColor = "White";
	
	// Method -> Interface methods cannot have body (the implementation)
	// 100% abstract 
	public int getNumberOfBedRooms();
	
	// Address
	public String getAddress();
	
	// Interface cannot have constructor and hence
	// You cannot create an object for the interface !!
	
	
	// Exception: From Java 8, default methods are allowed with implementation !!
	// We will learn this week 8.
	
	

}
