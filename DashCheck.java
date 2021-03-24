package pack3;
import java.util.Scanner;

public class DashCheck {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the first String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Enter the Second String");
		Scanner sc1=new Scanner(System.in);
		String s2=sc1.nextLine();
		int result=dashcheck(s1,s2);
		if(result==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		System.out.println("Program Ends");
	}
	public static int dashcheck(String a1,String a2) {
		int k=0;
		int j=0;
		char[] c1=a1.toCharArray();
		char[] c2=a2.toCharArray();
		for(int i=0;i<c1.length;i++) {
			if(c1[i]=='-') {
				j=i;
				if(c2[j]=='-') {
					k=1;
				}
			}
		}
		return k;		
}
}


