package Lec19;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		// Auto-Boxing
		int b = 9;
		Integer b1 = 90;
		b1 = b;
		// Un-Boxing
		Integer c = 89;
		int c1 = -7;
		c1 = c;

		Integer e1 = 78;
		Integer e2 = 78;
		Integer e3 = 178;
		Integer e4 = 178;
		System.out.println(e1 == e2);
		System.out.println(e3 == e4);

	}

}
