package Lec84;

import java.util.Scanner;

public class Powerful_Partitions2 {
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
		if (total_sum <= 2 * k) {
			System.out.println(0);
			return;
		}
		System.out.println(Partitions(arr, k));
	}

	private static long Partitions(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		long total_subset = power(2, n);
		long sub = Sum_Up_to_K(arr, k, n);
		long ans = (total_subset - (2 * sub) % mod + mod) % mod;
		return ans;
	}

	private static long Sum_Up_to_K(int[] arr, int k, int n) {
		// TODO Auto-generated method stub
		long[] dp = new long[k + 1];
		for (int i = 0; i < n; i++) {
			for (int j = k; j >= arr[i]; j--) {
				dp[j] = (dp[j] + dp[j - arr[i]]) % mod;
			}
		}
		long ans=0;
		for(long v:dp) {
			ans= (ans+v)%mod;
		}
		return ans;
	}

	public static long power(int a, int n) {
		if (n == 0) {
			return 1;
		}
		long x = power(a, n / 2) % mod;
		x = (x * x) % mod;
		if ((n & 1) != 0) {
			x = (x * a) % mod;
		}

		return x;
	}
}
