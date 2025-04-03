package Lec74;

public class Subarray_Sums_Divisible_by_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 6 };

	}

	public static int Divisible_by_N(int[] arr) {
		long sum = 0;
		int k = arr.length;
		int[] freq = new int[k];
		freq[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			int rem = (int) (sum % k);
			if (rem < 0) {
				rem += k;
			}
			freq[rem]++;
		}
		int ans = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= 2) {
				int x = freq[i];
				ans += (x * (x - 1)) / 2;
			}
		}
		return ans;

	}
}
