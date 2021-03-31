package pack6;
import java.util.Scanner;

public class StringConcat {
	public static void main(String[] args) {
		System.out.println("Program Starts......");
		System.out.println("Enter the First Input String:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the Second Input String:");
		Scanner sc1=new Scanner(System.in);
		String input2=sc1.nextLine();
		concatString(input1,input2);
		System.out.println("Program Ends.......");
	}
	public static void concatString(String s1,String s2) {
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2);
		if(s1.length()>s2.length()) {
			sb1.delete(0, 3);
			sb1.append(s2);
			System.out.println(sb1);
		}
		else if(s1.length()==s2.length()) {
			sb1.append(s2);
			System.out.println(sb1);
		}
		else {
			sb2.delete(0, 3);
			sb2.append(s1);
			System.out.println(sb2);
			
		}
		
	}

}
