package Pack8;
import java.util.Scanner;

public class AdjacentSwaps {
	public static void main(String[] args) {
		System.out.println("Program Starts.......");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.length()<=100) {
		swapPairs(input);
		}
		else {
			System.out.println("Input String should not Exceed 100 characters");
		}
		System.out.println("Program Ends...........");
	}
	public static void swapPairs(String s1) {
		char temp;
		char temp1;
		char temp2;
		if(s1.length()%2==0) {
		char[] c1=s1.toCharArray();
		int i=0;
		for( i=0;i<c1.length-1;i++) {
			if(i%2==0) {
			temp=c1[i];
			c1[i]=c1[i+1];
			temp1=c1[i];
			temp2=temp;
			System.out.print(temp1+""+temp2);
			}
			}
		System.out.println();
		}
		else {
			char[] c1=s1.toCharArray();
			int i=0;
			for( i=0;i<c1.length-1;i++) {
				if(i%2==0) {
				temp=c1[i];
				c1[i]=c1[i+1];
				temp1=c1[i];
				temp2=temp;
				System.out.print(temp1+""+temp2+"");
				}
				}
			System.out.print(c1[c1.length-1]);
			System.out.println();
			
		}
		
		
	}

}
