package Lec2;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = 0;
		int star = n;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// next row Prep
			row++;
			star--;
			space += 2;// space = space+2;
			System.out.println();

		}

	}

}
