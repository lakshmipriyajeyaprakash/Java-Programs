package pack6;
import java.util.Scanner;

public class MeterReading {
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
		System.out.println("Enter the first Input Reading:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the Second Input Reading:");
		Scanner sc1=new Scanner(System.in);
		String input2=sc1.nextLine();
		calculateMeterReading(input1,input2);
		System.out.println("Program Ends......");
	}
	public static void calculateMeterReading(String s1,String s2) {
		int charge=0;
		String s3=s1.substring(0,5);
		String s4=s2.substring(0,5);
		if(s3.equals(s4)) {
			String previousreading=s1.substring(5,10);
			String currentreading=s2.substring(5,10);
			try {
				int i=Integer.parseInt(previousreading);
				int i1=Integer.parseInt(currentreading);
				charge=(i1-i)*4;
				System.out.println("ElectricityBill:"+charge);
				
				
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid Reading not able to Validate");
			}
		}
		else {
			System.out.println("CustomerMetercode Mismatch");
		}
	}
	

}
