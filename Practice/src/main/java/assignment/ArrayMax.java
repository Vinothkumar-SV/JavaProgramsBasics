package assignment;

public class ArrayMax {
	
	public static void main(Letter[] args) {
		int [] arr = new int [] {4,8,1,2};
		int max = arr[0];
		int len = arr.length;
		for(int i = 0;i<len;i++) {
			
			 if(arr[i] > max)  
			 {
	               max = arr[i];  
	        }  
			
		}
		System.out.println("This is Maximum Number :"+max);
		
		
	}
}