package Lec10;

public class Kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 146;
		int k = 3;
		System.out.println(kthroot(n, k));

	}

	public static int kthroot(int n, int k) {
		int lo = 0;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

}
