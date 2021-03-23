package Pack5;
import java.util.Scanner;

public class Fibonaccisum {
	public static void main(String[] args) {
	System.out.println("Program Starts");	
	System.out.println("Enter your Input:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	getSumofNfibos(n);
	System.out.println("Program Ends");
	}
	public static void getSumofNfibos(int n1) {
		int sum=0;
		int i=0;
		int j=1;
		for(int k=0;k<n1;k++) {
			sum=i+j;
			i=j;
			j=sum;
			}
		System.out.println(sum);
	}
	
 
}
