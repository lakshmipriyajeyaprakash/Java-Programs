package pack6;
import java.util.Scanner;

public class CheckFirstLast {
	public static void main(String[] args) {
		System.out.println("Program Starts.......");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		check(s1);
		System.out.println("Program Ends........");
	}
	public static void check(String s2) {
		int sum=0;
		String[] s3=s2.split(" ");
	    String x=s3[0];
		String y=s3[s3.length-1];
		 if(x.equals(y)) {
			 sum=x.length();
		 }
		 else {
			 for(int j=0;j<s3[0].length();j++) {
				 sum++;
			 }
			}
		 System.out.println(sum);
		 
	}

}
