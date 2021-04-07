package Pack8;
import java.util.Scanner;

public class Idvalidation {
	public static void main(String[] args) {
		System.out.println("Program Starts.........");
		System.out.println("Enter the First String:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the Second String:");
		Scanner sc1=new Scanner(System.in);
		String input2=sc1.nextLine();
		validateIDLocations(input1,input2);
		System.out.println("Program Ends..........");
	}
	public static void validateIDLocations(String s1,String s2) {
		int i=0;
		String y=null;
		String z=null;
		String s3=s2.substring(0,3);
		String[] a1=s1.split("-");
		String x=a1[i++];
		if(x.equals("CTS")) {
			 y=a1[i++];
		}
		boolean b=y.equals(s3);
		z=a1[i++];
		try {
			int n=Integer.parseInt(z);
			boolean b1=z.length()==4;
			if(b==true && b1==true) {
				System.out.println("Valid Id");
			}
			else {
				System.out.println("Invalid Id");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Id");
		}
		
	}

}
