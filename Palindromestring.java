package pack1;
import java.util.Scanner;

public class Palindromestring {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter your input string:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		boolean w=checkpalindrome(s1);
		if(w==true) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not Palidrome");
		}
		System.out.println("Program Ends");
		
	}

	public static boolean checkpalindrome(String s) {
		String input=s;
		boolean bool=false;
        int i=0,j=0;
		StringBuilder sb=new StringBuilder(input);
		sb.reverse();
		if(input.equals(sb.toString())) { 
			i=1;
		}
		if(input.contains("a")||input.contains("e")||input.contains("i")||input.contains("o")
				||input.contains("u")) {
		    j=1;
		}
		
		if(i==1 && j==1) {
			bool=true;
		}
		else {
			bool=false;
		}
		
		return bool;
	
	}
}
