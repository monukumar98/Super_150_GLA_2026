package Lec70;

import java.util.Scanner;

public class Day_at_the_Beach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(partition(arr));
	}

	public static int partition(int[] arr) {
		int n = arr.length;
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.min(right[i + 1], arr[i]);
		}
		int leftmax = Integer.MIN_VALUE;
		int c = 0;
		for (int i = 0; i < n - 1; i++) {
			leftmax = Math.max(leftmax, arr[i]);
			if (leftmax <= right[i + 1]) {
				c++;
			}
		}
		return c + 1;

	}
}
