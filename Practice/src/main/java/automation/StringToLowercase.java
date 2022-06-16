package automation;

import java.util.Scanner;

public class StringToLowercase {
	public static void main(String[] args) {
		String s;
		String v;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		s= sc.nextLine();
		v=sc.nextLine();
		String str =s.toLowerCase();
		String str1 = v.toUpperCase();
	System.out.println(str);
	System.out.println(str1);
	}
	
}