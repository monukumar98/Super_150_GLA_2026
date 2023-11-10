package Lec16;

public class Sub_String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hellocghfhkjhlkjk";

		System.out.println(s.substring(2, 7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 3));// ?
		SubString(s);
	}

	public static void SubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}

		}
	}

}
