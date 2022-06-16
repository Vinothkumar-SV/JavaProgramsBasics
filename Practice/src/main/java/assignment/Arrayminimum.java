package assignment;

public class Arrayminimum {
	public static void main(Letter[] args) {
		int ar [] = new int [] {4,8,1,2};
		int min = ar[0];
		int l = ar.length;
		for (int i = 0; i<l;i++) {
			
			if(ar[i]< min)
			
				min = ar[i];
				
		}
			
			System.out.println("This is small number :"+ min);
	}}

