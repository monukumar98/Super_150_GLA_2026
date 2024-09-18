package Lec50;

import java.util.*;

public class HAshSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(2);
		set.add(12);
		set.add(21);
		set.add(3);
		set.add(-45);
		set.add(12);
		System.out.println(set);
//		// contains
//		System.out.println(set.contains(5));
//		System.out.println(set.contains(3));
//		// remove
//		System.out.println(set.remove(5));
//		System.out.println(set.remove(3));
//		System.out.println(set);
//		for (int v : set) {
//			System.out.print(v + " ");
//		}
//		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(2);
		set1.add(12);
		set1.add(21);
		set1.add(3);
		set1.add(-45);
		set1.add(12);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(2);
		set2.add(12);
		set2.add(21);
		set2.add(3);
		set2.add(-45);
		set2.add(12);
		System.out.println(set2);
	}

}
