package Lec17;

public class SubString_LengthWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "helol";
		SubString(s);
	}

	public static void SubString(String str) {
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				System.out.println(str.substring(i, j));

			}
		}
	}

}
