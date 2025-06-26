package Lec83_Strategy_Pattern;

public class Shoppingcart {
	PaymentStrategy p;

	public void SetPaymentStrategy(PaymentStrategy p) {
		this.p = p;
	}

	public void checkout(int amount) {
		if (p == null) {
			throw new UnsupportedOperationException("Bklol PaymentStrategy set kr");
		}
		p.pay(amount);
	}

}
