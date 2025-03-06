package Lec69;

public class Avengers_End_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 7 };
		int n=1000;
		System.out.println(Count(arr, n));

	}

	public static int Count(int[] arr, int n) {
		int l = arr.length;
		int ans = 0;
		for (int i = 1; i < (1 << l); i++) {
			if (count_set(i) % 2 == 0) {
				ans = ans - Count_Divisible(arr, i, n);
			} else {
				ans = ans + Count_Divisible(arr, i, n);
			}
		}
		return ans;

	}

	private static int Count_Divisible(int[] arr, int i, int n) {
		// TODO Auto-generated method stub
		int p = 1;
		int idx = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				p *= arr[idx];
			}
			idx++;
			i >>= 1;
		}
		return n / p;
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
