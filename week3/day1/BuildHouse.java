package week3.day1;

public class BuildHouse {

	public static void main(String[] args) {
		
		// Wanted to create an object
		// ClassName obj = new ClassName();
		// House build = new House();
		/*MyHouse build = new MyHouse();
		build.getAddress();
		build.getNumberOfBedRooms();
		System.out.println(build.baseColor); */
		
		//PartialHouse build = new PartialHouse();
		BuildNewHouse build = new BuildNewHouse();
		build.buildLivingRoom();
		build.buildKitchen();
		build.buildRoof();
		

	}

}
