package assignment;

public class Palinint {
public static void main(Letter[] args) {
	

 String s="545";
	
	String rev = " ";
	for(int i =s.length()-1;i>=0;i--)
	{
		
    rev = rev+s.charAt(i);
	System.out.println(rev); 
	if(s.equals(rev) )
	{
System.out.println("This is Palindrome ");
	}
		 
	

	else
	{
		System.out.println("This is not a Palindrome");
	}
		
	
}

}
}
