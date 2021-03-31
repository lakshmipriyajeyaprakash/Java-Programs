package pack6;
import java.util.Scanner;
public class Reversesplit {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Enter the Character to be inserted between:");
		Scanner sc1=new Scanner(System.in);
		char c1=sc1.next().charAt(0);
		reversesplit(s1,c1);
		System.out.println("Program Ends");

	}
	public static void reversesplit(String s2,char c2) {
		char[] c3=s2.toCharArray();
		for(int i=c3.length-1;i>=0;i--) {
			if(i!=0) {
			System.out.print(c3[i]);
			System.out.print(c2);
			}
			else {
				System.out.println(c3[i]);
			}
			
		}
		
	}

}
