package Lec83_Strategy_Pattern;

public class ShoppingCart_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoppingcart cart = new Shoppingcart();
		cart.SetPaymentStrategy(new Card_Payment());
		cart.checkout(1000);
		cart.SetPaymentStrategy(new PaypalPayment());
		cart.checkout(1000);

	}

}
