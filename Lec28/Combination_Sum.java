package Lec28;

import java.util.*;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 6, 7 };
		int amount = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Coin_Changes(coin, amount, ll, 0, ans);
		System.out.println(ans);

	}

	public static void Coin_Changes(int[] coins, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			// System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}

		for (int i = idx; i < coins.length; i++) {
			if (amount >= coins[i]) {
				ll.add(coins[i]);
				Coin_Changes(coins, amount - coins[i], ll, i, ans);
				ll.remove(ll.size() - 1);
			}
		}
	}

}
