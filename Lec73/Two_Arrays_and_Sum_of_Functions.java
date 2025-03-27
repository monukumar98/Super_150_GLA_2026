package Lec73;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Two_Arrays_and_Sum_of_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		int mod = 998244353;
		for (int i = 0; i < a.length; i++) {
			long x = sc.nextLong();
			a[i] = (x * (i + 1) * (n - i));
		}
		Integer[] b = new Integer[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);// inc
		Arrays.sort(b, Collections.reverseOrder());// dec
		long ans = 0;
		for (int i = 0; i < b.length; i++) {
			ans = (ans + (a[i] % mod * b[i])) % mod;
		}
		System.out.println(ans);
	}

}
