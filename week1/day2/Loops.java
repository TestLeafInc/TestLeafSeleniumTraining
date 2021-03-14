package week1.day2;

public class Loops {

	public static void main(String[] args) {
		
		// I am reading excel -> 3 test data -> all data
		// which loop should I use? for (iteration)
		
		// Browser -> loading a page -> page is keep loading
		// when it is fully loaded, click the button
		// while(browserLoaded == true || maxTime > 30)
		// if -> condition 
		// I want to run same code multiple times !!
		
		// First time i will check whether is image is loaded
		// if it is loaded, continue to next code
		// else, continue to wait
		boolean imageLoaded = false;
		do {
			// check if the image is loaded => imageLoaded
		}while(imageLoaded);
		
		
		
		// i = 1 (Starting point)
		// i = 10 (Ending point)
		// i++ ->  will be incremented by one at a time 
		// We are planning to run selenium tests for different data
		// When I running on friday, I will stop when I reach 5 rounds !!
		int day = 3; // day 1 -> Monday
		/*for (int i = 1; i <= 10; i++) {
			if(day == 5 && i > 5) {
				break; // break is keyword to come out of the loop !!
			}
			System.out.println("Running the round: "+i);
		} */
		
		/*boolean browserLoaded = true;
		int maxTime = 0;
		while(!browserLoaded || maxTime < 30) {
			System.out.println("I am waiting");
			maxTime = maxTime + 5;
		}*/
		
		boolean raining = true;
		
		// Minimum -> 0 iteration
		while(!raining) {
			System.out.println("I am running");
			raining = true;
		} 
		
		// Minimum -> 1 iteration
		do {
			System.out.println();
		}while(!raining);
		
		
		
		
		
		
		
		
		

	}

}
