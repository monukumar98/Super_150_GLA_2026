package Lec36;

public class Stack {
	private int[] arr;
	private int idx;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return idx == 0;
	}

	public boolean isfull() {
		return arr.length == idx;
	}

	public int size() {
		return idx;
	}

	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Bklol Stack full hai");
		}
		arr[idx] = item;
		idx++;

	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol Stack Empty hai");
		}
		idx--;
		return arr[idx];
	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol Stack Empty hai");
		}
		return arr[idx - 1];
	}

	public void Display() {
		for (int i = 0; i < idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}



