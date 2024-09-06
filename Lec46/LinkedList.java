package Lec46;

public class LinkedList<T> {
	class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

// O(1)
	public void addFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

//O(1)
	public void addLast(T item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

//O(N)
	public void addatindex(int k, T item) throws Exception {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}

	// O(1)
	public T getFirst() {
		return head.val;
	}

	// O(1)
	public T getLast() {
		return tail.val;
	}

	// O(N)
	public T getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	// O(1)
	public T removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;
	}

	// O(N)
	public T removelast() throws Exception {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = GetNode(size - 2);
			T rv = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return rv;
		}

	}

	// O(N)
	public T removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node curr = GetNode(k);
			Node prev = GetNode(k - 1);
			prev.next = curr.next;
			curr.next = null;
			return curr.val;

		}
	}

	public Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k range me do");
		}

		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Raj");
		ll.addLast("Ankit");
		ll.addLast("Shivam");
		ll.Display();
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.addLast(7);
		ll1.addLast(17);
		ll1.addLast(70);
		ll1.Display();
	}
}














