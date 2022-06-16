package automation;

public class StringGetchar {

	public static void main(String[] args) {
		
		 String str = new String("hello javatpoint how r u");  
	      char[] ch = new char[str.length()];  
	      try{  
	         str.getChars(0, 5, ch, 1);  
	         System.out.println(ch);  
	      }catch(Exception ex){System.out.println(ex);}  
	}}  