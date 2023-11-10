package Lec16;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str1 == str3);
		System.out.println(str1 == str2);
		System.out.println(str4 == str3);
		System.out.println(str1);
		// str1 = str3 + "bye";
		// str1 = str1 + "bye";
		str3 = str1 + "bye";

		String s1 = "Kaju" + "kamlesh";

		System.out.println(str1);

	}

}
