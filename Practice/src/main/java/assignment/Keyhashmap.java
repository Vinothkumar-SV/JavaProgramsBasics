package assignment;

import java.util.HashMap;
import java.util.Map;

public class Keyhashmap {

	public static void main(String[] args) {
		//int ar [] = new int [] {5,2,10,5,11,10,0};

		Map<Integer, Integer> cr= new HashMap<Integer,Integer>();
		cr.put(1, 0);
		cr.put(2, 1);
		cr.put(5, 5);
		cr.put(5, 5);
		cr.put(8, 0);
		cr.put(2, 8);
			//if(cr.values()==cr.keySet())
			//{
			System.out.println(cr.keySet());
			
			System.out.println(cr.values());
		
			if(cr.keySet()==cr.values()) {
				System.out.println(cr);
			}
			
			
	}}
		/*System.out.println("Map: " + numbers);

		// Access keys of the map
		System.out.println("Keys: " + numbers.keySet());

		// Access values of the map
		System.out.println("Values: " + numbers.values());

		// Access entries of the map
		System.out.println("Entries: " + numbers.entrySet());

		// Remove Elements from the map
		int value = numbers.remove(5);
		System.out.println("Removed Value: " + value);
	}
}
*/