package Lec46;

public class Abstract_Demo_1_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo_1 ab = new Abstract_Demo_1();
//		ab.Payment();
		
//		Payment_Method p = new Payment_Method();
//		p.Payment();
//		p.GetBal();
//		p.viewBal();
		Abstract_Demo_1 ab = new Abstract_Demo_1() {

			@Override
			public boolean Payment() {
				// TODO Auto-generated method stub
				return false;
			}

		};
		Abstract_Demo_1 ab1 = new Abstract_Demo_1() {
			
			@Override
			public boolean Payment() {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
	}

}
