package Lec51;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 78);
		map.put("Ankit", 85);
		map.put("Kunal", 77);
		map.put("Kamlesh", 58);
		map.put("Ankita", 78);
		map.put("Amisha", 68);
		map.put("Mohan", 56);
		map.put("Puneet", 57);
		map.put("Pooja", 77);
		map.put("Amisha", 58);
		System.out.println(map);
		System.out.println(map.get("Amisha"));

	}

}
