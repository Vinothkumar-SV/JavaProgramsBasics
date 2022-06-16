package automation;

public class StringTochar {

	public static void main(String[] args) {
		
		String str = "Vinoth@2022";
		System.out.println(str.indexOf("V"));
		
		
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(ch[i]);
		}
		
		
		
	}
	
	
}
