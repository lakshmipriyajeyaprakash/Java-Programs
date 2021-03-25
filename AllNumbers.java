package pack6;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AllNumbers {
	public static void main(String[] args) {
		System.out.println("Program Starts......");
		System.out.println("Enter the number of elements in an Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements of the Array:");
		List<Object> a1=new ArrayList<Object>();
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a1.add(sc1.nextLine());
		int result=validateNumbers(a1);
		if(result==1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}
		System.out.println("Program Ends........");
			
		}
	}
	public static int validateNumbers(List<Object> b) {
		int z=0;
		for(int j=0;j<b.size();j++) {
			String s=b.get(j).toString();
			try {
				int x=Integer.parseInt(s);
				z=1;
				 
			}
			catch(NumberFormatException nfe) {
				z=-1;
				 
			}
		}
		return z;
	}
}
