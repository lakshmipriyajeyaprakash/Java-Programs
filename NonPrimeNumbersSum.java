package pack7;
import java.util.Scanner;

public class NonPrimeNumbersSum {
	public static void main(String[] args) {
		System.out.println("Program Starts.........");
		System.out.println("Enter the InputNumber:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		addNumbers(input);
		System.out.println("Program Ends.........");
		
	}
	public static void addNumbers(int n1) {
		int sum=1;
		int i1=2;
		int i2=3;
		int i3=5;
		int i4=7;
		System.out.println("Non Prime Numbers.......");
		System.out.print(sum+" ");
		for(int i=1;i<=n1;i++) {
			if(i!=i1 && i!=i2 && i!=i3 && i!=i4) 
				if(i%2==0 || i%3==0 || i%5==0 || i%7==0) {
					System.out.print(i+" ");
					sum=sum+i;
					}
			}
		       System.out.println();
		       System.out.println(sum);
	}

}
