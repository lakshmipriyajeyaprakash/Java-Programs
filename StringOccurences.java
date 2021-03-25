package pack4;
import java.util.Scanner;

public class StringOccurences {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the First InputString:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the Second InputString:");
		Scanner sc1=new Scanner(System.in);
		String input2=sc.nextLine();
		if(input1.length()<=100 && input2.length()<=100) {
		UserMaincode.countNoofWords(input1,input2);
		}
		else {
			System.out.println("Input words should have count less than equal to 100");
		}
		System.out.println("Program Ends");
	}

}
class UserMaincode{
	public static void countNoofWords(String s1,String s2) {
		String[] a1=s1.split(" ");
		String[] a2=s2.split(" ");
		String y=a2[1];
		int count=0;
		int i=0;
		for(i=0;i<a1.length;i++) {
			String x=a1[i];
			if(x.equals(y)) {
				count++;
			}
			}
		 System.out.println(count);
}
	
}
