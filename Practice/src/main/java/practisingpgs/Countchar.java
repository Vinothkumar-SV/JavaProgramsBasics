package practisingpgs;

import java.util.HashMap;
import java.util.Map.Entry;

public class Countchar {

		
		static void characterCount(String inputString)
	    {
	        HashMap<Character, Integer> MP = new HashMap<Character, Integer>();
	 
	 
	        char[] S = inputString.toCharArray();
	 
	        for (char c : S) {
	            if (MP.containsKey(c)) {
	 
	                MP.put(c, MP.get(c) + 1);
	            }
	            else {
	 
	                MP.put(c, 1);
	            }
	        }
	 
	        // Printing the charCountMap
	        for (Entry<?, ?> entry : MP.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	        String str = "Vinothkumar";
	        characterCount(str);
	    }
	}
	