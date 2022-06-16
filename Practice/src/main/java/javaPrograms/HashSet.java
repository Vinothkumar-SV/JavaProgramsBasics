package javaPrograms;

import java.util.Set;
import java.util.TreeSet;

public class HashSet {
	
	public static void main(String[] args) {
		
java.util.HashSet<String >	HS = new java.util.HashSet<String>();
HS.add("Red");
HS.add("Yellow");
HS.add("bulue");
HS.add("Black");
HS.add("Green");


System.out.println(HS);


String[] sr = new String [HS.size()];
HS.toArray(sr);
for(String C:sr) {
	System.out.println(C);
}

Set<String > tree = new TreeSet<String>(HS) ;
for(String TR:tree) {
	System.out.println(TR);
}


System.out.println(HS.size());
for (String C:HS) {
	System.out.println(C);
@SuppressWarnings("unchecked")
java.util.HashSet<String >clonecr =  (java.util.HashSet<String>)HS.clone();
System.out.println(clonecr);
}
}
}