package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listpgms {
	
	public static void main(String[] args) {
		ArrayList<String> listcolor= new ArrayList<String>() ;
		listcolor.add("Violet");
		listcolor.add("Indigo");
		listcolor.add("Blue");
		listcolor.add("Green");
		listcolor.add("Orange");
		listcolor.add("Red");
			System.out.println(listcolor);
			@SuppressWarnings("unchecked")
			ArrayList<String >clonecr = (ArrayList<String>)listcolor.clone();
			System.out.println(clonecr);
	
			Collections.sort(listcolor);
			System.out.println(listcolor);
		
			for(Object element:listcolor) {
				System.out.println(element);
				Object element1 = listcolor.get(0);
				element1= listcolor.get(3);
				System.out.println(element1);
			}
				listcolor.add(0, "Vinoth");
				System.out.println(listcolor);
				listcolor.set(5, "Omega");
				System.out.println(listcolor);
				listcolor.remove(5);
				System.out.println(listcolor);
				if(listcolor.contains("Indigo")) {
					System.out.println("Element is found");
				}
				else {
					System.out.println("Element is not found");
				}
				
				List<String> ls=new ArrayList<String>();
				ls.add("A");
				ls.add("b");
				ls.add("c");
				ls.add("d");
				ls.add("e");
				ls.add("f");
				System.out.println(ls);
				
				
				Collections.copy(listcolor, ls);
			
				System.out.println("***********This is After Copy ******");
				
				System.out.println(ls);
				List<String> portion = listcolor.subList(0, 3);
				System.out.println("This is extract portion 0 to 3 "+portion);
				
				System.out.println(listcolor);
				
				Collections.shuffle(listcolor);
				System.out.println("This is Shuffle :"+listcolor);
				
				Collections.reverse(listcolor);
				System.out.println("This is reverse"+listcolor);
				
				
				List<String>lv= new ArrayList<String>();
				for(String C:listcolor) {
					lv.add(ls.contains(C)?"Yes":"NO");
					System.out.println(lv);
				}
				
				Collections.swap(listcolor, 0, 2);
				for(String h:listcolor) {
					System.out.println(h);
				}
				
				
				ArrayList<String>A = new ArrayList<String>();
				A.addAll(listcolor);
				A.addAll(ls);
				A.addAll(lv);
				System.out.println("This is joining array"+A+"***************");
				
				
	}
	
	}

