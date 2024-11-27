package Lec60;

public class Maximum_Sum_Of_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 5, 6, 8, 2, 6, 8, 9, 2, 1, 3 };
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));

	}

	public static int Maximum_Sum(int[] arr, int k) {
		int ans = 0, sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// grow
			sum -= arr[i - k];// shrink
			ans = Math.max(ans, sum);

		}
		return ans;

	}

}
