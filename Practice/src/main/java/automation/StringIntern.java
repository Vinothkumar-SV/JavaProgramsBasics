package automation;

public class StringIntern {

	public static void main(String[] args) {
		String str1 = new String("Hellow World ").intern();
		//String str2 = str1.intern();
		String str3 =  "Hellow World";
		System.out.println(str1 == str3);
		//System.out.println(str2.equals(str1));
		
		
		
	}
}