package Lec79;

import java.util.Scanner;

public class Moving_Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < v.length; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				long dx = x[i] - x[j];
				long dv = v[i] - v[j];
				if (dv == 0 || dx * dv >= 0) {
					ans += Math.abs(dx);
				}
			}
		}
		System.out.println(ans);
	}

}

