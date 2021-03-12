package pack1;
import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int n=sc.nextInt();
		checkSum(n);
		
		
		System.out.println("Program Ends");
	}
	public static int checkSum(int input) {
		int sum=0;
		sum=sum+input;
		if(sum%3==0) {
			System.out.println("sum of digits is odd");
			return 1;
		}
		else {
			System.out.println("sum of digits is even");
			return -1;
			
			
		}
		
		
	}

}
