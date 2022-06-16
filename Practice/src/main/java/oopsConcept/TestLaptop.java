package oopsConcept;

public class TestLaptop {

	public static void main(String[] args) {
	
		
	Dell  dp  = new Dell();
	dp.simple();
	dp.battery();
	dp.weight();
	dp.charging();
	System.out.println("********");
	Laptop LP = new Laptop();
	LP.weight();
	LP.battery();
	System.out.println("//////");
	Laptop lp = new Dell();
	lp.battery();
	lp.simple();
		
	}

}
