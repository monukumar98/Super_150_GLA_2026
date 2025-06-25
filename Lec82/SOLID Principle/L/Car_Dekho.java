package L;

public class Car_Dekho {
	private Vehicle v;

	public Car_Dekho(Vehicle v) {
		// TODO Auto-generated constructor stub
		this.v = v;
	}

	public void show_Vehicle() {
		System.out.println("Vehicle show kra ");
	}
	public int speed() {
		return v.Speed();
	}

}
