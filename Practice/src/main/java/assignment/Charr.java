package assignment;

import java.util.HashMap;

public class Charr {

	public static void main(String[] args) {
		String S = "VinothVinothhhh";
		char[] cs = S.toCharArray();
		HashMap<Character, Integer> ch = new HashMap<Character, Integer>();
		Character ans = null;
		int first = 0, second = 0;
		for (char c : cs) {
			if (!ch.containsKey(c)) {
				ch.put(c, 1);
			} else {
				ch.put(c, ch.get(c) + 1);
			}
		}
		System.out.println(ch);
		for (char c : ch.keySet()) {
			if (ch.get(c) > first) {
				second = first;

				first = ch.get(c);
			} else if (ch.get(c) > second && ch.get(c) < first) {
				second = ch.get(c);
				ans = c;
			}
		}
		System.out.println(ans);
	}

}
