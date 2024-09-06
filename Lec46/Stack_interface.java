package Lec46;

public class Stack_interface implements StackI {

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		System.out.println(StackI.v);
		//StackI.v = StackI.v + 5;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Stack_interface s = new Stack_interface();
	}

}
