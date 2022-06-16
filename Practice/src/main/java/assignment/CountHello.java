package assignment;

import java.util.HashMap;
import java.util.Map;

public class CountHello {
	public static void main(String[] args) {
		String str = "Hellloo";
		char[] cay = str.toCharArray();
		
		Map<Character, Integer> ma= new HashMap<Character, Integer>();
		
		for(char qr:cay) {
			if (ma.containsKey(qr)) {
				ma.put(qr, ma.get(qr)+1);
			} else {
				ma.put(qr, 1);
			}
		}
		
		System.out.print(ma);
	}

}
