package automation;

public class Stringsplit {

	public static void main(String[] args) {
		String s = "This is the program for String split ";
		String[] str = s.split("S",0);
		for(String w:str)
		{
			System.out.println(w);
		}
		
	}

}
