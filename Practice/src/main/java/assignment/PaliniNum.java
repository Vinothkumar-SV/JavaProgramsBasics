package assignment;

public class PaliniNum {
public static void main(Letter[] args) {
String s="123";
String t="545";

	String rev1 = " ";
	String rev2 = " ";
	for(int i =s.length()-1;i>=0;i--)
	
    rev1 = rev1+s.charAt(i);
	System.out.println(rev1);
	
	for(int i =t.length()-1;i>=0;i--)
	
    rev2 = rev2+t.charAt(i);
	
	
	System.out.println(rev2);

	if(s.equals(rev1) )
	{
System.out.println(s+ "This is Palindrome ");
	}
	else {
		System.out.println(s+"This is not palindrome");
	}
		 
	if (t.equals(rev2))
	{
		System.out.println(t+ "This is palindrome");
	}
	else
	{
		System.out.println(t+"This is not a Palindrome");
	}
	

}
	
	
}
