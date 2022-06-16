package assignment;

public class altrev3 {
	public static void main(String[] args) {
		
	
	String s = "I Want to be a Automtion Tester";
    String[] wordsArr = s.split(" "); 
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i< wordsArr.length; i++){ 
        if(i%2 == 0) 
        	sb.append(wordsArr[i]); 
        else sb.append(new StringBuilder(wordsArr[i]).reverse());
        sb.append(" ");
    }
    System.out.println(sb.toString().trim());
}
}