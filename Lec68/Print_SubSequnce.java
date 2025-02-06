package Lec68;

public class Print_SubSequnce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Print(s);
	}

	public static void Print(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {// 1* 2^N
			Pattern(s, i);

		}

	}

	private static void Pattern(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(s.charAt(pos));

			}
			i >>= 1;
			pos++;
		}
		System.out.println();

	}
}
