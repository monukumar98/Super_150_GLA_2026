package Lec39;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addLast(7);
		ll.addatindex(2, 90);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getatindex(2));
		System.out.println(ll.removefirst());
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();

	}

}
