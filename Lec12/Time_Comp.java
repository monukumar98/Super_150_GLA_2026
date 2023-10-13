package Lec12;

public class Time_Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000_000; i++) {
//
//		}
		int n = 768686;
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(n)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// log(N) base 2
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// log(N) base 2
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N)) base 6
			n /= 2;
			n /= 3;
		}
		int k = 2;
		while (i <= n) {
			System.out.println("Hey");
			// O(N/K)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) base k
			i *= k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			// O(sqrt(N))
			System.out.println("hey");
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			// O(log(N))
			System.out.println("hey");
		}
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					// (O(N^2)(log(n))
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				// (O(N(log(N))
				System.out.println("hey");
			}
		}
	}

}
