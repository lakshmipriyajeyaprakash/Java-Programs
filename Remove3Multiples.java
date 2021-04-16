package pack9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Remove3Multiples {
	public static void main(String[] args) {
		System.out.println("Program Starts...............");
		System.out.println("Enter the number of Elements to be in an Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Elements of an Array");
		Scanner sc1=new Scanner(System.in);
		int i=0;
		int[] input=new int[n];
		for(i=0;i<=input.length-1;i++) {
			input[i]=sc1.nextInt();
			}
		remove3multiples(input);
		System.out.println("Program Ends................");
	}
	
	public static void remove3multiples(int[] b1) {
		int n=0;
		int r=0;
		int j=0;
		List<Integer> list=new ArrayList<Integer>();
		for(int k=0;k<b1.length;k++) {
			list.add(b1[k]);
		}
		
		for(j=0;j<list.size();j++) {
			if(j%3!=0) {
			n=list.get(j);
			System.out.print(n+" ");
			
			}
			}
		System.out.println();
		
	}
		
	
		

}
