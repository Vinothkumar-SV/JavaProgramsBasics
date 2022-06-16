package assignment;

public class Vowels {
	public static void main(String[] args) {
		String str = "Hello kumar ";
		String s2 = "aeiou";
		System.out.println("Vowels in " +str+"is :");
		for (int i = 0; i < str.length(); i++) {
			//String word = "" + str.charAt(i);
			for (int j = 0; j < s2.length(); j++) {
				//String vowel = "" + s2.charAt(j);
				if (str.charAt(i)==s2.charAt(j)) {
					
					
					System.out.println(str.charAt(i));
				}
			}
		}
	}
}