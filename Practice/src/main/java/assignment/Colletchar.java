package assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class Colletchar {
	public static void main(String[] args) {
		String s = "abcaab";
		char[] chr = s.toCharArray();
		Map<Character, Integer> mapset = new LinkedHashMap<Character, Integer>();
		for(char ch:chr) {
			if (mapset.containsKey(ch)) {
				mapset.put(ch, mapset.get(ch)+1);
			} else {
				mapset.put(ch, 1);
			}
		}
		System.out.println("This is Actual Value"+ mapset);
		
		for(Map.Entry<Character, Integer> wor:mapset.entrySet()) {
			System.out.println(wor);
		}
		}
		}
        