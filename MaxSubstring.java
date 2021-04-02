package pack6;
import java.util.Scanner;

public class MaxSubstring {
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
		System.out.println("Enter the String Input:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the DeLimiter:");
		String delimiter=sc.nextLine();
		if(delimiter.length()==1) {
			extractmax(input1,delimiter);
		 	
		}
		else {
			System.out.println("Delimiter length should be 1 ");
		}
		System.out.println("Program Ends.......");
		
	}
	public static void extractmax(String s1,String delimiter1) {
		String maxstring="";
		String[] s2=s1.split(delimiter1);
		for(int i=0;i<s2.length-1;i++) {
			if(s2[i].length()<=s2[i+1].length()) {
				maxstring=s2[i+1];
				}
			else {
				maxstring=s2[i];
			}
		}
		System.out.println(maxstring);
	}

}
