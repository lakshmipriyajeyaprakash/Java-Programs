package pack3;
import java.util.Scanner;

public class Sumofsquares {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		System.out.println("Enter ArraySize:");
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int a[]=new int[n];
		System.out.println("Enter numbers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			int d=sc.nextInt();
			a[i]=d;
		}
		sumofsquares(a);
		System.out.println("Program Ends");
		
	}
	public static void sumofsquares(int[] a1) {
		int sum=0;
		for(int j=0;j<a1.length;j++) {
			if(a1[j]>0 && a1[j]%2==0) {
				sum=sum+(a1[j]*a1[j]);
				
			}
		
		}
		System.out.println(sum);
	
		
	}
}
		
		
			
		
