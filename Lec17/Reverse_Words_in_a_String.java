package Lec17;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  a good    example  ";

	}

	public static String reverseWords(String s) {
		s = s.trim();
		String[] arr = s.split("\s+");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		return ans.trim();

	}

}
