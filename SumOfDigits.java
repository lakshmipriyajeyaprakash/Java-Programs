package pack6;
import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
	System.out.println("Program Starts.........");
	System.out.println("Enter the Input:");
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	sumOfDigits(input);
	System.out.println("Program Ends...........");
	
}
public static void sumOfDigits(String s1) {
	int sum=0;
	char[] a1=s1.toCharArray();
	for(int i=0;i<a1.length;i++) {
		Character x=a1[i];
		String y=x.toString();
		try {
			int z=Integer.parseInt(y);
			sum=sum+z;
			}
		catch(NumberFormatException e) {
			
		}
		}
	    if(sum!=0) {
	    System.out.println(sum);
	   }
	else {
		System.out.println("-1");
	}
	
}
}
