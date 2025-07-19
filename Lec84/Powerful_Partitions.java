package Lec84;

import java.util.Scanner;

public class Powerful_Partitions {
	static long mod = 1000_000_007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		long total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total_sum += arr[i];
		}
		System.out.println(Partitions(arr, k, 0, 0, total_sum));
	}

	public static long Partitions(int[] arr, int k, int i, long sum, long total_sum) {
		if (i == arr.length) {
			if (sum > k && total_sum - sum > k) {
				return 1;
			}
			return 0;

		}
		long x = Partitions(arr, k, i + 1, sum + arr[i], total_sum) % mod;
		long y = Partitions(arr, k, i + 1, sum, total_sum) % mod;
		return (x + y) % mod;
	}
}
