package Lec5;

public class Fun_Demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println(val);
	}

	public static int Add(int a, int b) {
		int c = a + b;
		int x = sub(a, c);
		int val = 90;
		Fun_Demo_3.val = Fun_Demo_3.val + 5;
		return x + c;

	}

	public static int sub(int a, int b) {
		return a - b;
	}
}
