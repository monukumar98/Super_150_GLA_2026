package Lec31;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		PrimeSieve(n);

	}
// false mtlb prime 
//  true mtlb not prime	

	public static void PrimeSieve(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// not prime
		prime[1] = true;// not prime
		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == false) {// prime
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = true;
				}
			}
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i+" ");
			}
		}
	}
}
