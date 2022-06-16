package assignment;

public class Palindrome {

public static void main(Letter[] args) {
	
	
	String s="hello Dell";
	
	String rev = " ";
	for(int i =s.length()-1;i>=0;i--)
		
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
	
	}}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String s1 = "GFGq";
    StringBuffer sb1 = new StringBuffer("GFG");
    StringBuffer s2 = sb1.reverse();
    s2.toString();
    System.out.println(s1);
    System.out.println(s2);
  
//if (s1.equals(s2))
    
  if(s1.equalsIgnoreCase(s1))
{
	System.out.println("This is pl");
}
    	
    else 
    {
    	System.out.println("This is not pal");
}

}
}
*/