package Lec46;

public class Final_Demo {

	int x = 9;
	final int y;

	public Final_Demo(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Demo f = new Final_Demo(2, 9);
		System.out.println(f.x + " " + f.y);
		//f.y = 7;
		Final_Demo f1 = new Final_Demo(12, 19);
		System.out.println(f1.x + " " + f1.y);

	}

}
