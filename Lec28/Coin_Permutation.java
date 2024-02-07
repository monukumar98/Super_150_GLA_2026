package Lec28;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 3, 5 };
		int amount = 6;

	}

	public static void Coin_Changes(int[] coins, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coins.length; i++) {
			if (amount >= coins[i]) {
				Coin_Changes(coins, amount - coins[i], ans + coins[i]);
			}
		}
	}
}
