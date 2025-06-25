package Lec80;

import java.util.*;

public class Moving_Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pair[] arr = new Pair[n];
		for (int i = 0; i < arr.length; i++) {
			int x = sc.nextInt();
			arr[i] = new Pair(x, 0);

		}
		for (int i = 0; i < arr.length; i++) {
			int v = sc.nextInt();
			arr[i].v = v;

		}
		// same speed wale ko same group me put kr do
		HashMap<Integer, List<Integer>> samespeed = new HashMap<>();
		for (Pair p : arr) {
			if (!samespeed.containsKey(p.v)) {
				samespeed.put(p.v, new ArrayList<>());
			}
			samespeed.get(p.v).add(p.x);
		}
		long ans = 0;

		for (Integer speed : samespeed.keySet()) {
			List<Integer> ll = samespeed.get(speed);
			Collections.sort(ll);
			long prefix = 0;

			for (int i = 0; i < ll.size(); i++) {
				ans += ((long) ll.get(i)) * i - prefix;
				prefix = prefix + ll.get(i);
			}

		}
		// System.out.println(ans);
		// System.out.println(samespeed);
		// remove duplicate speed
		Set<Integer> speed = samespeed.keySet();

		List<Integer> sortedspeed = new ArrayList<>(speed);
		Collections.sort(sortedspeed);
		HashMap<Integer, Integer> speed_with_index = new HashMap<>();

		for (int i = 0; i < sortedspeed.size(); i++) {
			speed_with_index.put(sortedspeed.get(i), i + 1);
		}
//		System.out.println(speed_with_index);
		Arrays.sort(arr, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.x - o2.x;
			}

		});
		FenWick_Tree ftx = new FenWick_Tree(n);
		FenWick_Tree ftsum = new FenWick_Tree(n);
		for (Pair p : arr) {
			int idx = speed_with_index.get(p.v);
			long coutX = ftx.query(idx - 1);
			long prefixsum = ftsum.query(idx - 1);
			ans = ans + ((p.x * coutX) - prefixsum);
			ftx.update(1, idx);
			ftsum.update(p.x, idx);

		}
		System.out.println(ans);

	}

	static class Pair {
		int x;
		int v;

		public Pair(int x, int v) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.v = v;
		}
	}

	static class FenWick_Tree {

		long[] BIT;
		int n;

		public FenWick_Tree(int n) {
			// TODO Auto-generated constructor stub
			BIT = new long[n + 1];
			this.n = n;
		}

		public void update(int val, int idx) {
			while (idx <= n) {
				BIT[idx] += val;
				idx += (idx & -idx);//
			}
		}

		public long query(int idx) {
			long ans = 0;
			while (idx > 0) {
				ans += BIT[idx];
				idx -= (idx & -idx);//
			}
			return ans;
		}
	}

}
