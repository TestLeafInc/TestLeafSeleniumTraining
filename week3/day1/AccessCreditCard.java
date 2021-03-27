package week3.day1;

public class AccessCreditCard {

	public static void main(String[] args) {
		
		CreditCard access = new CreditCard();
		System.out.println(access.getCreditCardNumber());
		access.setCreditCardNumber("1111 1111 1111 1111");
		System.out.println(access.getCreditCardNumber());
	}

}
