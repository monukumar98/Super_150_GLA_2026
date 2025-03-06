package Lec69;

public class Bitwise_XOR_of_All_Pairings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 1, 3 };
		int[] arr2 = { 10, 2, 5, 0 };

	}

	public static int Bitwise_XOR(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		if (n % 2 == 0 && m % 2 == 0) {
			return 0;
		}
		int xor1 = Xor_Array(arr1);
		int xor2 = Xor_Array(arr2);
		if (n % 2 != 0 && m % 2 != 0) {
			return xor1 ^ xor2;
		} else if (n % 2 == 0) {
			return xor1;
		}
		return xor2;
	}

	public static int Xor_Array(int[] arr1) {
		int x = 0;
		for (int v : arr1) {
			x ^= v;
		}
		return x;
	}

}
