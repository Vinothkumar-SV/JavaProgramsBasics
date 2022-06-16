package assignment;

import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		names.add("Vinoth");
		names.add("Kumar");
		names.add("Shanmugaraj");
		names.add("Raja");
		names.add("Selvi");
		names.remove(3);
		names.add(1, "Tester");
		names.add("Kumar");
		names.remove("Kumar");
		System.out.println(names);
}
}
