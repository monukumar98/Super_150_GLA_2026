package Lec34;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {

		System.out.println(this.name + " say hey " + name);
	}

	public  static void Mentor_Name() {
		System.out.println("Mentor name xyz");
	}
	static {
		System.out.println("I am in static block");
	}

}
