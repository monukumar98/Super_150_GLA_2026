package Lec83_Strategy_Pattern;

public class Card_Payment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub

		System.out.println("Card Number CVV EXP DATE");
	}

}
