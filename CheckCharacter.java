package pack4;
import java.util.Scanner;

public class CheckCharacter {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int result=checkcharacter(s);
		if(result==1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Program Ends");
		
	}
	public static int checkcharacter(String s1) {
		char c1=s1.charAt(0);
		char c2=s1.charAt(s1.length()-1);
		if(c1==c2) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
