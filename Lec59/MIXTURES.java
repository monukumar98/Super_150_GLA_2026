package Lec59;

public class MIXTURES {
	public static void main(String[] args) {
		int[] arr = { 40, 60, 20, 10 };
		System.out.println(mini_smoke(arr, 0, arr.length - 1));
	}

	public static int mini_smoke(int[] arr, int si, int ei) {
		if (si == ei) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int i = si; i < ei; i++) {
			int f = mini_smoke(arr, si, i);
			int l = mini_smoke(arr, i + 1, ei);
			int sm = colors(arr, si, i) * colors(arr, i + 1, ei);
			ans = Math.min(ans, f + l + sm);
		}
		return ans;
	}

	private static int colors(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int k = si; k <= ei; k++) {
			sum = sum + arr[k];
		}
		return sum % 100;
	}
}
