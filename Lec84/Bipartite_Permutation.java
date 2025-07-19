package Lec84;

import java.util.Scanner;

public class Bipartite_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int rem=n%4;
		if(rem==0 || rem==3) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}

	}

}
