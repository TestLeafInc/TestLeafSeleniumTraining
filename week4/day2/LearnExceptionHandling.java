package week4.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z;

		int[] num = { 10, 20, 30 }; // indices 0,1,2

		try {
			z = x / y;
			System.out.println(z);
			try {
				System.out.println(num[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of the program");
	}

}
