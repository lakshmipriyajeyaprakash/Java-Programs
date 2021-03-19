package pack2;
import java.util.Scanner;


public class Validate {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter your String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()==12) {
		validatenumber(s);
		}
		else {
			System.out.println("12 digits should be found");
		}
		System.out.println("Program Ends");
	}
	public static void validatenumber(String s2) {

		try {
		long  i=Long.parseLong(s2.substring(0,3)+s2.substring(4,7));
		validateformat(s2);
		}
		catch(NumberFormatException e) {
		System.out.println("should be a number");
		}
		
	}
	
	
	public static void validateformat(String s1) {
		char c1=s1.charAt(3);
		char c2=s1.charAt(7);
		if(c1=='-'&& c2=='-') {
			System.out.println("valid format");
		}
		else {
			System.out.println("Invalid Format");
		}
	}
		
		
		
	}


