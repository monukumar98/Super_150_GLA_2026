package Lec22;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 4, 6, 7, 3, 4, 5, 6, 7, 4 };
		int item = 4;
		System.out.println(Indxe(arr, item, 0));
	}

	public static int Indxe(int[] arr, int item, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return Indxe(arr, item, idx + 1);
	}
}
