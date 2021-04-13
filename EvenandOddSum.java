package pack9;
import java.util.Scanner;

public class EvenandOddSum {
	public static void main(String[] args) {
		System.out.println("Program Starts...........");
		System.out.println("Enter the Input Number:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input>0) {
		int result=sumofOddEvenPositioned(input);
		if(result==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}
		else {
			System.out.println("Input Number Should be Positive");
		}
		System.out.println("Program Ends..........");
		
	}
	public static int sumofOddEvenPositioned(int n1) {
		int k=-1;
		int evenSum=0;
		int oddSum=0;
		Integer a=n1;
		String b=a.toString();
		char[] c1=b.toCharArray();
		int i=0;
		for(i=0;i<c1.length;i++) {
			Character d=c1[i];
			String s1=d.toString();
			int n2=Integer.parseInt(s1);
			if(i%2==0) {
				evenSum=evenSum+n2;
				}
			else {
			    oddSum=oddSum+n2;
			}
		}
		if(evenSum==oddSum) {
			k=1;
		}
		return k;
	}

}
