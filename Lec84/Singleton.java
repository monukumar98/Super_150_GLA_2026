package Lec84;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
//	// Eager
//	private static Singleton s = new Singleton();
//
//	private Singleton() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static Singleton getSingleton() {
//		return s;
//	}

//	// Lazy
//	private static Singleton s;
//
//	private Singleton() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static Singleton getSingleton() {
//		if (s == null) {
//
//			s = new Singleton();
//		}
//
//		return s;
//	}
	// synchronized
//	private static Singleton s;
//
//	private Singleton() {
//	// TODO Auto-generated constructor stub
//}
//
//	synchronized public static Singleton getSingleton() {
//		if (s == null) {
//
//			s = new Singleton();
//
//		}
//		return s;
//	}

	// synchronized

	private volatile static Singleton s;

	private Singleton() {
		// TODO Auto-generated constructor stub
		if (s != null) {
			throw new UnsupportedOperationException("Bklol constructor private hai");
		}
	}

	public static Singleton getSingleton() {
		if (s == null) {
			synchronized (Singleton.class) {
				if (s == null) {
					s = new Singleton();
				}
			}
		}
		return s;
	}

	public Object readResolve() {
		return s;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// return super.clone();
		return s;

	}

	// Bill PUGH

//	private Singleton() {
//		// TODO Auto-generated constructor stub
//	}
//
//	private static class Singleton_Create {
//		private static final Singleton s = new Singleton();
//	}
//
//	public static Singleton getSingleton() {
//		return Singleton_Create.s;
//	}
}









