package oopsConcept;

public class STandNonST {
int age = 18;
 static String a= "Vinoth";
	public static void id() {
	 System.out.println("This is static method");
 }
	
	public void dep() {
		System.out.println("This is department method without static ");
	}
	public static void main(String[] args) {
		
	
	STandNonST ss = new STandNonST();
	System.out.println(ss.age);
	ss.dep();
	System.out.println("*******  **********");
	id();
	System.out.println(a);
	
}
}