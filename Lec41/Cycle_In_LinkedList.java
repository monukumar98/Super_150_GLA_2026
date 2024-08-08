package Lec41;

public class Cycle_In_LinkedList {
	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

// O(1)
	public void addFirst(int item) {
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
	public void addLast(int item) {
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

	public void createCycle() throws Exception {
		Node nn = GetNode(2);
		tail.next = nn;
	}

	public Node HasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

//O(N^2)
	public void Removecycle1() {
		Node meet = HasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

//O(N)
	public void Removecycle2() {
		Node meet = HasCycle();
		if (meet == null) {
			return;
		}
		// cycle ki length
		int c = 1;
		Node temp = meet;
		while (temp.next != meet) {
			c++;
			temp = temp.next;
		}
		// fast ko M ahead move kra denge
		Node fast = head;
		for (int i = 0; i < c; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void floyedCycle() {
		Node meet = HasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_In_LinkedList cl = new Cycle_In_LinkedList();
		cl.addLast(10);
		cl.addLast(20);
		cl.addLast(30);
		cl.addLast(40);
		cl.addLast(50);
		cl.addLast(60);
		cl.addLast(70);
		cl.addLast(80);
		cl.createCycle();
		cl.Display();

	}
}
