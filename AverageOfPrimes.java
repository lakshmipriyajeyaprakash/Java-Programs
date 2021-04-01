package pack7;
import java.util.Scanner;

public class AverageOfPrimes {
	public static void main(String[] args) {
		System.out.println("Program Starts..........");
		System.out.println("Enter the number of Elements to be in an Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=3 && n<=20) {
			System.out.println("Enter the Elements of an array:");
			int[] a1=new int[n];
			Scanner sc1=new Scanner(System.in);
			for(int i=0;i<n;i++) {
				a1[i]=sc1.nextInt();
			}
			int result=(int)averageOfPrimes(a1);
			System.out.println("Average Of Primes:"+result);
			
		}
		else {
			System.out.println("Number of Elements should between 3 and 20 (inclusive 3,20)");
		}
		System.out.println("Program Ends................");
	}
	public static double averageOfPrimes(int[] a2) {
		int n1=2;
		int n2=3;
		int sum=0;
		double avg=0;
		int count=0;
		for(int j=0;j<a2.length;j++) {
			
			if(a2[j]==2||a2[j]==3||a2[j]==5||a2[j]==7) {
				sum=sum+a2[j];
				count++;
			}
			else if(a2[j]%2!=0 && a2[j]%3!=0 && a2[j]%5!=0 && a2[j]%7!=0) {
				sum=sum+a2[j];
				count++;
				
			}
			}
		System.out.println("Sum Of Primes:"+sum);
		System.out.println("count of Primes:"+count);
		try {
		avg=sum/count;
		}
		catch(ArithmeticException e) {
			System.out.println("No Primes Found");
		}
		return avg;
		
	}

}
