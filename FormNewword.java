package pack4;

import java.util.Scanner;

public class FormNewword {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter the Value:");
		Scanner sc1=new Scanner(System.in);
		int a1=sc1.nextInt();
		String s4=formnewword(s,a1);
		System.out.println(s4);
		System.out.println("Program Ends");
	}
	public static String formnewword(String s1,int b) {
		String s3=s1.substring(0,b)+s1.substring(s1.length()-b,s1.length());
		return s3;
	}

}
