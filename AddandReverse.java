package pack9;
import java.util.Scanner;

public class AddandReverse {
	
	public static void main(String[] args) {
		System.out.println("Program Starts.......");
		System.out.println("Enter the number of Elements in an Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Elements of an Array:");
		Scanner sc1=new Scanner(System.in);
		int[] a1=new int[n];
        for(int i=0;i<n;i++) {
			a1[i]=sc1.nextInt();
			
		}
        System.out.println("Enter the Number to be Compared:");
        Scanner sc2=new Scanner(System.in);
        int n1=sc2.nextInt();
		addReverse(a1,n1);
		System.out.println("Program Ends...........");
		}
	public static void addReverse(int[] b1,int n2) {
		int sum=0;
		for(int i=0;i<b1.length;i++) {
		 if(b1[i]>n2) {
			 sum=sum+b1[i];
		}
		}
		System.out.println(sum);
		Integer k=sum;
		String s1=k.toString();
		char[] c1=s1.toCharArray();
		System.out.println("Reverse of the sum of compared Array Elements......");
		for(int j=c1.length-1;j>=0;j--) {
			System.out.print(c1[j]);
		}
		System.out.println();
		
	}
	

}
