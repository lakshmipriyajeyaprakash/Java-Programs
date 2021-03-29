package pack7;
import java.util.Scanner;
public class KaprekarNumber {
public static void main(String[] args) {
	System.out.println("Program Starts.......");
	System.out.println("Enter your Input:");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	int result=getKaprekarNumber(input);
	if(result==1) {
		System.out.println("Kaprekar Number");
	}
	else {
		System.out.println("Not a Kaprekar Number");
	}
	System.out.println("Program Ends........");
}
public static int getKaprekarNumber(int n1) {
	int i=0;
	int sum=0;
	double pow=Math.pow(n1, 2);
	if(pow>100) {
	int rhs=(int)pow%100;
	int lhs=(int)pow/100;
	sum=rhs+lhs;
	if(sum==n1) {
		i=1;
	}
	else {
		i=-1;
	}
	}
	else {
		int rhs=(int)pow%10;
		int lhs=(int)pow/10;
		sum=rhs+lhs;
		if(sum==n1) {
			i=1;
		}
		else {
			i=-1;
		}
		
	}
	return i;
}
}
