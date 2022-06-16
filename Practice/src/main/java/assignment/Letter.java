package assignment;

public class Letter {

	public static void main(String [] args) {
	 String s  = "vIn20oth22!";
	 String s1 = s.replaceAll("[^a-z]", "");
	 String s2 = s.replaceAll("[^A-Z]", "");
	 String s3 = s.replaceAll("[^0-9]", "");
	 
	 
	 System.out.println(s1);
	 System.out.println(s2); 
	 System.out.println(s3);
	 System.out.println(s.charAt(10));
	}
	}
