package Lec53;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zero = Climbing_Stairs(arr, 0);
		int one = Climbing_Stairs(arr, 1);
		System.out.println(Math.min(zero, one));

	}

	public static int Climbing_StairsBU(int[] arr) {
		int [] dp = new int[arr.length];
		dp[0]=arr[0];
		dp[1]=arr[1];
		for (int i = 2; i < dp.length; i++) {
			int s = dp[i-1];
			int f =dp[i-2];
			dp[i]= Math.min(s, f) + arr[i];
		}
		return Math.min(dp[dp.length-2], dp[dp.length-1]);
	}

	public static int Climbing_Stairs(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}

		int s = Climbing_Stairs(arr, i + 1);
		int f = Climbing_Stairs(arr, i + 2);
		return Math.min(s, f) + arr[i];

	}

}
