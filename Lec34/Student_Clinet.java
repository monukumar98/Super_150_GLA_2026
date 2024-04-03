package Lec34;

public class Student_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Student s = new Student();
		s.name = "kaju";
		s.age = 19;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "kunal";
		s1.age = 22;
		s1.Intro_yourSelf();
		s1.SayHey("Raju");
		Student.Mentor_Name();
		// s1.Mentor_Name();

	}

	static {
		System.out.println("In Main Method");
	}

}
