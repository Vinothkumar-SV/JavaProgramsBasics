package automation;

public class MultiFun{
	public void add() {
		int a=5;
		int b=6;
		int c= a+b;
		System.out.println("This is addition of two numbers :"+ c);
		
	}
	
	public void sub()
	{
		int a= 4;
		int b= 3;
		int c = a-b;
		System.out.println("This is subtraction of two numbers :"+ c);
		
	}
	
	public void division() {
		int a= 20;
		int b= 9;
		float c= a/b;
		System.out.println("This is division of two numbers :"+ c);
		
	}

	public static void main(String[] args) {
		MultiFun fun = new MultiFun();
		fun.add();
		fun.division();
		fun.sub();
		
		
		
	}
	
	
	
	

}
