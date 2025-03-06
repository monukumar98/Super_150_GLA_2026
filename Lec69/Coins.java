package Lec69;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] coin = { 0.30, 0.60, 0.80 };
		System.out.println(probability(coin, 0, (coin.length+1)/2));
	}

	public static double probability(double[] p, int idx, int h) {
		if (h == 0) {
			return 1;
		}
		if (idx == p.length) {
			return 0;
		}

		double ans = p[idx] * probability(p, idx + 1, h - 1) + (1 - p[idx]) * probability(p, idx + 1, h);
		return ans;
	}

}
