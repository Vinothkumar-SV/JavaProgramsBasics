package assignment;

import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		
	
	HashSet<String > names= new HashSet<String>();
	names.add("Vinoth");//
	names.add("Kumar");//
	names.add("Shanmugaraj");
	names.add("Raja");
	names.add("Selvi");
	names.remove("Vinoth");//duplicate
	names.add("Raja");
	names.add("Kumar");//duplicate
	names.remove("Kumar");//
System.out.println(names);
}}
