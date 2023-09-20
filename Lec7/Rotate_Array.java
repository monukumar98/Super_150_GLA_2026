package Lec7;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
	}

	public static void Rotate(int[] arr, int k) {
		k = k % arr.length;
		int item = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = item;
	}
}
