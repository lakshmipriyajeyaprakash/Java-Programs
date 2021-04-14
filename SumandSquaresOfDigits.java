package pack9;
import java.util.Scanner;

public class SumandSquaresOfDigits {
	public static void main(String[] args) {
		System.out.println("Program Starts...........");
		System.out.println("Enter the Input Number:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int result=getSumOfSquaresOfdigits(input);
		System.out.println("Sum of Squares of Digits:"+" "+result);
		System.out.println("Program Ends...........");
		
	}
	public static int getSumOfSquaresOfdigits(int n1) {
		int sum=0;
		Integer i1=n1;
		String s1=i1.toString();
		char[] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++) {
			Character a1=c1[i];
			String b1=a1.toString();
			int n=Integer.parseInt(b1);
			sum=sum+(n*n);
		}
		return sum;
	}

}
