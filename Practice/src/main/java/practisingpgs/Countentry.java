package practisingpgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Countentry {
public static void main(String[] args) {
	String S = "VinothVinothS";

	Map<Character, Integer> ns = new HashMap<Character, Integer>();
	char[] cs = S.toCharArray();
	for(char MK:cs) {
		
		if(ns.containsKey(MK)) {
			ns.put(MK, ns.get(MK)+1);
				
			}
		else {
			ns.put(MK, 1);
		}
	}
for(Entry<?, ?> entry : ns.entrySet()) {
	

System.out.println(entry.getKey()+" : "+entry.getValue());

}}


}