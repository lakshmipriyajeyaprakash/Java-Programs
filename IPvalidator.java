package Pack8;
import java.util.Scanner;

public class IPvalidator {
	public static void main(String[] args) {
	System.out.println("Program Starts..........");
	System.out.println("Enter the Input String:");
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	String x1=input.substring(3,4);
	String x2=input.substring(7,8);
	String x3=input.substring(11,12);
	if(input.length()==15 && x1.equals(".")&& x2.equals(".")&& x3.equals(".")) {
	 int result=ipValidator(input);
	 if(result==1) {
		 System.out.println("Valid IP");
	 }
	 else {
		 System.out.println("InValid IP");
	 }
	}
	else {
		System.out.println("IP Address should be of Length 15 and should separated by fullstop");
	}
	System.out.println("Program Ends..........");
	
	}
	public static int ipValidator(String s1) {
		int a=0,b=0,c=0,d=0;
		int i=2;
		System.out.println(s1);
		String a1=s1.substring(0,3);
		String a2=s1.substring(4,7);
		String a3=s1.substring(8,11);
		String a4=s1.substring(12,15);
		
		try {
		    a=Integer.parseInt(a1);
			}
		catch(NumberFormatException e) {
		
		}
		try {
		    b=Integer.parseInt(a2);
			}
		catch(NumberFormatException e) {
		}
		try {
		    c=Integer.parseInt(a3);
			}
		catch(NumberFormatException e) {
		}
		try {
		    d=Integer.parseInt(a4);
			}
		catch(NumberFormatException e) {
			
		}
		if((a>0 && a<255)&&(b>0 && b<255)&&(c>0 && c<255)&&(d>0 && d<255)) {
			i=1;
		}
		
		
	return i;	
		
	}

}
