package automation;

public class Numbers{
public void method() {
	int a = 5;
	
	if(a%2==0)
{
	System.out.println("This is even number :"+a);
}
else
{
	System.out.println("This is odd number :" +a);
}
}
public static void main(String args[]) {
	Numbers num = new Numbers();
	num.method();

	
}
}
