package pack3;
import java.util.Scanner;

public class Evensum {
 public static void main(String[] args) {
	 System.out.println("Program Starts:");
	 System.out.println("Enter the number of elements in an array:");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 if(n<=20) {
	 int[] a1=new int[n];
	 System.out.println("Enter the elements in an array:");
	 Scanner sc1=new Scanner(System.in);
	 for(int i=0;i<n;i++) {
		 int j=sc1.nextInt();
		 a1[i]=j;
		 
	 }
	 evensum(a1);
	 }
	 else {
	 System.out.println("Number of Elements should be less than and Equals to 20");
	 }
	 System.out.println("Program Ends");
	 
}
 public static void evensum(int a2[]) {
	 int sum=0;
	 for(int x=0;x<a2.length;x++) {
		 if(a2[x]%2==0) {
			 sum=sum+a2[x];
		 }
		 else {
		 System.out.println(a2[x]+"Not an Even Number");
		 }
		 
		 }
	 System.out.println(sum);
	 }


}
