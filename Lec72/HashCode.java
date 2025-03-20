package Lec72;

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple";
		System.out.println(HashFun(str));

	}

	public static long HashFun(String str) {
		int p = 31;
		int pow = 1;
		long hv = 0;
		int mod = 1000_000_007;
		for (int i = 0; i < str.length(); i++) {
			hv = (hv + ((str.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			pow = (pow * p) % mod;
		}
		return hv;

	}

}
