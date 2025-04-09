package Lec76;

public class Kth_Smallest_Product_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { -4, -2, 0, 3 };
		int[] nums2 = { 2, 4 };
		int k = 6;
	}

	public static long Kth_Smallest_Product(int[] nums1, int[] nums2, int k) {
		long lo = -1000_000_0001l;
		long hi = 1000_000_0001l;
		long ans = 0;
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (countproduct(nums1, nums2, mid) >= k) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	private static long countproduct(int[] nums1, int[] nums2, long dot_pro) {
		// TODO Auto-generated method stub
		long ans = 0;
		for (int e1 : nums1) {
			int c = 0;
			int lo = 0;
			int hi = nums2.length - 1;
			if (e1 >= 0) {
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if ((long) e1 * nums2[mid] <= dot_pro) {
						c = mid + 1;
						lo = mid + 1;
					} else {
						hi = mid - 1;
					}

				}
				ans = ans + c;
			} else {
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if ((long) e1 * nums2[mid] <= dot_pro) {
						c = nums2.length - mid;
						hi = mid - 1;

					} else {
						lo = mid + 1;
					}

				}
				ans = ans + c;
			}
		}
		return ans;
	}
}
