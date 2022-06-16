package oopsConcept;

public class Overloading {
	public static void main(String[] args) {
		
		Overloading overld = new Overloading();
		overld.sum();
		overld.sum(20, 15);
		overld.sum("Hai","This is ", "Vinoth Kuamr");
	}

	public void sum() {
		
		System.out.println("This is example of Zero Value");
	}
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(String x,String y, String c) {
		System.out.println(x+y+c);
		
		
	}
	
}
