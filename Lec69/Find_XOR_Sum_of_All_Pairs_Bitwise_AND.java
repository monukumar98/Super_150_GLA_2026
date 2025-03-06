package Lec69;

public class Find_XOR_Sum_of_All_Pairs_Bitwise_AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 6, 5 };
		int xor1 = Xor_Array(arr1);
		int xor2 = Xor_Array(arr2);
		System.out.println(xor1 & xor2);

	}

	public static int Xor_Array(int[] arr1) {
		int x = 0;
		for (int v : arr1) {
			x ^= v;
		}
		return x;
	}

}
