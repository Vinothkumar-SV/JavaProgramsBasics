package automation;

public class Stringcompare {
	
public static void main (String args[]) {
	String s1 = "Vinoth";
	String s2 = "Kumar ";
	String s3 = "Vinoth";
	String s4 = "";
	String s5 = "VINOTH";
System.out.println(s1.compareTo(s2));
System.out.println(s1.compareTo(s3));
System.out.println(s4.compareTo(s3));//calculate with empty string
System.out.println(s5.compareTo(s1));
System.out.println(s5.compareToIgnoreCase(s5));
}

} 
