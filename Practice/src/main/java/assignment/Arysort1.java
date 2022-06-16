package assignment;

public class Arysort1 {
	public static void main(String[] args) {
		int ar[] = new int [] {5,1,0,2,3};
		for (int i = 0; i < ar.length; i++)   
		{  
		for (int j = i + 1; j < ar.length; j++)   
		{  
		int tmp = 0;  
		if (ar[i] > ar[j])   
		{  
		tmp = ar[i];  
		ar[i] = ar[j];  
		ar[j] = tmp;  
		}  
		}  
		System.out.println(ar[i]);  
		}  
		}  
		}  