package pack4;

import java.util.Scanner;

public class MiddleString {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String x=checkmiddle(s);
		System.out.println(x);
		System.out.println("Program Ends");
	}
	public static String checkmiddle(String s1) {
		int a1=(s1.length()-1)/2;
		String s2=s1.substring((a1-1),a1+1);
		return s2;
		
		
		
	}

}
