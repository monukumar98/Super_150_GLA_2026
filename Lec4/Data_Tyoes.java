package Lec4;

public class Data_Tyoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 0.9;
		float f = 9.7f;
		boolean b = true;
		boolean b1 = false;
		char ch = 'A';
		System.out.println((int) (ch));
		ch++;// ch = (char)(ch+1)
		System.out.println(ch);
		// ch = ch + 1;
		ch += 1;// ch = (char)(ch+1)
//		for (byte i = 0; i < 128; i++) {
//			System.out.println(i);
//		}

//		for (byte i = 0; i <= 127; i++) {
//			System.out.println(i);
//		}
		for (byte i = 0; i < 127; i++) {
			System.out.println(i);
		}
	}

}
