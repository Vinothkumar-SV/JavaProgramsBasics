package assignment;

public class Missingnumary {

	public static void main(String[] args) {
		int ar[] = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20};
		int l = ar.length;
		int res= 0;
		int number = 19;
		int sum = number*((number+1)/2);
		for(int i=0;i<l-1;i++) {
			res = res+ar[i];
		}
		System.out.println(sum - res);
		}
}