package practisingpgs;

import java.util.HashMap;
import java.util.Map;

public class Countword {
	public static void main(String[] args) {
		String [] lst = new String [] {"Raja","Baby","Raja","Raja","Baby"};
		Map<String, Integer> cr= new HashMap<String, Integer>();
		for (String sr:lst) {
			if(cr.containsKey(sr))
			{
			cr.put(sr, cr.get(sr)+1);
			}
			else{
				cr.put(sr,1);
			}
			}
			System.out.print(cr);
	}}