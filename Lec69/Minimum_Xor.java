package Lec69;

public class Minimum_Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 125;
	}

	public static int find_X(int a, int b) {
		int c = count_set(b);
		int ans = 0;
		for (int i = 31; i >= 0 && c > 0; i--) {
			if ((a & (1 << i)) != 0) {
				ans = ans + (1 << i);
				c--;
			}

		}
		for (int i = 0; i <=31 && c > 0; i++) {
			if ((a & (1 << i)) == 0) {
				ans = ans + (1 << i);
				c--;
			}
			
		}
		return ans;
	}

	public static int count_set(int b) {
		int c = 0;
		while (b > 0) {
			b = (b & (b - 1));
			c++;
		}
		return c;
	}
}
