package Pack8;
import java.util.ArrayList;
import java.util.Scanner;
public class ConvertFormat {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
		System.out.println("Enter the Input:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String a1=input.substring(3,4);
		String a2=input.substring(7,8);
		if(input.length()==12 && a1.equals("-")&& a2.equals("-")) {
			convertFormat(input);
		}
		else {
			System.out.println("Input length should be equal to 12 and should separated with(-)in specified index");
		}
		System.out.println("Program Ends.........");
	}
	public static void convertFormat(String s1) {
		int n=0;
		try {
		String[] x1=s1.split("-");
		for(int i=0;i<x1.length;i++) {
			String w=x1[i];
			 n=Integer.parseInt(w);
		}
		StringBuffer sb=new StringBuffer(s1);
		sb.delete(3,4);
		sb.delete(6,7);
		System.out.println(sb);
		StringBuffer sb1=sb;
		sb1.insert(2, "-");
		sb1.insert(5,"-");
		sb1.insert(9,"-");
		System.out.println(sb1);
		}
		catch(NumberFormatException e) {
			System.out.println("Not a Number Format...");
		}
		
		
}
	
}
