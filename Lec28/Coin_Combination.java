package Lec28;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 3, 5 };
		int amount = 6;
		Coin_Changes(coin, amount, "", 0);

	}

	public static void Coin_Changes(int[] coins, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < coins.length; i++) {
			if (amount >= coins[i]) {
				Coin_Changes(coins, amount - coins[i], ans + coins[i], i);
			}
		}
	}

}
