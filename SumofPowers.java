package pack3;
import java.util.Scanner;

public class SumofPowers {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the number of elements to be in an Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements of an Array:");
		Scanner sc1=new Scanner(System.in);
		int[] a1=new int[n];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc1.nextInt();
			}
		sumofpowers(a1);
		System.out.println("Program Ends");
		
	}
	public static void sumofpowers(int[] a2) {
		double sum=0;
		for(int j=0;j<a2.length;j++) {
			sum=sum+Math.pow(a2[j], j);
			}
		System.out.println(sum);
		
	}

}
