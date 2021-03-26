package pack6;
import java.util.Scanner;

public class LastLetters {
	public static void main(String[] args) {
		System.out.println("Program Starts....");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		getLastLetter(s1);
		System.out.println("Program Ends.....");
	}
	public static void getLastLetter(String s2) {
		String[] s3=s2.split(" ");
		for(int i=0;i<s3.length;i++) {
			if(i!=s3.length-1) {
			char[] c1=s3[i].toCharArray();
			Character c2=c1[c1.length-1];
			String last=c2.toString().toUpperCase();
			System.out.print(last);
			System.out.print("$");
			}
			else {
				char[] c1=s3[i].toCharArray();
				Character c2=c1[c1.length-1];
				String last=c2.toString().toUpperCase();
				System.out.println(last);
				}
			
		}
	}

}
