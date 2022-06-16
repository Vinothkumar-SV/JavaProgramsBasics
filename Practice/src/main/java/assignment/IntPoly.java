package assignment;

public class IntPoly {
public static void main(Letter[] args) {
	int r,sum=0,tmp;
	int num=54;
	tmp=num;
	while(num>0) {
		r=num%10;
		sum =(sum*10)+r;
		num = num/10;
		
	}
if(tmp==sum)
{
System.out.println("This is palindrome number");	
}
	
else 
{
	System.out.println("This is not palindrome number");

	}
}
}