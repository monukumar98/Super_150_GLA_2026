package Lec5;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 371;
		System.out.println(Is_Armstrong_Number(n));
	}

	public static boolean Is_Armstrong_Number(int n) {
		int c = Countofdigit(n);
		int sum = 0;
		int p = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}

	}

	public static int Countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
