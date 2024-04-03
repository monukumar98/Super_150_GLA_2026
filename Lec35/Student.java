package Lec35;

public class Student {
	private String name = "Raj";
	private int age = 18;

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return this.name;
//	}

	// constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// constructor
	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

}
