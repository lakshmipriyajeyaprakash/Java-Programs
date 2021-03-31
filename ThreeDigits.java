package pack7;
import java.util.Scanner;

public class ThreeDigits {
	public static void main(String[] args) {
		System.out.println("Program Starts......");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.length()==7) {
		int result=threedigits(input);
		if(result==1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		}
		else {
			System.out.println("String Length should be 7");
		}
		System.out.println("Program Ends........");
		
	}
	public static int threedigits(String s1) {
		int j=0;
		String s2=s1.substring(0,4);
		String s3=s1.substring(4,7);
		if(s2.equals("CTS-")) {
		char[] c1=s3.toCharArray();
		for(int k=0;k<c1.length;k++) {
			try {
			int i=Integer.parseInt(s3);
			j=1;
			
			}
			catch(NumberFormatException e) {
				j=-1;
			}
		}
		
		}
		
		return j;
		}
	}
	


