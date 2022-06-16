package automation;

public class StringGetbyte {
public static void main(String[] args) {
	
	String s= "vinoth kumar";
	byte[] vin = s.getBytes();
	for(int i=0;i<vin.length;i++)
	{
		System.out.println(vin[i]);
	}
}}