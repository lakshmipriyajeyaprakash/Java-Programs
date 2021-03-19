package pack2;
import java.util.Arrays;
import java.util.Scanner;

public class Difference {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the number of elements in an array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a1=new int[n];
		System.out.println("Enter the elements of an array:");
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<a1.length;i++) {
			int j=sc.nextInt();
			a1[i]=j;
			
		}
		difference(a1);
	  System.out.println("Program Ends");
		
		
	}
	public static void difference(int[] a2) {
		if(a2.length!=1) {
		Arrays.sort(a2);
		int x=a2[0];
		int y=a2[a2.length-1];
		int difference=y-x;
		System.out.println(difference);
		}
		else {
			System.out.println(a2[a2.length-1]);
		}
			
		}
	
		
				
				
				
			
		
  
	
}


