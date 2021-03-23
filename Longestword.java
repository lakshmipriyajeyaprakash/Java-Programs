package Pack5;
import java.util.Scanner;

public class Longestword {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter your Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		longestword(input);
		System.out.println("Program Ends");
	}
	public static void longestword(String s1) {
		int temp=0;
		int i=0;
		String[] a1=s1.split(" ");
		for(i=0;i<a1.length-1;i++) {
			if(a1[i].length()>a1[i+1].length()) {
				temp=a1[i].length();
			
			}
			else {
				temp=a1[i+1].length();
				
			}
			if(a1[i].length()==temp) {
		    	System.out.println(a1[i]);
		    }
			}
		    System.out.println(temp);
		    
		    }
		    
		 }
	


