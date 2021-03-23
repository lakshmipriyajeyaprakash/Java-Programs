package Pack5;
import java.util.Scanner;

public class ExistingCharacters {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter your firstString:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Enter your secondString:");
		String input1=sc.nextLine();
		replaceplus(input,input1);
        System.out.println("Program Ends");
	}
	public static void replaceplus(String s1,String s2) {
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		if(a1.length<=a2.length) {
		for(int i=0;i<a1.length;i++) {
			
			if(a1[i]==a2[i]) {
				System.out.print(a1[i]);
				}
			else {
				System.out.println("+");
				}
		}
		}
		else {
			for(int i=0;i<a2.length;i++) {
				
				if(a1[i]==a2[i]) {
					System.out.print(a1[i]);
					}
				else {
					System.out.println("+");
					}
			
		}
		}	
	}
	}

	
