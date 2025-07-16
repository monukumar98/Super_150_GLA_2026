package Lec84;

import java.io.*;

public class Student_Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "Kaju";
		s.age = 17;
		String file = "/Users/codingblocks/Desktop/output.txt";
		FileOutputStream f = new FileOutputStream(file);
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(s);
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Student s1 = (Student) oi.readObject();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		

	}

}

class Student {//implements Serializable {
	String name;
	int age;
}
