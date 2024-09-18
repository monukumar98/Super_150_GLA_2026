package Lec50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };
		int [] ans=Intersection(nums1, nums2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] Intersection(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (!map.containsKey(nums1[i])) {
				map.put(nums1[i], 1);
			} else {
				map.put(nums1[i], map.get(nums1[i]) + 1);
			}
		}
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if(map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
				ll.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int [] ans = new int [ll.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=ll.get(i);
		}
		return ans;
	}
}
