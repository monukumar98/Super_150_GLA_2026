package Lec50;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
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
		// map.put(null, 58);
		System.out.println(map);
//		// get
//		System.out.println(map.get("Ankit"));
//		System.out.println(map.get("Rajesh"));
//		// remove
//		System.out.println(map.remove("Ankit"));
//		System.out.println(map.remove("Rajesh"));
//		System.out.println(map);
//		//containskey
//		System.out.println(map.containsKey("Raj"));
//		System.out.println(map.containsKey("Rajesh"));
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 78);
		map1.put("Ankit", 85);
		map1.put("Kunal", 77);
		map1.put("Kamlesh", 58);
		map1.put("Ankita", 78);
		map1.put("Amisha", 68);
		map1.put("Mohan", 56);
		map1.put("Puneet", 57);
		map1.put("Pooja", 77);
		map1.put("Amisha", 58);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 78);
		map2.put("Ankit", 85);
		map2.put("Kunal", 77);
		map2.put("Kamlesh", 58);
		map2.put("Ankita", 78);
		map2.put("Amisha", 68);
		map2.put("Mohan", 56);
		map2.put("Puneet", 57);
		map2.put("Pooja", 77);
		map2.put("Amisha", 58);
		System.out.println(map2);
//		Set<String> s = map.keySet();
//		for(String key:s) {
//			System.out.println(key+" "+map.get(key));
//		}
		for(String key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}

	}

}
