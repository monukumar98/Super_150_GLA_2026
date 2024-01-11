package Lec23;

public class SubSeqnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n"+Count(ques, ""));
		
		// System.out.println(count);
	}

	public static int Count(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch = ques.charAt(0);
		int a = Count(ques.substring(1), ans);// no
		int b = Count(ques.substring(1), ans + ch);// yes
		return a + b;
	}

	// static int count = 0;

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			// count++;
			return;
		}
		char ch = ques.charAt(0);
		print(ques.substring(1), ans);// no
		print(ques.substring(1), ans + ch);// yes
	}

}
