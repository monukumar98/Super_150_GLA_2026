package Lec28;

import java.util.*;

public class two_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ans = new ArrayList<>();
		ans.add(new ArrayList<>());
		ans.add(new ArrayList<>());
		ans.add(new ArrayList<>());
		ans.get(1).add(-9);
		ans.get(1).add(91);
		System.out.println(ans);
		System.out.println(ans.get(1).get(0));

	}

}
