package pack4;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the Range1:");
		Scanner sc=new Scanner(System.in);
		int range1=sc.nextInt();
		System.out.println("Enter the Range2:");
		Scanner sc1=new Scanner(System.in);
		int range2=sc.nextInt();
		int result=palindrome(range1,range2);
		System.out.println(result);
	}
	public static int palindrome(int n1,int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
		int r = 0, n3 = i;
		while (n3 != 0) {
		r = (r * 10) + (n3 % 10);
		n3 = n3 / 10;
		}
	    if (r == i)
		sum = sum + i;
		}
		return sum;
		}
		
	}


