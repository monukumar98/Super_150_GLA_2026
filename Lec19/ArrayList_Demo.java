package Lec19;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		// add
		ll.add(10);
		ll.add(20);
		ll.add(105);
		ll.add(-10);
		System.out.println(ll);
		ll.add(1, 3);
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));
		// remove
		System.out.println(ll.remove(2));
		System.out.println(ll);
		// set
		ll.set(1, -30);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
        // for_each
		for(int v:ll) {
			System.out.print(v+" ");
		}
	}

}








