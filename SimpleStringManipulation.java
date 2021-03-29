package pack7;
import java.util.Scanner;

public class SimpleStringManipulation {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
	System.out.println("Enter the Input String:");
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	if(input.length()<=100) {
		int sumofwords=calculateWordSum(input);
		System.out.println(sumofwords);
	}
	System.out.println("Prtogram Ends.........");
}
	public static int calculateWordSum(String s1) {
		int sum=0;
		String[] s2=s1.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[s2.length-1]);
		String x=s2[0].toString();
		String y=s2[s2.length-1].toString();
		if(x.equals(y)) {
			sum=x.length();
		}
		else {
			int a1=x.length();
			int b1=y.length();
			sum=a1+b1;
		}
			
		return sum;
		
	}
}
