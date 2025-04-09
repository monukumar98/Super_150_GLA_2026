package Lec76;

public class Check_if_Number_is_a_Sum_of_Powers_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 27;
		System.out.println(checkPowersOfThree(n));

	}

	public static boolean checkPowersOfThree(int n) {
		while (n > 0) {
			if (n % 3 > 1) {
				return false;
			}
			n = n / 3;
		}
		return true;
	}

}
