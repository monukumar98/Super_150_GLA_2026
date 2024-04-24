package Lec40;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode kh =headA;
			ListNode vgkh=headB;
			while(kh!=vgkh) {
				if(kh==null) {
					kh=headB;
				}
				else {
					kh=kh.next;
				}
				if(vgkh==null) {
					vgkh=headA;
				}
				else {
					vgkh=vgkh.next;
				}
				
			}
			return vgkh;

		}
	}
}









