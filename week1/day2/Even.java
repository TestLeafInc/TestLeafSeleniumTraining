package week1.day2;

public class Even {

	public static void main(String[] args) {
		
		Even even = new Even();
		even.printEvenOrOdd(100, false);

	}
	
	public void printEvenOrOdd(int max, boolean even) {
		for (int i = 1; i <= max; i++) {
			if(i%2 == 0 && even) {
				System.out.println("The even number is "+i);
			} else {
				System.out.println("The odd number is "+i);
			}
		}
	}
	

}
