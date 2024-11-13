package Lec56;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(Minimum_Diff(boys, girls, 0, 0));

	}

	public static int Minimum_Diff(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 6666666;
		}
		int sel = Math.abs(boys[i] - girls[j]) + Minimum_Diff(boys, girls, i + 1, j + 1);
		int rej = Minimum_Diff(boys, girls, i, j + 1);
		return Math.min(sel, rej);
	}
}
