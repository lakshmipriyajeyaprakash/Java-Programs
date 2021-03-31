package pack7;
import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
		System.out.println("Enter the number of Elements to be in an Array:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<=20) {
		System.out.println("Enter the Elements of an Array:");
		int[] a1=new int[input];
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<input;i++) {
			a1[i]=sc1.nextInt();
			
		}
		checkLargestAmongCorner(a1);
		}
		else {
			System.out.println("Number of elements in an array should be less than 20");
		}
		System.out.println("Program Ends.........");
		
	}
	public static void checkLargestAmongCorner(int[] a2) {
		int p=a2[0];
		int q=a2[a2.length-1];
		int r=a2[(a2.length-1)/2];
		System.out.println("Largest among First,Middle and Last Element in an Array........");
		if(p>q)
			System.out.println(p);
		else if(q>r)
		System.out.println(q);
		else
			System.out.println(r);
	 }

}
