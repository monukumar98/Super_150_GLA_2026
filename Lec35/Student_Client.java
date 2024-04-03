package Lec35;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student("kaju", 21);
//		System.out.println(s2.name);
//		s2.age = 90;
		s2.setName("Kamlesh");
		System.out.println(s2.getName());
		
	}

}
