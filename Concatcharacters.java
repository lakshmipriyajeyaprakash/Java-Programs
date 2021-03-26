package pack6;
import java.util.Scanner;
import java.util.ArrayList;

public class Concatcharacters {
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
		System.out.println("Enter the number of Strings to be in an array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s1=new String[n];
		System.out.println("Enter the Strings of an array");
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			s1[i]=sc1.next();
		}
		concatCharacters(s1);
		System.out.println("Program Ends.....");
		
  }
	public static void concatCharacters(String[] s2) {
		String s ="";
		for(int i=0;i<s2.length;i++){
			int a=s2[i].length()-1;
			s=s+s2[i].charAt(a);
			}
		System.out.println(s);
		
	}
	
	}



