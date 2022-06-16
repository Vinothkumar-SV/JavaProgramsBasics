package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String>LL = new LinkedList<String>();
		LL.add("Red");
		LL.add("Yellow");
		LL.add("Blue");
		LL.add("Green");
		System.out.println(LL);
		
		for(String C:LL) {
			System.out.println(C);
		}
		Iterator<String> p = LL.listIterator(0);
		while (p.hasNext()) {
			System.out.println("This is Iterator "+p.next());
			
		}
		
		Iterator<String> rev = LL.descendingIterator();
		while (rev.hasNext()) {
			System.out.println("This is Reverse "+rev.next());
			
		}
		LL.add(2,"Brown");
		System.out.println("After Adding "+LL);
		
		LL.addFirst("Omega");
		LL.addLast("Violet");
		System.out.println(LL);
		LL.offerFirst("White");
		LL.offerLast("Black");
		System.out.println(LL);
		LL.remove("Omega");
		System.out.println(LL);
		LL.removeLast();
		System.out.println(LL);
		System.out.println("This is Before Swaping"+LL);
		Collections.sort(LL);
		System.out.println("This is sorting "+LL);
		Collections.swap(LL, 0, 3);
		System.out.println("After Sorting And Swapping "+LL);
		System.out.println(LL.pop());
		System.out.println(LL.peekFirst());
		System.out.println(LL.peekLast());
		
		List<String > lst = new ArrayList<String>(LL);
		for(String S:lst) {
			System.out.println("This is Array list"+S);
		}
		
		
	}
	
	
}
