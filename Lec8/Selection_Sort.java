package Lec8;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 5, 1, 7, 3 };
		System.out.println(Min_Value_Index(arr, 1));

	}

	public static void Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = Min_Value_Index(arr, i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}

	public static int Min_Value_Index(int[] arr, int i) {

		int mini = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[mini]) {
				mini = j;
			}
		}
		return mini;
	}

}
