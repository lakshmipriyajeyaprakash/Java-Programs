package pack4;
import java.util.Arrays;
import java.util.Scanner;
public class MaximumDifference {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the number of elements in an array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements of an array");
		int[] a1=new int[n];
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc1.nextInt();
		}
		maximumdifference(a1);
		System.out.println("Program Ends");
		}
	 public static void maximumdifference(int[] a2) {
		 Arrays.sort(a2);
		 System.out.println("--------------Index of Maximum value in an array------------");
		 System.out.println(a2.length-1);//index of Maximum value in an array//
		 System.out.println("--------------Maximum value of an array----------------");
		 System.out.println(a2[a2.length-1]);//Maximum value of an array//
		 int difference=Integer.MIN_VALUE;
		 for(int k=0;k<a2.length-1;k++) {
			 if(a2[k+1]-a2[k]>difference) {
				difference=a2[k+1]-a2[k];
			 }
			 
		 }
		 System.out.println("-------------Maximum difference between array elements-------------");
		 System.out.println(difference);
	 }

}
