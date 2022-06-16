package javaPrograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.commons.collections4.map.HashedMap;

public class Hashmap2 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Value" );
		
		
	String  F = in.nextLine();	
	char [] c=  F.toCharArray();

	Map<Character, Integer> ref = new HashedMap<Character, Integer>();
	
	for (int i =0;i<c.length;i++) {
		char key= c[i];
		if(ref.containsKey(key)) {
			int count = ref.get(key)+1;
			ref.put(key, count);
		}
		else {
			ref.put(key, 1);
		}
		
	}

	for(Entry<Character, Integer> val:ref.entrySet()) {
	System.out.println(val.getKey()+" : "+val.getValue());
	}
	
	}}