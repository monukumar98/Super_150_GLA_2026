package Lec46;

public class Pair<K, V> {
	K x;
	V y;

	public Pair(K x, V y) {
		this.x = x;
		this.y = y;

	}

	public Pair() {

	}

	public static void main(String[] args) {
		Pair<Boolean, Integer> p = new Pair<>();
		Pair<Long, Character> p1 = new Pair<>();
		Pair<Boolean, Character> p2 = new Pair<>();
		

	}

}
