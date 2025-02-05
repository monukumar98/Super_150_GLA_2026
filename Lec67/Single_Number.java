package Lec67;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 5, 4, 2 };
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		System.out.println(ans);
	}

}
