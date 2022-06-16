package oopsConcept;

public class Finally {
public static void main(String[] args) {
	int i = 10;
	int k = i/0;
	
	
	
	try {
	System.out.println(k);
}
	catch(ArithmeticException e)
	{
		System.out.println("This is exception");
	}
	
	finally {
	System.out.println(k);
	}}}