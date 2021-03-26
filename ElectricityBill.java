package pack6;
import java.util.Scanner;

public class ElectricityBill {
public static void main(String[] args) {
	System.out.println("Program Starts......");
	System.out.println("Enter the first input Reading:");
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	System.out.println("Enter the Second Input Reading:");
	Scanner sc1=new Scanner(System.in);
	String input2=sc1.nextLine();
	System.out.println("Enter the perunit charge:");
	Scanner sc2=new Scanner(System.in);
	int unitcharge=sc2.nextInt();
	calculateElectricityBill(input1,input2,unitcharge);
	System.out.println("Program Ends......");
}
public static void calculateElectricityBill(String a1,String a2,int charge) {
	int currentunit=0;
	int amount=0;
	int i=0;
	int i1=0;
	String customernumber=a1.substring(0,5);
	String previousreading=a1.substring(5,10);
	String currentreading=a2.substring(5,10);
	try {
	 i=Integer.parseInt(previousreading);
	 i1=Integer.parseInt(currentreading);
	currentunit=i1-i;
	amount=currentunit*charge;
	System.out.println("ElectricityBillAmount:"+amount);
	}
	catch(NumberFormatException e) {
		System.out.println("Invalid Reading try again with correct Reading");
	}
	
}
}
