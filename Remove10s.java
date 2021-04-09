package pack9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Remove10s {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
		System.out.println("Enter the number of Elements to be in an array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Elements of an array:");
		Scanner sc1=new Scanner(System.in);
		int[] a1=new int[n];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc1.nextInt();
		}
		remove10s(a1);
		System.out.println("Program Ends.......");
	}
	public static void remove10s(int[] b1) {
		int n=0;
		int r=0;
		int j=0;
		List<Integer> list=new ArrayList<Integer>();
		for(int k=0;k<b1.length;k++) {
			list.add(b1[k]);
		}
		
		for(j=0;j<list.size();j++) {
			n=list.get(j);
			boolean x=n%10==0;
			if(x==true) {
			 list.set(j, 0);
			}
			}
		System.out.println(list);
	}

}
