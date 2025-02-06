package Lec68;

import java.util.Scanner;

public class Preparing_Olympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static void Print(int[] arr, int l, int r, int x) {
		int n = arr.length, count = 0;
		for (int i = 0; i < (1 << n); i++) {// 1* 2^N
			if (Fast_Count_Set(i) >= 2 && isitpossible(arr, l, r, x, i)) {
				count++;
			}
		}
		System.out.println(count);

	}

	private static boolean isitpossible(int[] arr, int l, int r, int x, int i) {
		// TODO Auto-generated method stub
		int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				sum += arr[pos];
				min = Math.min(min, arr[pos]);
				max = Math.max(max, arr[pos]);
			}
			i >>= 1;
			pos++;
		}
		return sum >= l && sum <= r && max - min >= x;

	}

	public static int Fast_Count_Set(int n) {
		int c = 0;
		while (n > 0) {
			n = (n & (n - 1));
			c++;
		}
		return c;
	}
}
