package Pack8;
import java.util.Scanner;

public class Sumofcubessquares {
	public static void main(String[] args) {
	System.out.println("Program Starts........");
	System.out.println("Enter the Number of Elements to be in an Array: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter the Values of an Array:");
	Scanner sc1=new Scanner(System.in);
	int[] a1=new int[n];
	for(int i=0;i<n;i++) {
		a1[i]=sc1.nextInt();
		}
	sumOfCubesSquares(a1);
	System.out.println("Program Ends.........");
	}
	
	public static void sumOfCubesSquares(int[] a2) {
		int temp=0;
		int temp1=0;
		int sum=0;
		for(int i=0;i<a2.length;i++) {
			if(a2[i]%2==0) {
				temp=(int)Math.pow(a2[i], 2);
				sum=sum+temp;
			}
			else {
			temp1=(int)Math.pow(a2[i], 3);
			sum=sum+temp1;
			}
		}
		System.out.println("Sum of Squares(Even) and Cubes(Odd).....");
		System.out.println(sum);
		
	}
	
}
