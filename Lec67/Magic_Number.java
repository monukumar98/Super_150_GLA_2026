package Lec67;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;

		Nth_Number(n);
	}

	public static void Nth_Number(int n) {
		int mul = 5;
		int sum = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				sum += mul;
			}
			n >>= 1;
			mul = mul * 5;
		}
		System.out.println(sum);

	}
}
