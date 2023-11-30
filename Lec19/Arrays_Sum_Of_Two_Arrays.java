package Lec19;

import java.util.ArrayList;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 0, 2, 9 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

	}

	public static void Sum_Of_Two_Arrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> ll = new ArrayList<>();
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = carry + arr1[i] + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {
			int sum = carry + arr1[i];
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
		}
		while (j >= 0) {
			int sum = carry + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry > 0) {
			ll.add(carry);
		}
		for (int k = ll.size() - 1; k >= 0; k--) {
			System.out.print(ll.get(i) + ", ");
		}
		System.out.println("END");

	}
}
