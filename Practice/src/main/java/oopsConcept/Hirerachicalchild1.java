package oopsConcept;

public class Hirerachicalchild1 extends  HirerarchiParent{
public void process() {
	System.out.println("This is the Process  ");
}
	
	public static void main(String[] args) {
		
		Hirerachicalchild1 chd1 =new  Hirerachicalchild1();
		chd1.add(1, 5, 6);
		chd1.String("Vintoh", "Kumar");
	}
}
