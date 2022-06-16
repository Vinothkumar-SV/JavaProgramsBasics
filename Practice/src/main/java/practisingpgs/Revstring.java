package practisingpgs;

public class Revstring {
	
	
	public static void main(String[] args) {
		String s = "Vinoth kumar";
		/*String rev="";
		int l = s.length();
		for (int i =l-1;i>=0;i--) {
			rev=""+s.charAt(i);
			System.out.print(" "+rev);
		}}}
		*/
		
		StringBuffer bf = new StringBuffer(s);
		
		System.out.println(bf.reverse());
		
	}}
		
		
		
		
		