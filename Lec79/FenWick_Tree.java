package Lec79;

import java.util.Scanner;

public class FenWick_Tree {

	long[] BIT;
	int n;

	public FenWick_Tree(int n) {
		// TODO Auto-generated constructor stub
		BIT = new long[n + 1];
		this.n = n;
	}

	public void update(int val, int idx) {
		while (idx <= n) {
			BIT[idx] += val;
			idx += (idx & -idx);// 
		}
	}

	public long query(int idx) {
		long ans = 0;
		while (idx > 0) {
			ans += BIT[idx];
			idx -= (idx & -idx);//
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		FenWick_Tree ft = new FenWick_Tree(n);
		for (int i = 0; i < arr.length; i++) {
			ft.update(arr[i], i + 1);
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(ft.query(r) - ft.query(l - 1));
		}
	}

}
