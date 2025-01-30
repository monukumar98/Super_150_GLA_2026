package Lec66;

import java.util.Scanner;



public class Maximum_Weight_Node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] edges = new int[n];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = sc.nextInt();
		}
		System.out.println(Maximum_Weight(n, edges));
	}

	public static int Maximum_Weight(int n, int[] edges) {
		int[] Weight = new int[n];
		for (int i = 0; i < n; i++) {
			if (edges[i] != -1) {
				Weight[edges[i]] += i;
			}
		}
		int ans = Integer.MIN_VALUE;
		int node = -1;
		for (int i = 0; i < Weight.length; i++) {
			if (ans <= Weight[i]) {
				ans = Weight[i];
				node = i;
			}
		}
		return node;
	}

}
