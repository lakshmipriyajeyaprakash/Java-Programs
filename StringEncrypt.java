package Pack5;
import java.util.Scanner;

public class StringEncrypt {
	public static void main (String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter your Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		encrypt(input);
		System.out.println("Program Ends");
	}
	public static void encrypt(String s1) {
		char[] a1=s1.toCharArray();
		for(int i=0;i<=a1.length-1;i++) {
			if(i%2!=0) {
				if(a1[i]=='z')
					System.out.print('a');
				char c1=a1[i];
				int a=c1+1;
				char ch=(char)a;
				System.out.print(ch);
			}
			 else {
				char b=a1[i];
				System.out.print(b);
			}
		}
	}

}
