package Lec46;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 30, 40, 50 };
		Display(arr);
		String[] arr1 = { "Raj", "Raju", "Ankit", "Ankita", "Amit", "Kunal" };
		Display(arr1);
	}

	public static <T>void Display(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}
