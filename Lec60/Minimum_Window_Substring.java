package Lec60;

import java.util.HashMap;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC", t = "ABC";
	}

	public static String Minimum_Window(String s, String t) {
		HashMap<Character, Integer> t_map = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (t_map.containsKey(ch)) {
				t_map.put(ch, t_map.get(ch) + 1);
			} else {
				t_map.put(ch, 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			
		}
		return "";
	}

}



