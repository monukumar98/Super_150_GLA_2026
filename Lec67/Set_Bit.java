package Lec67;

public class Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int idx = 4;
		System.out.println(isSetBit(n, idx));

	}

	public static boolean isSetBit(int n, int idx) {

		int mask = (1 << idx);
		if ((n & mask) != 0) {
			return true;// set hai
		} else {
			return false;// set nhi hai
		}

	}

}
