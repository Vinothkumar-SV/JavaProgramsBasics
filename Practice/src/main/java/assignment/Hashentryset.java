package assignment;

import java.util.HashMap;
import java.util.Map;

public class Hashentryset {
	public static void main(String[] args) {
		Map<String ,Integer> mapentry = new HashMap<String, Integer>();
		mapentry.put("Vinoth",109 );
		mapentry.put("Michel", 208);
		System.out.println(mapentry);
		
		System.out.println(mapentry.entrySet());
		
	}}
		
		
		
		
		
		
		
		
		
		/* HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		  
	        
	        hash_map.put(10, "Geeks");
	        hash_map.put(15, "4");
	        hash_map.put(20, "Geeks");
	        hash_map.put(25, "Welcomes");
	        hash_map.put(30, "You");
	  
	        // Displaying the HashMap
	        System.out.println("Initial Mappings are: " + hash_map);
	  
	        // Using entrySet() to get the set view
	        System.out.println("The set is: " + hash_map.entrySet());
		
		
	}
	

}
*/