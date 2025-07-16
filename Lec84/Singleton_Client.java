package Lec84;

import java.io.*;

import java.lang.reflect.*;



public class Singleton_Client {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, ClassNotFoundException, CloneNotSupportedException {
		// TODO Auto-generated method stub
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
//		Singleton s4 = new Singleton();
		Singleton s1 = Singleton.getSingleton();
//		Singleton s2 = Singleton.getSingleton();
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		Constructor<Singleton> singleton = Singleton.class.getDeclaredConstructor();
//		singleton.setAccessible(true);
//		Singleton s = singleton.newInstance();
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
		String file = "/Users/codingblocks/Desktop/output.txt";
		FileOutputStream f = new FileOutputStream(file);
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(s1);
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Singleton s2 = (Singleton) oi.readObject();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Singleton s3=(Singleton) s1.clone();
		System.out.println(s3.hashCode());
	}

}






